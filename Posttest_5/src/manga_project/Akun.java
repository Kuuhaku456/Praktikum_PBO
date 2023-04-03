package manga_project;

import java.io.*;
import java.util.*;
public abstract class Akun {
    protected String username, password, nama_lengkap, jenis_kelamin;
    protected InputStreamReader p = new InputStreamReader(System.in);
    protected BufferedReader input = new BufferedReader(p);
    protected int pilih;
    protected static int banyak = 0;
    protected abstract void lihat()  throws IOException;
    protected abstract void clear();
    protected abstract void menu() throws IOException;
    public Akun(String username, String pass, String nama, String jenis_kelamin){
        this.username = username;
        this.password = pass;
        this.nama_lengkap = nama;
        this.jenis_kelamin =jenis_kelamin;
        p = new InputStreamReader(System.in);
        input = new BufferedReader(p);
        banyak++;
    }
    protected int error_int() throws IOException{
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
    protected static boolean ulang(String message){
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
    protected void profile(){
        System.out.println("Username        >> " + this.username);
        System.out.println("Nama            >> " + this.nama_lengkap);
        System.out.println("jenis kelamin   >> " + this.jenis_kelamin);
    }
    
    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPass(String pass){
        this.password = pass;
    }

    public String getPass(){
        return password;
    }

    public void setNama(String nama){
        this.nama_lengkap = nama;
    }

    public String getNama(){
        return nama_lengkap;
    }

    public void setJenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }

    public String GetJenis_kelamin(){
        return jenis_kelamin;
    }

}
