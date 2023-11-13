import java.util.Scanner;

public class Kompen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel //

        // Array data
        String namaMahasiswa[] = new String[5],
                nomorTelepon[] = new String[5];
        int jumlahKompen[] = new int[5];
        long nim[] = new long[5];

        byte semesterYangDilewati[] = new byte[5];
        short jumlahAlpha[] = new short[5];

        // Variabel data sementara
        String namaMhs,
                nomorTlp;
        int jmlKompen;
        long NIM;
        byte semesterYgDilewati;
        short jmlAlpha;

        // variabel pemilihan
        char stop;
        short pilihEdit, pilihHapus;
        boolean run = true;

        // Contoh data 1
        namaMahasiswa[0] = "afif";
        nim[0] = 235445;
        nomorTelepon[0] = "0854753";
        semesterYangDilewati[0] = 2;
        jumlahAlpha[0] = 3;
        jumlahKompen[0] = 8;

        // Contoh data 2
        namaMahasiswa[1] = "andi";
        nim[1] = 232355;
        nomorTelepon[1] = "0898347";
        semesterYangDilewati[1] = 3;
        jumlahAlpha[1] = 1;
        jumlahKompen[1] = 6;

        // Contoh data 2
        namaMahasiswa[2] = "anya";
        nim[2] = 232355;
        nomorTelepon[2] = "0893447";
        semesterYangDilewati[2] = 2;
        jumlahAlpha[2] = 1;
        jumlahKompen[2] = 4;

        // Preview data
        System.out.println("=========================");
        System.out.println();
        for (int k = 0, j = 1; k < 5 && j <= 5; k++, j++) {
            if (namaMahasiswa[k] != null) {
                System.out.println((j) + ". Nama Mahasiswa \t\t= " + namaMahasiswa[k]);
                System.out.println("   NIM \t\t\t\t= " + nim[k]);
                System.out.println("   Nomor Telepon \t\t= " + nomorTelepon[k]);
                System.out.println("   Semester Yang Dilewati \t= " + semesterYangDilewati[k]);
                System.out.println("   Jumlah Alpha \t\t= " + jumlahAlpha[k]);
                System.out.println("   Jumlah Kompen \t\t= " + jumlahKompen[k]);
                System.out.println();
            }
        }
        System.out.println("=========================");
        System.out.println();

        do {

            // Pemilihan aksi
            System.out.println("Pilih aksi \n");
            System.out.println("1. Tambah data mahasiswa");
            System.out.println("2. Lihat data mahasiswa");
            System.out.println("3. Edit data mahasiswa");
            System.out.println("4. Hapus data mahasiswa");
            System.out.println("0. keluar");

            System.out.print("\npilih: ");
            byte aksi = sc.nextByte();
            System.out.println();

            switch (aksi) {
                case 1:

                    // Input nilai variabel
                    do {

                        // Input ke variabel sementara
                        System.out.print("Masukkan Nama Mahasiswa \t\t: ");
                        namaMhs = sc.next();

                        System.out.print("Masukkan NIM \t\t\t\t: ");
                        NIM = sc.nextLong();

                        System.out.print("Masukkan Nomor Telepon \t\t\t: ");
                        nomorTlp = sc.next();

                        System.out.print("Masukkan Semester Yang Dilewati \t: ");
                        semesterYgDilewati = sc.nextByte();

                        System.out.print("Masukkan jumlah alpha \t\t\t: ");
                        jmlAlpha = sc.nextShort();
                        jmlKompen = jmlAlpha * 2 * semesterYgDilewati;

                        // Memasukkan ke array dari variabel sementara
                        for (int j = 0; j < 5; j++) {
                            if (namaMahasiswa[j] == null) {
                                namaMahasiswa[j] = namaMhs;
                                nim[j] = NIM;
                                nomorTelepon[j] = nomorTlp;
                                semesterYangDilewati[j] = semesterYgDilewati;
                                jumlahAlpha[j] = jmlAlpha;
                                jumlahKompen[j] = jmlKompen;
                                semesterYangDilewati[j] = semesterYgDilewati;
                                break;
                            } else {
                                continue;
                            }
                        }

                        // mengembalikan variabel ke nilai default
                        namaMhs = null;
                        NIM = 0;
                        nomorTlp = null;
                        semesterYgDilewati = 0;
                        jmlAlpha = 0;
                        jmlKompen = 0;

                        System.out.println();
                        System.out.print("Apakah ingin menambahkan data lagi?(y/n) ");
                        stop = sc.next().charAt(0);

                    } while (stop == 'y' || stop == 'Y');

                case 2:

                    // Output
                    System.out.println("=========================\n");
                    for (int k = 0, j = 1; k < 5 && j <= 5; k++) {
                        if (namaMahasiswa[k] != null) {
                            System.out.println((j++) + ". Nama Mahasiswa \t\t= " + namaMahasiswa[k]);
                            System.out.println("   NIM \t\t\t\t= " + nim[k]);
                            System.out.println("   Nomor Telepon \t\t= " + nomorTelepon[k]);
                            System.out.println("   Semester Yang Dilewati \t= " + semesterYangDilewati[k]);
                            System.out.println("   Jumlah Alpha \t\t= " + jumlahAlpha[k]);
                            System.out.println("   Jumlah Kompen \t\t= " + jumlahKompen[k]);
                            System.out.println();
                        }
                    }
                    System.out.println("=========================\n");
                    break;

                case 3:

                    // Edit data mahasiswa
                    System.out.print("Pilih nomor data yang akan diedit \t: ");
                    pilihEdit = sc.nextByte();

                    // Mengganti nilai dari indeks array
                    System.out.print("Masukkan Nama Mahasiswa \t\t: ");
                    namaMahasiswa[pilihEdit - 1] = sc.next();

                    System.out.print("Masukkan NIM \t\t\t\t: ");
                    nim[pilihEdit - 1] = sc.nextLong();

                    System.out.print("Masukkan Nomor Telepon \t\t\t: ");
                    nomorTelepon[pilihEdit - 1] = sc.next();

                    System.out.print("Masukkan Semester Yang Dilewati \t: ");
                    semesterYangDilewati[pilihEdit - 1] = sc.nextByte();

                    System.out.print("Masukkan jumlah alpha \t\t\t: ");
                    jumlahAlpha[pilihEdit - 1] = sc.nextShort();

                    jumlahKompen[pilihEdit - 1] = jumlahAlpha[pilihEdit - 1] * 2 * semesterYangDilewati[pilihEdit - 1];

                    // Output
                    System.out.println("=========================");
                    System.out.println();
                    for (int k = 0, j = 1; k < 5 && j <= 5; k++) {
                        if (namaMahasiswa[k] != null) {
                            System.out.println((j++) + ". Nama Mahasiswa \t\t= " + namaMahasiswa[k]);
                            System.out.println("   NIM \t\t\t\t= " + nim[k]);
                            System.out.println("   Nomor Telepon \t\t= " + nomorTelepon[k]);
                            System.out.println("   Semester Yang Dilewati \t= " + semesterYangDilewati[k]);
                            System.out.println("   Jumlah Alpha \t\t= " + jumlahAlpha[k]);
                            System.out.println("   Jumlah Kompen \t\t= " + jumlahKompen[k]);
                            System.out.println();
                        }
                    }
                    System.out.println("=========================");
                    System.out.println();
                    break;

                case 4:

                    // Hapus data
                    System.out.print("Pilih nomor data yang akan dihapus \t: ");
                    pilihHapus = sc.nextByte();

                    // Menghapus data
                    namaMahasiswa[pilihHapus - 1] = null;
                    nim[pilihHapus - 1] = 0;
                    nomorTelepon[pilihHapus - 1] = null;
                    semesterYangDilewati[pilihHapus - 1] = 0;
                    jumlahAlpha[pilihHapus - 1] = 0;
                    jumlahKompen[pilihHapus - 1] = 0;

                    // wip
                    
                    // Mengisi indeks kosong
                    // for (int i = pilihHapus; i < 5; i++) {
                    //     if (namaMahasiswa[i - 1] == null) {

                    //         // Memajukan nomor indeks
                    //         namaMahasiswa[pilihHapus - 1] = namaMahasiswa[i];
                    //         nim[pilihHapus - 1] = nim[i];
                    //         nomorTelepon[pilihHapus - 1] = nomorTelepon[i];
                    //         semesterYangDilewati[pilihHapus - 1] = semesterYangDilewati[i];
                    //         jumlahAlpha[pilihHapus - 1] = jumlahAlpha[i];
                    //         jumlahKompen[pilihHapus - 1] = jumlahKompen[i];

                    //         // Menghapus nilai di nomor indeks sebelumnya
                    //         namaMahasiswa[i] = null;
                    //         nim[i] = 0;
                    //         nomorTelepon[i] = null;
                    //         semesterYangDilewati[i] = 0;
                    //         jumlahAlpha[i] = 0;
                    //         jumlahKompen[i] = 0;
                    //     }
                    // }

                    System.out.println("Data berhasil dihapus");

                    // Output
                    System.out.println("=========================");
                    System.out.println();
                    for (int k = 0, j = 1; k < 5 && j <= 5; k++) {
                        if (namaMahasiswa[k] != null) {
                            System.out.println((j++) + ". Nama Mahasiswa \t\t= " + namaMahasiswa[k]);
                            System.out.println("   NIM \t\t\t\t= " + nim[k]);
                            System.out.println("   Nomor Telepon \t\t= " + nomorTelepon[k]);
                            System.out.println("   Semester Yang Dilewati \t= " + semesterYangDilewati[k]);
                            System.out.println("   Jumlah Alpha \t\t= " + jumlahAlpha[k]);
                            System.out.println("   Jumlah Kompen \t\t= " + jumlahKompen[k]);
                            System.out.println();
                        }
                    }
                    System.out.println("=========================");
                    System.out.println();

                    break;

                case 0:
                    // Exit
                    System.out.println("Terimakasih sudah menggunakan program ini");
                    run = false;
                    break;
                default:
                    System.out.println("Inputan tidak valid");
                    break;
            }
        } while (run);
        // sc.close();
    }
}