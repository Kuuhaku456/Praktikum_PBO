/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest_2;
import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private int batasan;
    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(p);
    private static ArrayList<Anime> DataAnime = new ArrayList<>();    
    private static ArrayList<akun> DataAkun = new ArrayList<>();
    private static Console cnsl = System.console();
    private static void sleep(int sec){
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException{
        DataAnime.add(new Anime("Naruto", 2006, "pierrot", "Aniplex", 500));
        DataAnime.add(new Anime("Bleach", 2007, "pierrot", "Aniplex", 500));
        DataAnime.add(new Anime("Fairy tale", 2011, "Madhouse", "TOHO animation", 500));
        menu_login();
    }
    private static void nambah_data()throws NumberFormatException, IOException{
        System.out.println("=================");
        System.out.println("Nambah Data Anime");
        System.out.println("=================\n");
        System.out.print("ingin masukkan berapa data  Anime >> ");
        int batasan =  Integer.parseInt(input.readLine());
        clear();
        for(int i = 1; i < batasan; i++){
            System.out.println("==============================");
            System.out.println("Data ke- " + i);
            System.out.print("Masukkan Judul Anime >> ");
            String judul = input.readLine();
            System.out.print("Masukkan Produser Anime >>");
            String produser = input.readLine();
            System.out.print("Masukkan Tahun Rilis Anime >>");
            int tahun = error_int();
            System.out.print("Masukkan Studio Anime >>");
            String Studio = input.readLine();
            System.out.print("Masukkan Jumlah Episode Anime >>");
            int episode = error_int();
            Anime new_data = new Anime(judul, tahun, Studio, produser, episode);
            DataAnime.add(new_data);
        }
        System.out.println("===============================");
        System.out.println("Data Berhasil Ditambah Tuan >_<");
        System.out.println("===============================");
    }
    private static boolean ulang(String message){
        Scanner pilihan = new Scanner(System.in);
        System.out.print("\n"+message+" [y/n] >> ");
        String pilihan_user = pilihan.next();

        while(!pilihan_user.equalsIgnoreCase("y") && !pilihan_user.equalsIgnoreCase("n")){
            System.err.println("======================================");
            System.err.println("PILIHANNYA HANYA Y ATAU N LOH TUAN >_<");
            System.err.println("======================================");
            System.out.print("\n"+message+" [y/n] >>> ");
            pilihan_user = pilihan.next();
        }
        return pilihan_user.equalsIgnoreCase("y");
    }
    private static void nampil_data(){
        System.out.println("==========================================================================================================================================================");
        System.out.println("\n| No |\tNAMA ANIME            |\tSTUDIO                 |\tTAHUN RILIS\t         |\tPRODUSER\t        |\tJUMLAH EPISODE\t        |");
        System.out.println("==========================================================================================================================================================");
        for(int i =0; i < DataAnime.size(); i++){
            System.out.printf("| %2d ", (i+1));
            System.out.printf("|\t%-20s  ", DataAnime.get(i).getJudul());
            System.out.printf("|\t%-20s   ", DataAnime.get(i).getStudio());
            System.out.printf("|\t%-20s    ", DataAnime.get(i).getTahun());
            System.out.printf("|\t%-20s   ", DataAnime.get(i).getproduser());
            System.out.printf("|\t%-20s   |", DataAnime.get(i).getEpisode());
            System.out.println("\n");
        }
    }
    private static void update_data()throws NumberFormatException, IOException{
        System.out.println("=================");
        System.out.println("Update Data Anime");
        System.out.println("=================");
        System.out.println("");
        System.out.print("input judul anime >> ");
        String jdl = input.readLine();
        System.out.println("=====================================================================================================================================================");
        System.out.println("\n|\tNAMA ANIME            |\tSTUDIO                 |\tTAHUN RILIS\t         |\tPRODUSER\t        |\tJUMLAH EPISODE\t   |");
        System.out.println("=====================================================================================================================================================");
        for(Anime anime : DataAnime){
            if(anime.getJudul().equals(jdl)){
                System.out.printf("|\t%-20s  ", anime.getJudul());
                System.out.printf("|\t%-20s   ", anime.getStudio());
                System.out.printf("|\t%-20s    ", anime.getTahun());
                System.out.printf("|\t%-20s   ", anime.getproduser());
                System.out.printf("|\t%-20s   |", anime.getEpisode());
                System.out.println("\n");
                System.out.println("\t1. UBAH  JUDUL");
                System.out.println("\t2. UBAH  STUDIO");
                System.out.println("\t3. UBAH  TAHUN RILIS");
                System.out.println("\t4. UBAH  PRODUSER ");
                System.out.println("\t5. UBAH  JUMLAH EPISODE");
                System.out.print("Masukkan Pilihan Anda >> ");
                int pilihan = Integer.parseInt(input.readLine());
                switch(pilihan){
                    case 1:
                        System.out.print("Masukkan judul baru >> "); 
                        anime.SetJudul(input.readLine());
                        break;
                    case 2:
                        System.out.print("Masukkan Studio baru >> ");
                        anime.setStudio(input.readLine());
                        break;
                    case 3:
                        System.out.print("Masukkan Tahun Rilis Baru >> ");
                        anime.setTahun(error_int());
                        break;
                    case 4:
                        System.out.print("Masukkan Nama produser Baru >> ");
                        anime.setProduser(input.readLine());
                        break;
                    case 5:
                        System.out.print("Masukkan Jumlah Episode Baru >> ");
                        anime.setjumlah_episode(error_int());
                        break;
                    default:
                        System.err.println("==========================");
                        System.err.println("Pilihan tidak ada Tuan >_<");
                        System.err.println("==========================");
                        break;
                }
                break;
            }
        }
    }
    private static void delete_data()throws NumberFormatException, IOException{
        System.out.println("=================");
        System.out.println("Delete Data Anime");
        System.out.println("=================");
        System.out.print("input judul anime >> ");
        String jdlh = input.readLine();
        System.out.println("==========================================================================================================================================================");
        System.out.println("\n| No |\tNAMA ANIME            |\tSTUDIO                 |\tTAHUN RILIS\t         |\tPRODUSER\t        |\tJUMLAH EPISODE\t        |");
        System.out.println("==========================================================================================================================================================");
        for(Anime anime : DataAnime){
            if(anime.getJudul().equals(jdlh)){
                System.out.printf("|\t%-20s  ", anime.getJudul());
                System.out.printf("|\t%-20s   ", anime.getStudio());
                System.out.printf("|\t%-20s    ", anime.getTahun());
                System.out.printf("|\t%-20s   ", anime.getproduser());
                System.out.printf("|\t%-20s   |", anime.getEpisode());
                System.out.println("\n");
                System.out.print("Yakin mau menghapus data [y/n] >> ");
                String yakin = input.readLine();
                if(yakin.equalsIgnoreCase("y")){
                    DataAnime.remove(anime);
                    System.out.println("===============================");
                    System.out.println("Data berhasil di hapus Tuan >_<");
                    System.out.println("===============================");
                }
                else if(yakin.equalsIgnoreCase("n")){
                    System.out.println("=================================");
                    System.out.println("Data tidak jadi di hapus Tuan >_<");
                    System.out.println("=================================");
                }
                break;
            }
        }
    }
    private static void clear(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    private static int error_int() throws IOException{
        int masukkan_integer = 0;
        while(true){
            try{
                masukkan_integer = Integer.parseInt(input.readLine());
                break;
            }catch(NumberFormatException  e){
                System.err.print("\tInputan harus Integer >> ");
            }
        }
        return masukkan_integer;
    }
    private static void exit(){
        System.out.println("===============================================");
        System.out.println("TERIMA KASIH TELAH MENGGUNAKAN PROGRAM TUAN >_<");
        System.out.println("===============================================");
    }
    private static void menu_login() throws NumberFormatException, IOException{    
        while(true){
            clear();
            System.out.println("================================");
            System.out.println("= 1. Daftar (Tidak punya akun) =");
            System.out.println("= 2. Login  (Sudah punya akun) =");
            System.out.println("= 3. Keluar Program            =");
            System.out.println("================================");
            System.out.print("Masukkan pilihan Anda >> ");
            int pilih = error_int();
            switch(pilih){
                case 1:
                    daftar();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    exit();
                    System.exit(0);
                    break;
                default:
                    System.err.println("==========================");
                    System.err.println("pilihan tidak ada Tuan >_<");
                    System.err.println("==========================");
                    break;
            }
        }
        
    }
    private static void daftar() throws IOException{
        clear();
        System.out.println("=============================");
        System.out.println("=    DAFTARKAN AKUN ANDA    =");
        System.out.println("=============================");
        System.out.print("Masukkan username >> ");
        String user = input.readLine();
        System.out.print("Masukkan password >> ");
        String pass = input.readLine();
        akun new_akun = new akun(user, pass);
        DataAkun.add(new_akun);
        System.out.println("===============================");
        System.out.println("Data berhasil ditambah Tuan >_<");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("Silahkan login >_<");
        System.out.println("");
        System.out.println("Tekan enter untuk melanjutkan. . .");input.readLine();
        login();
    }
    private static void login()throws NumberFormatException, IOException{
        clear();
        System.out.println("==============================");
        System.out.println("=      LOGIN AKUN ANDA       =");
        System.out.println("==============================");
        System.out.print("Masukkan Username >> ");
        String userp = input.readLine();
        System.out.print("Masukkan Password >> ");
        String passp = input.readLine();
        for (akun akun : DataAkun){
            if(akun.getusername().equals(userp)){
                if(akun.getPass().equals(passp)){
                    clear();
                    System.out.println("===================");
                    System.out.println("Anda Berhasil Masuk");
                    System.out.println("===================");
                    System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
                    utama();
                    break;
                }
            }
            else{
                clear();
                System.out.println("=================================");
                System.out.println("Username atau Password anda Salah");
                System.out.println("=================================");
                System.out.println("tekan enter untuk melanjutkan. . .");input.readLine();
            }
        }
    }
    private static void utama() throws NumberFormatException, IOException{
        boolean lanjut = true;
        while(lanjut){
            clear();
            System.out.println("\t=========================");
            System.out.println("\t     DataBase Anime      ");
            System.out.println("\t=========================");
            System.out.println("\t= 1. TAMBAH  DATA ANIME =");
            System.out.println("\t= 2. LIHAT   DATA ANIME =");
            System.out.println("\t= 3. UBAH    DATA ANIME =");
            System.out.println("\t= 4. HAPUS   DATA ANIME =");
            System.out.println("\t= 5. KELUAR  PROGRAM    =");
            System.out.print("\n\tMasukan Pilihan Anda >> ");
            int pilih = error_int();
            switch(pilih){
                case 1:
                    clear();
                    nambah_data();
                    break;
                case 2:
                    clear();
                    nampil_data();
                    break;
                case 3:
                    clear();
                    update_data();
                    break;
                case 4:
                    clear();
                    delete_data();
                    break;
                case 5:
                    clear();
                    menu_login();
                    break;
                default:
                    System.err.println("===============================");
                    System.err.println("PILIHAN ANDA TIDAK ADA TUAN >_<");
                    System.err.println("===============================");
                    System.out.println("Tekan enter untuk melanjutkan"); input.readLine();
                    break;
            }
            lanjut = ulang("Apakah Anda ingin melanjutkan");
        }
        exit();
    }
}

