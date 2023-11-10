import java.util.Scanner;
public class Kompen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        String namaMahasiswa[] = new String[5];
        int jumlahKompen[] = new int[5];
        long nim[] = new long[5],
             nomorTelepon[] = new long[5];

        byte semesterYangDilewati[] = new byte[5];
        short jumlahAlpha[] = new short[5];

        char stop;
        short i =0;

        // Input nilai variabel
        do {

            System.out.print("Masukkan Nama Mahasiswa \t\t: ");  
            namaMahasiswa[i] = sc.next();
    
            System.out.print("Masukkan NIM \t\t\t\t: ");
            nim[i] = sc.nextLong();
    
            System.out.print("Masukkan Nomor Telepon \t\t\t: ");
            nomorTelepon[i] = sc.nextLong();
            
            System.out.print("Masukkan Semester Yang Dilewati \t: ");
            semesterYangDilewati[i] = sc.nextByte();
    
            System.out.print("Masukkan jumlah alpha \t\t\t: ");
            jumlahAlpha[i] = sc.nextShort();
    
            
            jumlahKompen[i] = jumlahAlpha[i] * 2 * semesterYangDilewati[i];

            System.out.println();
            System.out.print("Apakah ingin menambahkan data lagi?(y/n) ");
            stop = sc.next().charAt(0);
            i++;

        } while (stop == 'y' || stop == 'Y');
        // for (int i = 0; i < jumlahKompen.length; i++) {
        // }

        // Output
        System.out.println("=========================");
        System.out.println();
        for (int k = 0, j = 1; i < 5 && j <=5; k++, j++) {
            if (namaMahasiswa[k] != null) {
                System.out.println((j)+". Nama Mahasiswa \t\t= " + namaMahasiswa[k]);
                System.out.println("   NIM \t\t\t\t= " + nim[k]);
                System.out.println("   Nomor Telepon \t\t= 0" +nomorTelepon[k]);
                System.out.println("   Semester Yang Dilewati \t= " + semesterYangDilewati[k]);
                System.out.println("   Jumlah Alpha \t\t= " +jumlahAlpha[k]);
                System.out.println("   Jumlah Kompen \t\t= " + jumlahKompen[k]);
                System.out.println();    
            }
        }
        System.out.println("=========================");
        System.out.println();
        sc.close();
    }
}