import java.util.Scanner;
public class Peraturan {

    static int maxPeraturan = 20;
    static Scanner sc = new Scanner(System.in);
    static String listPeraturan[] = new String[maxPeraturan];
    static int poinPelanggaran[] = new int[maxPeraturan];
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("======== Peraturan ========");
            System.out.println("1. Tambah Peraturan");
            System.out.println("2. Lihat Peraturan");
            System.out.println("3. Ubah Peraturan");
            System.out.println("4. Hapus Peraturan");
            System.out.println("5. Kembali Ke Menu Awal");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu (0-5) : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                tambahPeraturan();
                break;

                case 2:
                lihatPeraturan();
                break;

                case 3:
                ubahPeraturan();
                break;

                case 4:
                hapusPeraturan();
                break;

                case 5:
                // Kembali Ke Menu Awal Untuk Memilih Lagi //
                break;

                case 0:
                System.out.println("Terima kasih!");
                break;

                default:
                System.out.println("Nomor yang dipilih tidak valid, Silahkan pilih lagi");
            }
        }

        while (pilihan != 0);
    }

    static void tambahPeraturan() {
        char tambah = 'y';
        Scanner sc = new Scanner(System.in);

        do {
            for (int i = 0; i < maxPeraturan; i++) {
            System.out.print("Masukkan Peraturan : ");
            listPeraturan[i] = sc.nextLine();
            
            System.out.print("Masukkan Poin pelanggarannya : ");
            poinPelanggaran[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Apakah ingin menambah peraturan lagi? (y/n) : ");
            tambah = sc.next().charAt(0);
            if (tambah == 'y' || tambah == 'Y') {
                continue;
            } else {
                break;
            }
            
        }
        }

        while (tambah == 'y' || tambah == 'Y');
    }

    static void lihatPeraturan() {
        System.out.printf("================================================================\n");
        System.out.println("DAFTAR PERATURAN");
        System.out.printf("================================================================\n");

        for (int i = 0; i < maxPeraturan; i++) {
            System.out.println((i + 1) + "." + " " + listPeraturan[i]);
            System.out.printf("-------------------------------------------------------------\n");
            System.out.println("Poin Pelanggaran : " + poinPelanggaran[i]);
            System.out.printf("-------------------------------------------------------------\n");
        }
    }

    static void ubahPeraturan() {
        Scanner sc = new Scanner(System.in);
        int nomorPeraturan;

        System.out.print("Masukkan nomor peraturan yang ingin diubah : ");
        nomorPeraturan = sc.nextInt();
        System.out.println();

        System.out.print("Masukkan peraturan yang baru : ");
        listPeraturan[nomorPeraturan - 1] = sc.nextLine();
        System.out.println();

        System.out.println("Masukkan poin pelanggaran yang baru : ");
        poinPelanggaran[nomorPeraturan - 1] = sc.nextInt();
    }
    static void hapusPeraturan() {
        Scanner sc = new Scanner(System.in);
        int nomorPeraturan;

        System.out.print("Masukkan nomor peraturan yang ingin dihapus : ");
        nomorPeraturan = sc.nextInt();
        
        for (int i = nomorPeraturan - 1; i < maxPeraturan - 1; i++) {
            listPeraturan[i] = listPeraturan[i + 1];
            poinPelanggaran[i] = poinPelanggaran[i + 1];

            System.out.println("Peraturan berhasil dihapus");
        }
    }
}