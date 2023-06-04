import java.io.*;

public class soal2 {
    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(p);    
    public static void main(String[] args) throws NumberFormatException, IOException {
        double nilai_akhir;
        System.out.print("Masukkan jumlah kehadiran (1-8) >>> "); double kehadiran = error_double();
        System.out.print("Masukkan nilai UTS              >>> "); double nilai_uts = error_double();
        System.out.print("Masukkan nilai UAS              >>> "); double nilai_uas = error_double();
        nilai_akhir = hitungNilaiAkhir(kehadiran, nilai_uts, nilai_uas);
        if (nilai_akhir < 50){
            System.out.println("nilai akhir anda >>> " + nilai_akhir);
            System.out.println("Grade Anda >>> " + "E");
        } else if( nilai_akhir < 60){
            System.out.println("nilai akhir anda >>> " + nilai_akhir);
            System.out.println("Grade Anda >>> " + "D");
        } else if( nilai_akhir < 70) {
            System.out.println("nilai akhir anda >>> " + nilai_akhir);
            System.out.println("Grade Anda >>> " + "C");
        } else if (nilai_akhir < 85) {
            System.out.println("nilai akhir anda >>> " + nilai_akhir);
            System.out.println("Grade Anda >>> " + "B");
        } else if (nilai_akhir <= 100){
            System.out.println("nilai akhir anda >>> " + nilai_akhir);
            System.out.println("Grade Anda >>> " + "A");
        }
        
    }

    protected static double error_double() throws IOException, NumberFormatException{
        double masukkan_integer = 0;
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

    public static double hitungNilaiAkhir(double kehadiran, double uts, double uas) {
        double bobotKehadiran = 0.2;
        double bobotUTS = 0.3;
        double bobotUAS = 0.5;

        if (kehadiran < 3) {
            return 0;
        } else if (kehadiran >= 3 && kehadiran <= 4) {
            return (60 * bobotKehadiran) + (uts * bobotUTS) + (uas * bobotUAS);
        } else if (kehadiran >= 5 && kehadiran <= 6) {
            return (80 * bobotKehadiran) + (uts * bobotUTS) + (uas * bobotUAS);
        } else {
            return (100 * bobotKehadiran) + (uts * bobotUTS) + (uas * bobotUAS);
        }
    }
}
