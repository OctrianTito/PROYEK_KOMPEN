import java.util.Scanner;

public class lamanawal {
    static Scanner sc = new Scanner(System.in);

    // Array data

    static String strMahasiswa[][] = new String[5][5];
    static int intMahasiswa[][] = new int[5][4];

    // Variabel data sementara
    static String namaMhs, NIM, kelas,
            nomorTlp, pekerjaan;
    static int jmlKompen, validSiswa,
            semesterYgDilewati, jmlAlpha;

    static void defaultTempVar() {
        namaMhs = null;
        NIM = null;
        kelas = null;
        nomorTlp = null;
        pekerjaan = null;
        jmlKompen = 0;
        validSiswa = 0;
        semesterYgDilewati = 0;
        jmlAlpha = 0;
    }

    // variabel pemilihan
    char stop;
    static short pilihEdit, pilihHapus;
    boolean run = true;

    // fungsi fleksibel
    static void inputStringArray(String str, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = str;
                break;
            } else {
                continue;
            }
        }
    }

    static void inputIntArray(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = num;
                break;
            } else {
                continue;
            }
        }
    }

    // Fungsi Menu Login
    static void Login(String[][] users, String[][] userAdmin, int numUsers) {
        String usernameInput, passInput;
        System.out.print("Masukkan Username : ");
        usernameInput = sc.nextLine();
        System.out.print("Masukkan Password : ");
        passInput = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < numUsers || i < userAdmin.length; i++) {
            if (usernameInput.equals(users[i][0]) && passInput.equals(users[i][1])) {
                found = true;
                System.out.println("\tAnda berhasil login!.");
                break;
            } else if (usernameInput.equals(userAdmin[i][0]) && passInput.equals(userAdmin[i][1])) {
                found = true;
                System.out.println("================================================");
                System.out.println("\tAnda berhasil Login sebagai Admin");
            }

        }
        if (!found) {
            System.out.println("Username atau password tidak terdaftar");
        }
    }

    // Fungsi Menu Register User
    static void Register(String[][] users, int numUsers) {
        String stop;

        System.out.println("================================================");
        System.out.println("------------------------------------------------");
        System.out.println("\t\tLaman Register User");
        System.out.println("------------------------------------------------");
        System.out.println("================================================");

        if (numUsers < users.length) {
            System.out.print("Masukkan Username: ");
            users[numUsers][0] = sc.next();
            System.out.print("Masukkan Password: ");
            users[numUsers][1] = sc.next();

            numUsers++; // Tambahkan jumlah pengguna yang telah diregistrasi
        } else {
            System.out.println("Kapasitas pengguna penuh. Tidak dapat menambahkan username.");

        }
    }

    // Data mahasiswa

    static void dataMahasiwa() {

        // variabel pemilihan
        short pilihEdit, pilihHapus;
        boolean run = true;

        // Contoh data 1
        strMahasiswa[0][0] = "afif"; // nama
        strMahasiswa[0][1] = "TI-1H"; // kelas
        strMahasiswa[0][2] = "235445"; // nim
        strMahasiswa[0][3] = "0854753"; // no telp
        intMahasiswa[0][0] = 2; // semester yg dilewati
        intMahasiswa[0][1] = 3; // jml alpha
        intMahasiswa[0][2] = 8; // poin kompen
        intMahasiswa[0][3] = 1; // validasi
        strMahasiswa[0][4] = "tes"; // pekerjaan siswa

        // Contoh data 2
        strMahasiswa[1][0] = "andi"; // nama
        strMahasiswa[1][1] = "TI-1H"; // kelas
        strMahasiswa[1][2] = "235445"; // nim
        strMahasiswa[1][3] = "0854753"; // no telp
        intMahasiswa[1][0] = 2; // semester yg dilewati
        intMahasiswa[1][1] = 3; // jml alpha
        intMahasiswa[1][2] = 8; // poin kompen
        intMahasiswa[1][3] = 1; // validasi
        strMahasiswa[1][4] = "-"; // pekerjaan siswa

        // Contoh data 3
        strMahasiswa[2][0] = "anya"; // nama
        strMahasiswa[2][1] = "TI-1H"; // kelas
        strMahasiswa[2][2] = "235445"; // nim
        strMahasiswa[2][3] = "0854753"; // no telp
        intMahasiswa[2][0] = 2; // semester yg dilewati
        intMahasiswa[2][1] = 3; // jml alpha
        intMahasiswa[2][2] = 8; // poin kompen
        intMahasiswa[2][3] = 1; // validasi
        strMahasiswa[2][4] = "tes"; // pekerjaan siswa

        // Contoh data 4
        strMahasiswa[3][0] = "arif"; // nama
        strMahasiswa[3][1] = "TI-1H"; // kelas
        strMahasiswa[3][2] = "235445"; // nim
        strMahasiswa[3][3] = "0854753"; // no telp
        intMahasiswa[3][0] = 2; // semester yg dilewati
        intMahasiswa[3][1] = 3; // jml alpha
        intMahasiswa[3][2] = 8; // poin kompen
        intMahasiswa[3][3] = 1; // validasi
        strMahasiswa[3][4] = "tes"; // pekerjaan siswa

        // Contoh data 5
        strMahasiswa[4][0] = "asa"; // nama
        strMahasiswa[4][1] = "TI-1H"; // kelas
        strMahasiswa[4][2] = "235445"; // nim
        strMahasiswa[4][3] = "0854753"; // no telp
        intMahasiswa[4][0] = 2; // semester yg dilewati
        intMahasiswa[4][1] = 3; // jml alpha
        intMahasiswa[4][2] = 8; // poin kompen
        intMahasiswa[4][3] = 1; // validasi
        strMahasiswa[4][4] = "tes"; // pekerjaan siswa

        tampilDataMahasiswa();

        do {
            // Pemilihan aksi
            System.out.println("Pilih aksi \n");
            System.out.println("1. Tambah data mahasiswa");
            System.out.println("2. Lihat data mahasiswa");
            System.out.println("3. Edit data mahasiswa");
            System.out.println("4. Hapus data mahasiswa");
            System.out.println("0. Log out");

            System.out.print("\npilih: ");
            byte aksi = sc.nextByte();
            System.out.println();

            switch (aksi) {
                case 1:
                    tambahDataMahasiswa();
                    break;
                case 2:
                    tampilDataMahasiswa();
                    break;
                case 3:
                    editDataMahasiswa();
                    break;
                case 4:
                    hapusDataMahasiswa();
                    break;
                case 0:

                    break;
                default:
                    break;
            }
        } while (run);
    }

    // CRUD data mahasiswa

    static void tambahDataMahasiswa() {
        // Input ke variabel sementara
        System.out.print("Masukkan Nama Mahasiswa \t\t: ");
        namaMhs = sc.next();

        System.out.print("Masukkan Kelas \t\t\t\t: ");
        kelas = sc.next();

        System.out.print("Masukkan NIM \t\t\t\t: ");
        NIM = sc.next();

        System.out.print("Masukkan Nomor Telepon \t\t\t: ");
        nomorTlp = sc.next();

        System.out.print("Masukkan Semester Yang Dilewati \t: ");
        semesterYgDilewati = sc.nextInt();

        System.out.print("Masukkan jumlah alpha \t\t\t: ");
        jmlAlpha = sc.nextInt();
        jmlKompen = jmlAlpha * 2 * semesterYgDilewati;

        System.out.println("Status kompen \t\t\t\t: ");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Pilih (1/2) \t\t\t\t: ");
        validSiswa = sc.nextInt();

        if (validSiswa == 1) {
            System.out.print("Pekerjaan yang dikerjakan \t\t: ");
            pekerjaan = sc.next();
        } else {
            pekerjaan = "-";
        }

        // Memasukkan ke array dari variabel sementara
        for (int i = 0; i < strMahasiswa.length; i++) {
            if (strMahasiswa[i][0] == null) {
                strMahasiswa[i][0] = namaMhs; // nama
                strMahasiswa[i][1] = kelas; // kelas
                strMahasiswa[i][2] = NIM; // nim
                strMahasiswa[i][3] = nomorTlp; // no telp
                intMahasiswa[i][0] = semesterYgDilewati; // semester yg dilewati
                intMahasiswa[i][1] = jmlAlpha; // jml alpha
                intMahasiswa[i][2] = jmlKompen; // poin kompen
                intMahasiswa[i][3] = validSiswa; // validasi
                strMahasiswa[i][4] = pekerjaan; // pekerjaan siswa

                System.out.println("\nBerhasil menambahkan data\n");

                break;
            } else {
                continue;
            }
        }
        defaultTempVar();

        // output
        tampilDataMahasiswa();
    }

    // Tampil data mahasiswa
    static void tampilDataMahasiswa() {
        System.out.println("=========================");
        System.out.println();
        for (int i = 0, j = 1; i < strMahasiswa.length; i++) {
            if (strMahasiswa[i][0] != null) {
            System.out.println((j++) + ". Nama Mahasiswa \t\t= " + strMahasiswa[i][0]);
            System.out.println("   Kelas \t\t\t= " + strMahasiswa[i][1]);
            System.out.println("   NIM \t\t\t\t= " + strMahasiswa[i][2]);
            System.out.println("   Nomor Telepon \t\t= " + strMahasiswa[i][3]);
            System.out.println("   Semester Yang Dilewati \t= " + intMahasiswa[i][0]);
            System.out.println("   Jumlah Alpha \t\t= " + intMahasiswa[i][1]);
            System.out.println("   Jumlah Kompen \t\t= " + intMahasiswa[i][2]);

            String statusKompen = intMahasiswa[i][3] == 1 ? "Ada" : "Tidak ada";

            System.out.println("   Status kompen \t\t= " + statusKompen);
            System.out.println("   Pekerjaan yang dikerjkan \t= " + strMahasiswa[i][4]);

            System.out.println();
            }
        }
        System.out.println("=========================");
        System.out.println();
    }

    // Edit data mahasiswa
    static void editDataMahasiswa() {
        // tampilDataMahasiswa();
        System.out.print("Pilih nomor data yang akan diedit \t: ");
        pilihEdit = sc.nextByte();

        int edit = pilihEdit - 1;

        // Mengganti nilai dari indeks array
        System.out.print("Masukkan Nama Mahasiswa \t\t: ");
        strMahasiswa[edit][0] = sc.next();

        System.out.print("Masukkan Kelas \t\t\t\t: ");
        strMahasiswa[edit][1] = sc.next();

        System.out.print("Masukkan NIM \t\t\t\t: ");
        strMahasiswa[edit][2] = sc.next();

        System.out.print("Masukkan Nomor Telepon \t\t\t: ");
        strMahasiswa[edit][3] = sc.next();

        System.out.print("Masukkan Semester Yang Dilewati \t: ");
        intMahasiswa[edit][0] = sc.nextByte();

        System.out.print("Masukkan jumlah alpha \t\t\t: ");
        intMahasiswa[edit][1] = sc.nextShort();

        // jumlah kompen jumlah alpha semester yg dilewati
        intMahasiswa[edit][2] = intMahasiswa[edit][1] * 2 * intMahasiswa[edit][0];

        System.out.println("Status kompen \t\t\t\t: ");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Pilih (1/2) \t\t\t\t: ");
        intMahasiswa[edit][3] = sc.nextInt();

        if (intMahasiswa[edit][3] == 1) {
            System.out.print("Pekerjaan yang dikerjakan \t\t: ");
            strMahasiswa[edit][4] = sc.next();
        } else {
            strMahasiswa[edit][4] = "-";
        }

        defaultTempVar();
        // Output
        tampilDataMahasiswa();
    }

    // Hapus data mahasiswa
    static void hapusDataMahasiswa() {

        System.out.print("Pilih nomor data yang akan dihapus \t: ");
        pilihHapus = sc.nextByte();

        int hapus = pilihHapus - 1;

        if (pilihHapus == strMahasiswa.length) {
            for (int i = 0; i < strMahasiswa[1].length; i++) {
                strMahasiswa[hapus][i] = null;
            }
            for (int i = 0; i < intMahasiswa[1].length; i++) {
                intMahasiswa[hapus][i] = 0;
            }
        } else {
            for (int i = hapus; i < strMahasiswa.length - 1; i++) {
                int next = i + 1;
                
                // mengisi index kosong
                for (int k = 0; k < strMahasiswa[0].length; k++) {
                    strMahasiswa[i][k] = strMahasiswa[next][k];
                }

                for (int k = 0; k < intMahasiswa[0].length; k++) {
                    intMahasiswa[i][k] = intMahasiswa[next][k];
                }

                // mengubah menjadi nilai default
                for (int j = 0; j < strMahasiswa[0].length; j++) {
                    strMahasiswa[next][j] = null;
                }

                for (int j = 0; j < intMahasiswa[0].length; j++) {
                    intMahasiswa[next][j] = 0;
                }
            }
        }
        System.out.println("Berhasil menghapus data");
        tampilDataMahasiswa();
    }

    static boolean Lanjut(boolean kembali, char plh) {
        boolean lagi = true;
        if (plh == '1') {
            Login(null, null, plh);
        } else if (plh == '2') {
            Register(null, plh);
        } else if (plh != '1' || plh != '2') {
            System.out.println("Pilihan tidak tersedia");
            System.out.print("Apakah anda ingin kembali ke laman awal (ya/tidak) : ");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("ya")) {
                lagi = true;
            } else {
                lagi = false;
            }
        }
        return lagi;
    }

    public static void main(String[] args) {

        String[][] users = new String[100][2];
        String[][] userAdmin = new String[3][2];
        userAdmin[0][0] = "Admin1";
        userAdmin[0][1] = "Admin45";
        userAdmin[1][0] = "Admin2";
        userAdmin[1][1] = "Admin245";
        userAdmin[2][0] = "Admin3";
        userAdmin[2][1] = "Admin345";

        char plh;
        int numUsers = 0; // Untuk melacak jumlah pengguna yang sudah diregistrasi
        boolean kembali = true;
        do {
            System.out.println("================================================");
            System.out.println("------------------------------------------------");
            System.out.println("||\t SISTEM KOMPENSASI MAHASISWA \t ||");
            System.out.println("================================================");
            System.out.println("\t\t1.Login \t\t ");
            System.out.println("\t\t2.Register \t\t ");
            System.out.print("\t\tpilih (1/2) :");
            plh = sc.next().charAt(0);
            sc.nextLine(); // Membersihkan newline dari buffer masukan
            System.out.println("------------------------------------------------");
            System.out.println("================================================");

            switch (plh) {
            case '1':
            Login(users, userAdmin, numUsers);
            break;
            case '2':
            Register(users, numUsers);
            break;

            default:
            Lanjut(kembali, plh);
            }

            // dataMahasiwa();
        } while (kembali);
    }
}
