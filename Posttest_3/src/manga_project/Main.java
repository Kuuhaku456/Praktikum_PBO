package manga_project;
import java.io.*;
import java.util.*;

public class Main {
    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(p);
    private static ArrayList<User> DataUser = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        User User1 = new User("Kuuhaku","123","Filipus Manik","Laki-laki","User");
        Admin Admin = new Admin("Admin", "Admin1", "Andri", "Laki-laki", "Admin", DataUser);
        while(true){
            clear();
            System.out.println("=============================");
            System.out.println("= APLIKASI MANGA SAMEHADAKU =");
            System.out.println("=============================");
            System.out.println("= 1. Daftar                 =");
            System.out.println("= 2. Login                  =");
            System.out.println("= 3. Keluar dari program    =");
            System.out.println("=============================");
            System.out.print("Masukkan pilihan anda >> ");
            int pilihan = Error_int();
            switch (pilihan){
                case 1 -> {
                    clear();
                    String jenis_kelamin = null;
                    System.out.println("=============================");
                    System.out.println("=    DAFTARKAN AKUN ANDA    =");
                    System.out.println("=============================");
                    System.out.print("Masukkan username    >> ");String user = input.readLine();
                    System.out.print("Masukkan password    >> ");String pass = input.readLine();
                    System.out.print("Masukkan nama Anda   >> ");String nama = input.readLine();
                    System.out.println("==================");                    
                    System.out.println("= 1. LAKI - LAKI =");
                    System.out.println("= 2. PEREMPUAN   =");
                    System.out.println("==================");
                    System.out.print("Masukkan pilihan >> ");
                    int pilih = Error_int();
                    if(pilih == 1){
                        jenis_kelamin = "LAKI-LAKI";
                    }
                    else if(pilih == 2){
                        jenis_kelamin = "PEREMPUAN";
                    }
                    else{
                        System.out.println("Gender hanya 2");
                        jenis_kelamin = null;
                    }
                    User new_user = new User(user, pass, nama, jenis_kelamin, "User");
                    DataUser.add(new_user);
                    System.out.println("===============================");
                    System.out.println("Data berhasil ditambah Tuan >_<");
                    System.out.println("===============================");
                    System.out.println("");
                    System.out.println("Silahkan login >_<");
                    System.out.println("");
                    System.out.println("Tekan enter untuk melanjutkan. . .");input.readLine();
                }
                case 2 -> {
                    clear();
                    System.out.print("Masukkan Username Anda >> ");String username = input.readLine();
                    System.out.print("Masukkan Password Anda >> ");String Password = input.readLine();
                    if(username.equals(Admin.getUsername()) && Password.equals(Admin.getPass())){
                        Admin.menu();
                    }
                    for (User user : DataUser){
                        if(username.equals(user.getUsername()) && Password.equals(user.getPass())){
                            user.menu();
                        }
                    }
                }
                case 3 -> {
                    System.out.println("===============================================");
                    System.out.println("Terima kasih telah menggunakan program Tuan >_<");
                    System.out.println("===============================================");
                    System.exit(0);
                }
                default -> 
                    System.out.println("Pilihan tidak ada Tuan >_<");
            }
        }
        
    }
    private static void daftar() throws IOException, NumberFormatException{
        clear();
        String jenis_kelamin = null;
        System.out.println("=============================");
        System.out.println("=    DAFTARKAN AKUN ANDA    =");
        System.out.println("=============================");
        System.out.print("Masukkan username    >> ");String user = input.readLine();
        System.out.print("Masukkan password    >> ");String pass = input.readLine();
        System.out.print("Masukkan nama Anda >> ");String nama = input.readLine();
        System.out.println("1. LAKI - LAKI");
        System.out.println("2. PEREMPUAN  ");
        int pilihan = Error_int();
        if(pilihan == 1){
            jenis_kelamin = "LAKI-LAKI";
        }
        else if(pilihan == 2){
            jenis_kelamin = "PEREMPUAN";
        }
        else{
            System.out.println("Gender hanya 2");
            jenis_kelamin = null;
        }
        User new_user = new User(user, pass, nama, jenis_kelamin, "User");
        DataUser.add(new_user);
        System.out.println("===============================");
        System.out.println("Data berhasil ditambah Tuan >_<");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("Silahkan login >_<");
        System.out.println("");
        System.out.println("Tekan enter untuk melanjutkan. . .");input.readLine();
        login();
    }
    private static void login()throws IOException, NumberFormatException{
        
    }
    
    private static int Error_int() throws IOException{
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
    private static void clear(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
}
