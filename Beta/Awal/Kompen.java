import java.util.Scanner;
public class Kompen {
    public static void main(String[] args) {
        // Data Mahasiswa
        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa;
        long nim;
        byte semesterYangDilewati;
        long nomorTelepon;
        short jumlahAlpha;
        int jumlahKompen;

        // Input nilai variabel
        System.out.print("Masukkan Nama Mahasiswa : ");  
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLong();
        System.out.print("Masukkan Semester Yang Dilewati : ");
        semesterYangDilewati = sc.nextByte();
        System.out.print("Masukkan Nomor Telepon : ");
        nomorTelepon = sc.nextLong();
        System.out.print("Jumlah alpha : ");
        jumlahAlpha = sc.nextShort();
        
        // Output
        System.out.println("Nama Mahasiswa = " + namaMahasiswa);
        System.out.println("NIM = " + nim);
        System.out.println("Semester Yang Dilewati = " + semesterYangDilewati);
        System.out.println("Nomor Telepon = " +nomorTelepon);
        System.out.println("Jumlah Alpha = " +jumlahAlpha);

        // Proyek
        jumlahKompen = jumlahAlpha * 2 * semesterYangDilewati;
        System.out.println("Jumlah Kompen = " + jumlahKompen);
    }
}