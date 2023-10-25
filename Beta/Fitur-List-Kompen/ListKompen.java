import java.util.Scanner;

public class ListKompen {

    public static void main(String[] args) {
        
        // deklarasi variabel
        String jeniskompen[] = new String[12];
        String konfirmasi;
        Scanner sc = new Scanner(System.in);

        // input nilai
        for (int i = 0; i < jeniskompen.length; i++) {
            System.out.print("Masukkan jenis pekerjaan kompen yang ingin anda berikan : ");
            jeniskompen[i] = sc.nextLine();

            System.out.print("Apakah anda ingin menambahkan pekerjaan kompen lagi ? (y/n) : ");
            konfirmasi = sc.nextLine();

            if (!konfirmasi.equals("y")) {
                break;
            }
        }

        // output nilai
        System.out.println("List kompen yang ditambahkan : ");
        for (int j = 0; j < jeniskompen.length; j++) {
            if (jeniskompen[j] != null) {
                System.out.println("-" + (j + 1) + " jenis pekerjaan : " + jeniskompen[j]);
            }
        }

        sc.close();
    }
}
