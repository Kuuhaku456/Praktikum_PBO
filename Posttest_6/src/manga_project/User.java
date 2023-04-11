
package manga_project;

import java.io.IOException;
import java.util.ArrayList;

public class User extends Akun implements userinterface {
    private ArrayList <Manga> Manga;
    private String priv;
    public User(String username, String pass, String nama, String jenis_kelamin, String priv) {
        super(username, pass, nama, jenis_kelamin);
        this.priv = priv;
        Manga = new ArrayList<>();
    }
    
    @Override
    protected void profile(){
        clear();
        System.out.println("====================================");
        super.profile();
        System.out.println("Privillage        >> " + this.priv);
        System.out.println("====================================");
    }

    protected void profile(boolean show){
        if(show)profile();
        else super.profile();
    }
    @Override
    public void read() throws IOException {
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
                System.out.printf("|\t%-10s  ", m.getID());
                System.out.printf("|\t%-20s   ", m.getJudul());
                System.out.printf("|\t%-20s    ", m.getGenre());
                System.out.printf("|\t%-20s   ", m.getTahun_rilis());
                System.out.printf("|\t%-20s   ", m.getPenulis());
                System.out.printf("|\t%-20s   |", m.getChapter());
                System.out.println("\n");
            }
        }
    }
    @Override
    public void search() throws IOException{
        System.out.println("====================");
        System.out.println("Searching Data Manga");
        System.out.println("====================");
        System.out.print("Masukkan nama Manga >>");
        String nama = input.readLine();
        for(Manga manga : Manga){
            if(manga.getJudul().equals(nama)){
                System.out.println("==========================================================================================================================================================");
                System.out.println("\n| ID MANGA |\tJUDUL MANGA            |\tGENRE                 |\tTAHUN RILIS\t         |\tPENULIS\t        |\tJUMLAH CHAPTER\t        |");
                System.out.println("==========================================================================================================================================================");
                System.out.printf("|\t%-20s  ", manga.getID());
                System.out.printf("|\t%-20s   ", manga.getJudul());
                System.out.printf("|\t%-20s    ", manga.getGenre());
                System.out.printf("|\t%-20s   ", manga.getTahun_rilis());
                System.out.printf("|\t%-20s   ", manga.getPenulis());
                System.out.printf("|\t%-20s   |", manga.getChapter());
            }
            else{
                System.out.println("=============================");
                System.out.println("Data tidak ditemukan Tuan >_<");
                System.out.println("=============================");
            }
        }
    }
    
    @Override
    protected void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    @Override
    protected void menu() throws IOException {
        try{
            while(true){
                clear();
                System.out.println("=====================================");
                System.out.println("= SELAMAT DATANG USER TERSAYANG >_< =");
                System.out.println("=====================================");
                System.out.println("= 1. Lihat     data Manga           =");
                System.out.println("= 2. Searching data Manga           =");
                System.out.println("= 3. Profile                        =");
                System.out.println("= 4. Log Out                        =");
                System.out.println("=====================================");
                System.out.print("masukkan pilihan anda >> ");
                int pilihan = error_int();
                switch(pilihan){
                    case 1 -> {
                        read();
                        System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
                    }
                    case 2 -> {
                        search();
                        System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
                    }
                    case 3 -> {
                        profile(true);
                        System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
                    }
                    case 4 -> {
                        System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
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
