package Posttest_2;

package posttest_1;

class Anime {
    private int tahun_rilis;
    private String judul_anime;
    private String Studio;
    private String Produser;
    private int jumlah_episode;
    
    Anime(String judul, int tahun_rilis, String Studio, String produser, int eps){
        this.judul_anime = judul;
        this.Studio = Studio;
        this.tahun_rilis = tahun_rilis;
        this.Produser = produser;
        this.jumlah_episode = eps;
    }
    
    public void SetJudul(String judul){
        this.judul_anime = judul;
    }
    
    public void setTahun(int tahun){
        this.tahun_rilis = tahun;
    }
    
    public void setStudio(String Studio){
        this.Studio = Studio;
    }
    
    public void setProduser (String Produser){
        this.Produser = Produser;
    }
    
    public void setjumlah_episode (int jumlah_eps){
        this.jumlah_episode = jumlah_eps;
    }
    
    public String getJudul(){
        return judul_anime;
    }

    public String getStudio(){
        return Studio;
    }

    public int getTahun(){
        return tahun_rilis;
    }

    public String getproduser(){
        return Produser;
    }

    public int getEpisode(){
        return jumlah_episode;
    }
}


