package manga_project;

import java.util.*;
public class Manga {
    private int id_manga;
    private String judul_manga;
    private int jumlah_chapter;
    private String genre;
    private int tahun_rilis;
    private String penulis;
    private static ArrayList<Manga> Manga =  new ArrayList<>();
    Manga(int id, String judul, int chapter, String genre, int thn_rlis, String penulis){
        this.id_manga = id;
        this.judul_manga = judul;
        this.jumlah_chapter = chapter;
        this.genre = genre;
        this.tahun_rilis = thn_rlis;
        this.penulis = penulis;
        Manga.add(this);
    }

    public static ArrayList <Manga> getManga(){
        return Manga;
    }

    public static void display_manga(){
        if(Manga.isEmpty()){
            System.out.println("==========================");
            System.out.println("Data masih kosonh tuan >_<");
            System.out.println("==========================");
        }else{
            for(Manga manga : Manga){
                System.out.println("==========================================================================================================================================================");
                System.out.println("\n| ID MANGA |\tJUDUL MANGA            |\tGENRE                 |\tTAHUN RILIS\t         |\tPENULIS\t        |\tJUMLAH CHAPTER\t        |");
                System.out.println("==========================================================================================================================================================");
                System.out.printf("|\t%-20s  ", manga.id_manga);
                System.out.printf("|\t%-20s   ", manga.judul_manga);
                System.out.printf("|\t%-20s    ", manga.genre);
                System.out.printf("|\t%-20s   ", manga.tahun_rilis);
                System.out.printf("|\t%-20s   ", manga.penulis);
                System.out.printf("|\t%-20s   |", manga.jumlah_chapter);
                System.out.println("\n");
            }
        }
    }
    
    public void setid(int id){
        this.id_manga = id;
    }

    public void setjudul(String judul){
        this.judul_manga = judul;
    }

    public void setChapter(int chap){
        this.jumlah_chapter = chap;
    }

    public void setGenre(String Genre){
        this.genre = Genre;
    }

    public void setTahun(int tahun){
        this.tahun_rilis = tahun;
    }

    public int getID(){
        return id_manga;
    }

    public String getJudul(){
        return judul_manga;
    }

    public int getChapter(){
        return jumlah_chapter;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    
    public String getPenulis(){
        return penulis;
    }
    
    public String getGenre(){
        return genre;
    }

    public int getTahun_rilis(){
        return tahun_rilis;
    }
}
