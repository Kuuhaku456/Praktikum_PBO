package manga_project;
import java.io.IOException;
import java.util.ArrayList;
public class Admin extends Akun {
    private ArrayList <Manga> Manga;
    private ArrayList <User> DataUser;
    private String priv;
    
    public Admin(String username, String pass, String nama, String jenis_kelamin, String priv, ArrayList <User> data){
        super(username, pass, nama, jenis_kelamin);
        this.priv = priv;
        this.DataUser = data;
        Manga = new ArrayList<>();
    }
    
    public String getpriv(){
        return priv;
    }
    
    public void setpriv(String priv){
        this.priv = priv;
    }
    
    public ArrayList<Manga> getManga(){
        return Manga;
    }
    
    public void setKelas(ArrayList<Manga> manga){
        this.Manga = manga;
    }
    
    @Override
    protected void profile(){
        clear();
        System.out.println("====================================");
        super.profile();
        System.out.println("Privillage        >> " + this.priv);
        System.out.println("====================================");
    }
    
    public void nambah() throws IOException{
        clear();
        System.out.println("=================");
        System.out.println("NAMBAH DATA MANGA");
        System.out.println("=================");
        System.out.println("Ingin menambah berapa data >> ");
        int batas = error_int();
        for(int i = 0; i < batas; i++){
            System.out.print("Masukkan ID Manga              >> ");
            int ID = error_int();
            System.out.print("Masukkan judul manga           >> ");            
            String judul = input.readLine();
            System.out.print("Masukkan genre manga           >> ");
            String genre = input.readLine();
            System.out.print("Masukkan Tahun Rilis Manga     >> ");
            int tahun = error_int();
            System.out.print("Masukkan penulis Manga         >> ");
            String penulis = input.readLine();
            System.out.print("Masukkan Jumlah Chapter Manga  >> ");
            int chapter = error_int();
            Manga new_data = new Manga(ID, judul, chapter, genre, tahun, penulis);
            this.Manga.add(new_data);
        }
        System.out.println("===============================");
        System.out.println("Data Berhasil Ditambah Tuan >_<");
        System.out.println("===============================");
    }
    
    @Override
    protected void lihat(){
        if(this.Manga.isEmpty()){
            clear();
            System.err.println("==========================");
            System.err.println("Data masih kosong Tuan >_<");
            System.err.println("==========================");
        }else{
            clear();
            System.out.println("================");
            System.out.println("LIHAT DATA MANGA");
            System.out.println("================");
            for(Manga m : this.Manga){
                System.out.println("==========================================================================================================================================================");
                System.out.println("\n| ID MANGA |\tJUDUL MANGA            |\tGENRE                 |\tTAHUN RILIS\t         |\tPENULIS\t        |\tJUMLAH CHAPTER\t        |");
                System.out.println("==========================================================================================================================================================");
                System.out.printf("|\t%-20s  ", m.getID());
                System.out.printf("|\t%-20s   ", m.getJudul());
                System.out.printf("|\t%-20s    ", m.getGenre());
                System.out.printf("|\t%-20s   ", m.getTahun_rilis());
                System.out.printf("|\t%-20s   ", m.getPenulis());
                System.out.printf("|\t%-20s   |", m.getChapter());
                System.out.println("\n");
            }
        }
    }
    
    public void update() throws IOException{
        boolean lanjut = true;
        if(this.Manga.isEmpty()){
            clear();
            System.out.println("==========================");
            System.out.println("Data masih kosong Tuan >_<");
            System.out.println("==========================");
        }
        else{
            clear();
            System.out.println("=================");
            System.out.println("UPDATE DATA MANGA");
            System.out.println("=================");
            System.out.println("Masukkan judul Manga >> ");
            String Jdl = input.readLine();
            for (Manga manga : Manga){
                if(manga.getJudul().equals(Jdl)){
                    System.out.println("==========================================================================================================================================================");
                    System.out.println("\n| ID MANGA |\tJUDUL MANGA            |\tGENRE                 |\tTAHUN RILIS\t         |\tPENULIS\t        |\tJUMLAH CHAPTER\t        |");
                    System.out.println("==========================================================================================================================================================");
                    System.out.printf("|\t%-20s  ", manga.getID());
                    System.out.printf("|\t%-20s   ", manga.getJudul());
                    System.out.printf("|\t%-20s    ", manga.getGenre());
                    System.out.printf("|\t%-20s   ", manga.getTahun_rilis());
                    System.out.printf("|\t%-20s   ", manga.getPenulis());
                    System.out.printf("|\t%-20s   |", manga.getChapter());
                    System.out.println("\n");
                    while(lanjut){
                        System.out.println("1. Ubah Judul");
                        System.out.println("2. Ubah Genre");
                        System.out.println("3. Ubah Tahun Rilis");
                        System.out.println("4. Ubah Penulis");
                        System.out.println("5. Ubah Jumlah Chapter");
                        System.out.print("Masukkan pilihan Anda >> ");
                        int pilihan = error_int();
                        switch(pilihan){
                            case 1 -> {
                                System.out.print("Masukkan judul Manga Baru >> ");
                                manga.setjudul(input.readLine());
                            }
                            case 2 -> {
                                System.out.print("Masukkan Genre Manga Baru >> ");
                                manga.setGenre(input.readLine());
                            }
                            case 3 -> {
                                System.out.print("Masukkan Tahun Rilis Baru >> ");
                                manga.setTahun(error_int());
                            }
                            case 4 -> {
                                System.out.print("Masukkan Nama penulis Baru >> ");
                                manga.setPenulis(input.readLine());
                            }
                            case 5 -> {
                                System.out.print("Masukkan jumlah chapter baru >> ");
                                manga.setChapter(error_int());
                            }
                            default -> {
                                System.out.println("==========================");
                                System.out.println("Pilihan tidak ada Tuan >_<");
                                System.out.println("==========================");
                            }
                        }
                        lanjut = ulang("ada lagi yang ingin dirubah");
                    }
                }
            }
        }
    }

    protected final void delete() throws IOException{
        clear();
        System.out.println("================");
        System.out.println("HAPUS DATA MANGA");
        System.out.println("================");
        System.out.print("Masukkan judul Manga >> ");
        String jdl = input.readLine();
        for(int i =0; i < this.Manga.size(); i++){
            if(Manga.get(i).getJudul().equals(jdl)){
                System.out.println("==========================================================================================================================================================");
                System.out.println("\n| ID MANGA |\tJUDUL MANGA            |\tGENRE                 |\tTAHUN RILIS\t         |\tPENULIS\t        |\tJUMLAH CHAPTER\t        |");
                System.out.println("==========================================================================================================================================================");
                System.out.printf("|\t%-20s  ", Manga.get(i).getID());
                System.out.printf("|\t%-20s   ", Manga.get(i).getJudul());
                System.out.printf("|\t%-20s    ", Manga.get(i).getGenre());
                System.out.printf("|\t%-20s   ", Manga.get(i).getTahun_rilis());
                System.out.printf("|\t%-20s   ", Manga.get(i).getPenulis());
                System.out.printf("|\t%-20s   |", Manga.get(i).getChapter());
                System.out.println("\n");
                System.out.println("Yakin ingin menghapus Data [Y/N] >>> ");
                String yakin = input.readLine();
                if(yakin.equalsIgnoreCase("y")){
                    this.Manga.remove(i);
                    System.out.println("==============================");
                    System.out.println("Data berhasil dihapus Tuan >_<");
                    System.out.println("==============================");
                }
                else if(yakin.equalsIgnoreCase("n")){
                    System.out.println("====================================");
                    System.out.println("Data tidak berhasil dihapus Tuan >_<");
                    System.out.println("====================================");
                }
                else{
                    System.err.println("=======================");
                    System.err.println("= Error 404 Not Found =");
                    System.err.println("=======================");
                }
            }
        }
    }

    @Override
    protected void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
    @Override
    protected void menu() throws IOException{
        try{
            while(true){
                clear();
                System.out.println("============================");
                System.out.println("=        MENU ADMIN        =");
                System.out.println("============================");
                System.out.println("= 1. Nambah data Manga     =");
                System.out.println("= 2. Lihat  data Manga     =");
                System.out.println("= 3. Update data Manga     =");
                System.out.println("= 4. Hapus  data Manga     =");
                System.out.println("= 5. Profile               =");
                System.out.println("= 6. Log Out               =");
                System.out.println("============================");
                System.out.print("masukkan pilihan anda >> ");
                int pilihan = error_int();
                switch(pilihan){
                    case 1 -> {
                        nambah();
                        System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
                    }
                    case 2 -> {
                        lihat();
                        System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
                    }
                    case 3 -> {
                        update();
                        System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
                    }
                    case 4 -> {
                        delete();
                        System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
                    }
                    case 5 -> {
                        profile();
                        System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
                    }
                    case 6 -> {
                        return;
                    }
                    default -> {
                        System.out.println("==========================");
                        System.out.println("Pilihan tidak Ada Tuan >_<");
                        System.out.println("==========================");
                    }
                }
            }  
        }catch (IOException e){
            System.err.println(e);
        }
        
    }
}
