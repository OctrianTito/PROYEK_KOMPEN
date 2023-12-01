import java.util.Scanner;

public class lamanawal {
    static Scanner sc = new Scanner(System.in);

    // Array data

    static String StrMahasiswa[][] = new String[5][5];
    static int IntMahasiswa[][] = new int[5][4];

    // Variabel data sementara
    static String namaMhs, NIM, kelas,
            nomorTlp, pekerjaan;
    static int jmlKompen, validSiswa,
            semesterYgDilewati, jmlAlpha;

    static void defaultVar(){
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
        StrMahasiswa[0][0] = "afif"; // nama
        StrMahasiswa[0][1] = "TI-1H"; // kelas
        StrMahasiswa[0][2] = "235445"; // nim
        StrMahasiswa[0][3] = "0854753"; // no telp
        IntMahasiswa[0][0] = 2; // semester yg dilewati
        IntMahasiswa[0][1] = 3; // jml alpha
        IntMahasiswa[0][2] = 8; // poin kompen
        IntMahasiswa[0][3] = 1; // validasi
        StrMahasiswa[0][4] = "tes"; // pekerjaan siswa

        // Contoh data 2
        StrMahasiswa[1][0] = "andi"; // nama
        StrMahasiswa[1][1] = "TI-1H"; // kelas
        StrMahasiswa[1][2] = "235445"; // nim
        StrMahasiswa[1][3] = "0854753"; // no telp
        IntMahasiswa[1][0] = 2; // semester yg dilewati
        IntMahasiswa[1][1] = 3; // jml alpha
        IntMahasiswa[1][2] = 8; // poin kompen
        IntMahasiswa[1][3] = 1; // validasi
        StrMahasiswa[1][4] = "-"; // pekerjaan siswa

        // Contoh data 2
        StrMahasiswa[2][0] = "anya"; // nama
        StrMahasiswa[2][1] = "TI-1H"; // kelas
        StrMahasiswa[2][2] = "235445"; // nim
        StrMahasiswa[2][3] = "0854753"; // no telp
        IntMahasiswa[2][0] = 2; // semester yg dilewati
        IntMahasiswa[2][1] = 3; // jml alpha
        IntMahasiswa[2][2] = 8; // poin kompen
        IntMahasiswa[2][3] = 1; // validasi
        StrMahasiswa[2][4] = "tes"; // pekerjaan siswa

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
        for (int i = 0; i < StrMahasiswa.length; i++) {
            if (StrMahasiswa[i][0] == null) {
                StrMahasiswa[i][0] = namaMhs; // nama
                StrMahasiswa[i][1] = kelas; // kelas
                StrMahasiswa[i][2] = NIM; // nim
                StrMahasiswa[i][3] = nomorTlp; // no telp
                IntMahasiswa[i][0] = semesterYgDilewati; // semester yg dilewati
                IntMahasiswa[i][1] = jmlAlpha; // jml alpha
                IntMahasiswa[i][2] = jmlKompen; // poin kompen
                IntMahasiswa[i][3] = validSiswa; // validasi
                StrMahasiswa[i][4] = pekerjaan; // pekerjaan siswa

                System.out.println("\nBerhasil menambahkan data\n");

                break;
            } else {
                continue;
            }
        }
        defaultVar();

        // output
        tampilDataMahasiswa();
    }

    // Tampil data mahasiswa
    static void tampilDataMahasiswa() {
        System.out.println("=========================");
        System.out.println();
        for (int i = 0, j = 1; i < StrMahasiswa.length && j <= 5; i++, j++) {
            if (StrMahasiswa[i][0] != null) {
                System.out.println((j) + ". Nama Mahasiswa \t\t= " + StrMahasiswa[i][0]);
                System.out.println("   Kelas \t\t\t= " + StrMahasiswa[i][1]);
                System.out.println("   NIM \t\t\t\t= " + StrMahasiswa[i][2]);
                System.out.println("   Nomor Telepon \t\t= " + StrMahasiswa[i][3]);
                System.out.println("   Semester Yang Dilewati \t= " + IntMahasiswa[i][0]);
                System.out.println("   Jumlah Alpha \t\t= " + IntMahasiswa[i][1]);
                System.out.println("   Jumlah Kompen \t\t= " + IntMahasiswa[i][2]);

                String statusKompen = IntMahasiswa[i][3] == 1 ? "Ada" : "Tidak ada";

                System.out.println("   Status kompen \t\t= " + statusKompen);
                System.out.println("   Pekerjaan yang dikerjkan \t= " + StrMahasiswa[i][4]);

                System.out.println();
            }
        }
        System.out.println("=========================");
        System.out.println();
    }

    // Edit data mahasiswa
    static void editDataMahasiswa() {
        tampilDataMahasiswa();
        System.out.print("Pilih nomor data yang akan diedit \t: ");
        pilihEdit = sc.nextByte();

        // Mengganti nilai dari indeks array
        System.out.print("Masukkan Nama Mahasiswa \t\t: ");
        StrMahasiswa[pilihEdit - 1][0] = sc.next();

        System.out.print("Masukkan Kelas \t\t\t\t: ");
        StrMahasiswa[pilihEdit - 1][1] = sc.next();

        System.out.print("Masukkan NIM \t\t\t\t: ");
        StrMahasiswa[pilihEdit - 1][2] = sc.next();

        System.out.print("Masukkan Nomor Telepon \t\t\t: ");
        StrMahasiswa[pilihEdit - 1][3] = sc.next();

        System.out.print("Masukkan Semester Yang Dilewati \t: ");
        IntMahasiswa[pilihEdit - 1][0] = sc.nextByte();

        System.out.print("Masukkan jumlah alpha \t\t\t: ");
        IntMahasiswa[pilihEdit - 1][1] = sc.nextShort();

        // jumlah kompen                jumlah alpha                    semester yg dilewati
        IntMahasiswa[pilihEdit - 1][2] = IntMahasiswa[pilihEdit - 1][1] * 2 * IntMahasiswa[pilihEdit - 1][0];

        System.out.println("Status kompen \t\t\t\t: ");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Pilih (1/2) \t\t\t\t: ");
        IntMahasiswa[pilihEdit - 1][3] = sc.nextInt();

        if (IntMahasiswa[pilihEdit - 1][3] == 1) {
            System.out.print("Pekerjaan yang dikerjakan \t\t: ");
            StrMahasiswa[pilihEdit - 1][4] = sc.next();
        } else {
            StrMahasiswa[pilihEdit - 1][4] = "-";
        }

        defaultVar();
        // Output
        tampilDataMahasiswa();
    }

    // Hapus data mahasiswa
    static void hapusDataMahasiswa() {
        // work in progress
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
