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
    
    void display(){
        System.out.printf("|\t%-20s  ", this.judul_anime);
        System.out.printf("|\t%-20s   ", this.Studio);
        System.out.printf("|\t%-20s    ", this.tahun_rilis);
        System.out.printf("|\t%-20s   ", this.Produser);
        System.out.printf("|\t%-20s   |", this.jumlah_episode);
        System.out.println("\n");
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
    
}

