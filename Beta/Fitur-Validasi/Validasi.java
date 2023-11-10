import java.util.Scanner;

public class Validasi {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);

        String nama;
        char validasi, stop;
        String[] Selesai = new String[5],
                BlmSelesai = new String[5];

        // Perulangan untuk input nilai
        do {
            System.out.print("Masukkan nama: ");
            nama = sc.next();
            System.out.print("Apakah tugas kompen sudah dikerjakan? (y/n)");
            validasi = sc.next().charAt(0);
            if (validasi == 'y' || validasi == 'Y') {
                for (int i = 0; i < Selesai.length; i++) {
                    if (Selesai[i] == null) {
                        Selesai[i] = nama;
                        System.out.println("Berhasil menambahkan mahasiswa");
                        break;
                    }
                }
            } else {
                for (int i = 0; i < BlmSelesai.length; i++) {
                    if (BlmSelesai[i] == null) {
                        BlmSelesai[i] = nama;
                        System.out.println("Berhasil menambahkan mahasiswa");
                        break;
                    }
                }
            }

            System.out.print("Apakah ingin menambahakan list?(y/n)");
            stop = sc.next().charAt(0);
            System.out.println();

        } while (stop == 'y' || stop == 'Y');

        // List output
        System.out.println();
        System.out.println("List yang sudah mengerjakan:");
        for (int i = 0, j = 0; i < Selesai.length; i++, j++) {
            System.out.println((j + 1) + ". " + Selesai[i]);
        }
        System.out.println();
        System.out.println("List yang belum mengerjakan:");
        for (int i = 0, j = 0; i < BlmSelesai.length; i++, j++) {
            System.out.println((j + 1) + ". " + BlmSelesai[i]);
        }

        sc.close();
    }
}
