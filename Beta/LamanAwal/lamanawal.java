import java.util.Scanner;

public class lamanawal {
    static Scanner sc = new Scanner(System.in);
    static int maxPeraturan = 20;
    // Data Array
    static String strMahasiswa[][] = new String[20][7];
    static int intMahasiswa[][] = new int[20][4];

    static String listKompen[][] = new String[6][3];
    static String listPeraturan[] = new String[maxPeraturan];
    static int poinPelanggaran[] = new int[maxPeraturan];
    // Data User
    static String[][] users = new String[50][3];
    static String[][] userAdmin = new String[3][2];
    static String[][] userdosen = new String[8][2];

    // Variabel data sementarauserAdmin[0][0] = "Admin1"; //Username Admin1

    static String namaMhs, NIM, kelas,
            nomorTlp, pekerjaan, username, password;
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
        username = null;
        password = null;
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
    static void Login(int numUsers) {
        String usernameInput, passInput;
        System.out.print("Masukkan Username : ");
        usernameInput = sc.nextLine();
        System.out.print("Masukkan Password : ");
        passInput = sc.nextLine();
        System.out.println("================================================");
        System.out.println("------------------------------------------------");

        boolean found = false;

        for (int i = 0; i < numUsers || i < userAdmin.length; i++) {
            if (usernameInput.equals(users[i][0]) && passInput.equals(users[i][1])) {
                found = true;
                System.out.println("\tAnda berhasil login!.");
                break;
            } else if (usernameInput.equals(userAdmin[i][0]) && passInput.equals(userAdmin[i][1])) {
                found = true;
                System.out.println("------------------------------------------------");
                System.out.println("================================================");
                System.out.println("\tAnda berhasil Login sebagai Admin");
                System.out.println("================================================");
                System.out.println("------------------------------------------------");

                LamanAdmin();

            } else if (usernameInput.equals(userdosen[i][0]) && passInput.equals(userdosen[i][1])) {
                found = true;
                System.out.println("------------------------------------------------");
                System.out.println("================================================");
                System.out.println("\tAnda berhasil Login sebagai Dosen");
                System.out.println("================================================");
                System.out.println("------------------------------------------------");

                LamanDosen();

            }

        }
        if (!found) {
            System.out.println();
            System.out.println("      Username atau password tidak terdaftar");
            System.out.println("\tCoba Registrasi dahulu");
        }
    }
    // Fungsi Menu Mahasiswa
    static void lamanMahasiswa() {
        do {
            System.out.println("================================================");
            System.out.println("------------------------------------------------");
            System.out.println("\t\t LAMAN MAHASISWA ");
            System.out.println("------------------------------------------------");
            System.out.println("================================================");
            System.out.println("\t\t1.Informasi Jumlah Kompen\t\t ");
            System.out.println("\t\t2.List Kompen\t\t ");
            System.out.println("\t\t3.Pembayaran Kompen\t\t ");
            System.out.println("\t\t4.Logout\t\t ");

            System.out.print("\t\tpilih (1/2/3/4) :");
            char plhMenuMhs = sc.next().charAt(0);
            sc.nextLine(); // Membersihkan newline dari buffer masukan
            System.out.println("------------------------------------------------");
            System.out.println("================================================");
            switch (plhMenuMhs) {
                case '1':

                    break;
                case '2':
                    pilihPekerjaan();
                    break;
                case '3':
                    pembayaran();
                    break;
                case '4':
                    System.out.println("\tAnda berhasil logout.");
                    return;
                default :
                    break;
            }
             if (plhMenuMhs != '4') {
                System.out.print("Ingin Kembali ke laman DOSEN ? (ya/tidak) : ");
            }
        } 
        while (sc.next().equalsIgnoreCase("ya")); 
    }
    // Fungsi Menu Dosen
    static void LamanDosen() {
        do {
            System.out.println("================================================");
            System.out.println("------------------------------------------------");
            System.out.println("\t\t LAMAN DOSEN ");
            System.out.println("------------------------------------------------");
            System.out.println("================================================");
            System.out.println("\t\t1.Absensi Mahasiswa\t\t ");
            System.out.println("\t\t2.List Kompen\t\t ");
            System.out.println("\t\t3.Point Pelanggaran\t\t ");
            System.out.println("\t\t4.Validasi Kompen\t\t ");
            System.out.println("\t\t5.Logout\t\t ");

            System.out.print("\t\tpilih (1/2/3/4/5) :");
            char plhadmn = sc.next().charAt(0);
            sc.nextLine(); // Membersihkan newline dari buffer masukan
            System.out.println("------------------------------------------------");
            System.out.println("================================================");
            switch (plhadmn) {
                case '1':
                    AbsenMahasiswa();
                    break;
                case '2':
                    listKompen();
                    break;
                // case '3':

                // break;
                case '4':
                    Validasi();
                    break;
                case '5':
                    System.out.println("\tAnda berhasil logout.");
                    return;
                default:
                    break;
            }
            if (plhadmn != '5') {
                System.out.print("Ingin Kembali ke laman DOSEN ? (ya/tidak) : ");
            }
        } while (sc.next().equalsIgnoreCase("ya"));
    }

    // Fungsi Absensi Mahasiswa
    static void AbsenMahasiswa() {
        System.out.println("================================================");
        System.out.println("------------------------------------------------");
        System.out.println("\t\t Absensi Mahasiswa");
        System.out.println("------------------------------------------------");
        System.out.println("================================================");
        System.out.print("Pilih kelas : ");
        String plhks = sc.next();
        System.out.println("================================================");

        for (int i = 0; i < strMahasiswa.length; i++) {
            if (plhks.equalsIgnoreCase(strMahasiswa[i][1])) {
                System.out.println("Berikut Daftar Nama Mahasiswa");
                System.out.println("================================================");

                for (int j = 0; j < strMahasiswa.length; j++) {
                    if (plhks.equalsIgnoreCase(strMahasiswa[j][1])) {
                        System.out.println(strMahasiswa[j][0]);
                    }
                }

                System.out.println("================================================");
                System.out.print("Pilih Nama Mahasiswa : ");
                String plhnm = sc.next();

                for (int k = 0; k < strMahasiswa.length; k++) {
                    if (plhnm.equalsIgnoreCase(strMahasiswa[k][0])) {
                        System.out.println("================================================");
                        System.out.print("Masukkan Jumlah Alpha : ");
                        int hmlalp = sc.nextInt();
                        intMahasiswa[k][1] += hmlalp;
                    }
                }
                break;
            }
        }
    }

    // Fungsi Menu Admin
    static void LamanAdmin() {
        do {
            System.out.println("================================================");
            System.out.println("------------------------------------------------");
            System.out.println("\t\t LAMAN ADMIN ");
            System.out.println("------------------------------------------------");
            System.out.println("================================================");
            System.out.println("\t\t1.Penambahan User \t\t ");
            System.out.println("\t\t2.Data Mahasiswa\t\t ");
            System.out.println("\t\t3.Perhitungan Kompen\t\t ");
            System.out.println("\t\t4.List Kompen\t\t ");
            System.out.println("\t\t5.Validasi Kompen\t\t ");
            System.out.println("\t\t6.Peraturan\t\t ");
            System.out.println("\t\t7.Logout\t\t ");

            System.out.print("\t\tpilih (1/2/3/4/5/6/) :");
            char plhadmn = sc.next().charAt(0);
            sc.nextLine(); // Membersihkan newline dari buffer masukan
            System.out.println("------------------------------------------------");
            System.out.println("================================================");
            switch (plhadmn) {
                case '1':
                    PenambahanUser(strMahasiswa, plhadmn);
                    break;
                case '2':
                    dataMahasiwa();
                    break;
                case '3':
                    PerhitunganKompen();
                    break;
                case '4':
                    listKompen();
                    break;
                case '5':
                    Validasi();
                    break;
                case '6':
                    Peraturan();
                    break;
                case '7':
                    System.out.println("\tAnda berhasil logout.");
                    return;
                default:
                    break;
            }
            if (plhadmn != '7') {
                System.out.print("Ingin Kembali ke laman Admin? (ya/tidak) : ");
            }
        } while (sc.next().equalsIgnoreCase("ya"));
    }

    // Fungsi Penambahan User
    static void PenambahanUser(String[][] users, int numUsers) {

        String tmbh = "Y", knfrms = "Y";

        // Menu Rgister User
        System.out.println("Menu");
        System.out.println("1.menambahkan username");
        System.out.println("2.melihat data user ");
        System.out.println("3.Kembali ke laman awal ");
        System.out.print("Masukkan pilihan anda (1/2/3) : ");
        int menu = sc.nextInt();

        // pemilihan menu
        switch (menu) {
            // menu 1 memasukkan username and password
            case 1:
                System.out.println("================================================");
                System.out.println("\t\t Penambahan User ");
                System.out.println("------------------------------------------------");
                for (int i = 0; i < users.length; i++) {
                    System.out.print("Masukkan Username : ");
                    users[i][0] = sc.next();
                    System.out.print("Masukkan Password : ");
                    users[i][1] = sc.next();

                    System.out.print("Apakah anda akan menambahkan lagi (Y/N): ");
                    tmbh = sc.next();
                    if (tmbh.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        break;
                    }

                }
                break;
            // menu 2 melihat data yang telah dimasukkan
            case 2:
                System.out.println("================================================");
                System.out.println("\t\t Data User Terdaftar ");
                System.out.println("------------------------------------------------");

                for (int i = 0; i < numUsers; i++) {
                    System.out.println(
                            "Username: " + users[i][0] + ", Password: " + users[i][1] + ", Nama: " + users[i][2]);
                }

                System.out.println("================================================");
                break;
            // Kembali kelaman awal
            case 3:
                return;
        }

    }

    // Fungsi Data mahasiswa
    static void dataMahasiwa() {

        // variabel pemilihan
        short pilihEdit, pilihHapus;
        boolean run = true;

        // tampilDataMahasiswa();

        do {
            // Pemilihan aksi
            System.out.println("Pilih aksi \n");
            System.out.println("1. Tambah data mahasiswa");
            System.out.println("2. Lihat data mahasiswa");
            System.out.println("3. Edit data mahasiswa");
            System.out.println("4. Hapus data mahasiswa");
            System.out.println("0. Kembali ke Laman Admin");

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
                    run = false;
                    return;
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

        jmlAlpha = 0;

        validSiswa = 2;
        pekerjaan = "-";

        // Memasukkan ke array dari variabel sementara
        for (int i = 0; i < strMahasiswa.length; i++) {
            if (strMahasiswa[i][0] == null) {
                strMahasiswa[i][0] = namaMhs; // nama
                strMahasiswa[i][1] = kelas; // kelas
                strMahasiswa[i][2] = NIM; // nim
                strMahasiswa[i][3] = nomorTlp; // no telp
                intMahasiswa[i][3] = validSiswa; // validasi
                strMahasiswa[i][4] = pekerjaan; // pekerjaan siswa
                strMahasiswa[i][5] = username; // username siswa
                strMahasiswa[i][6] = password; // password siswa

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

        // jumlah kompen jumlah alpha semester yg dilewati
        // intMahasiswa[edit][2] = intMahasiswa[edit][1] * 2 * intMahasiswa[edit][0];

        System.out.println("Status kompen \t\t\t\t: ");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Pilih (1/2) \t\t\t\t: ");
        intMahasiswa[edit][3] = sc.nextInt();
        sc.nextLine();
        if (intMahasiswa[edit][3] == 1) {
            System.out.print("Pekerjaan yang dikerjakan \t\t: ");
            strMahasiswa[edit][4] = sc.nextLine();
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

    // Fungsi Register
    static void Register(String[][] users, int numUsers) {
        System.out.println("================================================");
        System.out.println("------------------------------------------------");
        System.out.println("\t\t LAMAN REGISTRASI ");
        System.out.println("------------------------------------------------");
        System.out.println("================================================");

        // Memasukkan username and password
        System.out.print("Masukkan Username : ");
        String usernameInput = sc.nextLine();
        System.out.print("Masukkan Password : ");
        String passInput = sc.nextLine();

        // Pengecekan ada tidaknya username
        boolean usernameExists = false;
        for (int i = 0; i < numUsers; i++) {
            if (usernameInput.equals(users[i][0])) {
                usernameExists = true;
                break;
            }
        }

        if (usernameExists) {
            System.out.println("Username sudah terdaftar. Silakan pilih username lain.");
        } else {
            // Pengecekan data Mahasiswa
            System.out.print("Masukkan Nama Mahasiswa : ");
            String namaMhsInput = sc.nextLine();
            System.out.print("Masukkan Kelas Mahasiswa : ");
            String kelasInput = sc.nextLine();
            boolean dataExists = false;
            for (int i = 0; i < strMahasiswa.length; i++) {
                if (namaMhsInput.equals(strMahasiswa[i][0]) && kelasInput.equals(strMahasiswa[i][1])) {
                    dataExists = true;
                    break;
                }
            }

            if (dataExists) {
                System.out.println("Data mahasiswa dengan nama dan kelas tersebut sudah ada.");
            } else {
                users[numUsers][1] = usernameInput;
                users[numUsers][2] = passInput;
                users[numUsers][0] = namaMhsInput;
                strMahasiswa[numUsers][5] = usernameInput;
                strMahasiswa[numUsers][6] = passInput;
                numUsers++;

                System.out.println("Registrasi berhasil!");
            }
        }
    }

    // Fungsi Lanjut
    static boolean Lanjut(boolean kembali, char plh) {
        boolean lagi = true;
        if (plh == '1') {
            Login(plh);
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

    static void PerhitunganKompen() {
        perhitungan();
    }

    static void perhitungan() {

        int totAlphaKompen = 0;
        char answer = 'y';
        do {
            System.out.println("================================================");
            System.out.println("------------------------------------------------");
            System.out.println("\t\t Perhitungan Kompen ");
            System.out.println("------------------------------------------------");
            System.out.println("================================================");
            System.out.print("Pilih kelas : ");
            String plhks = sc.next();
            System.out.println("================================================");
            for (int i = 0; i < strMahasiswa.length; i++) {
                if (plhks.equalsIgnoreCase(strMahasiswa[i][1])) {
                    System.out.println("Berikut Daftar Nama Mahasiswa");
                    System.out.println("================================================");
    
                    for (int j = 0; j < strMahasiswa.length; j++) {
                        if (plhks.equalsIgnoreCase(strMahasiswa[j][1])) {
                            System.out.println(strMahasiswa[j][0]);
                        }
                    }
    
                    System.out.println("================================================");
                    System.out.print("Pilih Nama Mahasiswa : ");
                    String plhnm = sc.next();

                    int semester, totAlpha1 ;

                    for (int k = 0; k < strMahasiswa.length; k++) {
                        if (plhnm.equalsIgnoreCase(strMahasiswa[k][0])) {
                            System.out.printf("================================================================\n");
                            System.out.print("Masukkan Jumlah Semester Yang Dilewati "+strMahasiswa[k][0]+"\t: ");
                            semester = sc.nextInt();
                            intMahasiswa[k][0] = semester;
                            System.out.printf("================================================================\n");
                            
                            totAlpha1 = intMahasiswa[k][1]* 2;

                            if (semester > 0) {
                                if (semester == 1) {
                                    totAlphaKompen = totAlpha1 * 2;
                                    System.out.println("Total Kompen \t\t: " + totAlphaKompen);
                                    intMahasiswa[k][2] = totAlphaKompen;
                                    break;
                                } else if (semester == 2) {
                                    totAlphaKompen = totAlpha1 * 4;
                                    System.out.println("Total Kompen \t\t: " + totAlphaKompen);
                                    intMahasiswa[k][2] = totAlphaKompen;
                                    break;
                                } else if (semester == 3 ) {
                                    totAlphaKompen = totAlpha1 * 8;
                                    System.out.println("Total Kompen \t\t: " + totAlphaKompen);
                                    intMahasiswa[k][2] = totAlphaKompen;
                                    break;
                                } else if (semester == 4) {
                                    totAlphaKompen = totAlpha1 * 16;
                                    System.out.println("Total Kompen \t\t: " + totAlphaKompen);
                                    intMahasiswa[k][2] = totAlphaKompen;
                                    break;
                                } else  if (semester == 5) {
                                    totAlphaKompen = totAlpha1 * 32;
                                    System.out.println("Total Kompen \t\t: " + totAlphaKompen);
                                    intMahasiswa[k][2] = totAlphaKompen;
                                    break;
                                } else if (semester == 6) {
                                    totAlphaKompen = totAlpha1 * 64;
                                    System.out.println("Total Kompen \t\t: " + totAlphaKompen);
                                    intMahasiswa[k][2] = totAlphaKompen;
                                    break;
                                } else if (semester == 7) {
                                    totAlphaKompen = totAlpha1 * 128;
                                    System.out.println("Total Kompen \t\t: " + totAlphaKompen);
                                    intMahasiswa[k][2] = totAlphaKompen;
                                    break;
                                } else {
                                    System.out.println("Mohon Maaf Semester Yang Anda Masukkan Salah");
                                }
                                
                            } else if (semester == 0) {
                                System.out.println("Total Alpha \t\t: " + totAlpha1);
                                intMahasiswa[k][2] = totAlpha1;
                                break;
                                }
                        }
                    }
                    break;
                }
            }
            System.out.print("Apakah ingin menambahkan lagi? (y/n) : ");
            answer = sc.next().charAt(0);
            if (answer == 'y' || answer == 'Y') {
                continue;
            } else {
                break;
            }
        }  while (answer == 'Y' || answer == 'y');  
    }

    static void pembayaran(int totAlphaKompen) {
        do {
            Scanner sc = new Scanner(System.in);
            int jmlYangDikerjakan;
            String konfirmasi;
            System.out.printf("----------------------------------------------------------------\n");
            System.out.print("Apakah anda ingin membayar kompen? (y/t) : ");
            konfirmasi = sc.next();
            System.out.printf("----------------------------------------------------------------\n");

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Masukkan jumlah kompen yang telah anda kerjakan : ");
                jmlYangDikerjakan = sc.nextInt();

                if (jmlYangDikerjakan <= totAlphaKompen) {
                    totAlphaKompen -= jmlYangDikerjakan;
                    System.out.printf("----------------------------------------------------------------\n");
                    System.out.print("Sisa total kompen anda adalah : " + totAlphaKompen + "\n");
                } else {
                    System.out.printf("----------------------------------------------------------------\n");
                    System.out.print("Sisa total kompen anda adalah : " + totAlphaKompen + "\n");
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.print("Sisa total kompen anda adalah : " + totAlphaKompen + "\n");
                System.out.println();
                System.out.printf("----------------------------------------------------------------\n");
                System.out.println("Jangan lupa untuk membayar sisa kompen anda!");
                break;
            }
        }
        
        while (totAlphaKompen > 0);
        if (totAlphaKompen == 0) {
            System.out.printf("----------------------------------------------------------------\n");
            System.out.println("Terimakasih Telah Membayar Kompen!");
            System.out.printf("----------------------------------------------------------------\n");
        }
    }

    static void listKompen() {
        boolean runList = true;
        do {
        System.out.println("============================");
            System.out.println("===== Daftar Pekerjaan =====");
            System.out.println("============================\n");
            System.out.println("Pilih aksi \n");
            System.out.println("1. Tambah Pekerjaan");
            System.out.println("2. Lihat Pekerjaan");
            System.out.println("3. keluar");

            System.out.print("\npilih: ");
            byte pilihListKompen = sc.nextByte();
            System.out.println();

            switch (pilihListKompen) {
                case 1:
                    String listKompen[][] = inputListKompen();
                    break;

                case 2:
                    outputListKompen();
                    break;

                case 3:
                    runList = false;
                    return;
                default:
                    break;
            }
        } while (runList);
    }

    static String[][] inputListKompen() {

        String hari[] = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu" };

        for (int i = 0; i < hari.length; i++) {
            System.out.println("Tambah pekerjaan di hari " + hari[i]);
            sc.nextLine();
            for (int j = 0, k = 1; j < listKompen[0].length; j++) {
                System.out.print("Pekerjaan " + (k++) + " : ");
                listKompen[i][j] = sc.nextLine();
            }
            System.out.println();

        }
        return listKompen;
    }

    static void pilihPekerjaan() {
        outputListKompen();
        int pilihKompen, pilihHari;

        System.out.print("Pilih Hari Pekerjaan : ");
        pilihHari = sc.nextInt();
        System.out.print("Pilih Nomor Pekerjaan : ");
        pilihKompen = sc.nextInt();

        int kompenYgDipilih = pilihKompen - 1;
        int hariYgDipilih = pilihHari - 1;
        System.out.println("\nPekerjaan yang dipilih \t\t\t\t: " + listKompen[kompenYgDipilih][hariYgDipilih] + "\n");
    }
    
    static void outputListKompen() {

        String hari[] = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu" };

        System.out.println("--------------------");
        System.out.println("Daftar perkerjaan :");
        System.out.println("--------------------");

        for (int i = 0, l = 1; i < listKompen.length; i++) {
            System.out.println((l++) + ". List pekerjaan hari " + hari[i]);
            for (int j = 0, k = 1; j < listKompen[0].length; j++) {
                System.out.println("   Pekerjaan ke-" + (k++) + " : " + listKompen[i][j]);
            }
            System.out.println();
        }
    }
    
    
    static void Validasi() {

        tampilDataMahasiswa();

        int pilihValidasi;

        System.out.print("Pilih Mahasiswa: ");
        pilihValidasi = sc.nextInt();

        int validasiMahasiswa = pilihValidasi - 1;

        System.out.println("\nNama mahasiswa \t\t\t\t: " + strMahasiswa[validasiMahasiswa][0] + "\n");

        System.out.println("Status kompen \t\t\t\t: ");
        System.out.println("1. Ada");
        System.out.println("2. Tidak ada");
        System.out.print("Pilih (1/2) \t\t\t\t: ");
        intMahasiswa[validasiMahasiswa][3] = sc.nextInt();
        sc.nextLine();
        if (intMahasiswa[validasiMahasiswa][3] == 1) {
            outputListKompen();
            System.out.println("\nPekerjaan yang dikerjakan \t\t ");

            System.out.print("Pilih hari: ");
            System.out.println();
            byte pilihHariKerja = sc.nextByte();
            System.out.print("Pilih pekerjaan: ");
            byte pilihKerja = sc.nextByte();
            System.out.println();

            strMahasiswa[validasiMahasiswa][4] = listKompen[pilihHariKerja - 1][pilihKerja - 1];
        } else {
            strMahasiswa[validasiMahasiswa][4] = "-";
        }

        System.out.println("===== Berhasil Memvalidasi =====");
        System.out.println("================================\n");

        System.out.println("Nama \t\t\t\t= " + strMahasiswa[validasiMahasiswa][0]);
        String statusValidasi = intMahasiswa[validasiMahasiswa][3] == 1 ? "Ada" : "Tidak ada";

        System.out.println("Status kompen \t\t\t= " + statusValidasi);
        System.out.println("Pekerjaan yang dikerjkan \t= " + strMahasiswa[validasiMahasiswa][4]);
    }

    static void Peraturan() {

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
                    System.out.println("Sampai Jumpa Lagi!");
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
                listPeraturan[i] = sc.next();

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
            if (listPeraturan[i] != null && poinPelanggaran[i] != 0) {
                System.out.println((i + 1) + "." + " " + listPeraturan[i]);
                System.out.printf("-------------------------------------------------------------\n");
                System.out.println("Poin Pelanggaran : " + poinPelanggaran[i]);
                System.out.printf("-------------------------------------------------------------\n");

            } else {
                continue;
            }
        }
    }

    static void ubahPeraturan() {

        int nomorPeraturan;

        System.out.print("Masukkan nomor peraturan yang ingin diubah : ");
        nomorPeraturan = sc.nextInt();
        System.out.println();

        System.out.print("Masukkan peraturan yang baru : ");
        listPeraturan[nomorPeraturan - 1] = sc.next();
        System.out.println();

        System.out.print("Masukkan poin pelanggaran yang baru : ");
        poinPelanggaran[nomorPeraturan - 1] = sc.nextInt();
    }

    static void hapusPeraturan() {

        int nomorPeraturan;

        System.out.print("Masukkan nomor peraturan yang ingin dihapus : ");
        nomorPeraturan = sc.nextInt();

        for (int i = nomorPeraturan - 1; i < maxPeraturan - 1; i++) {
            listPeraturan[i] = listPeraturan[i + 1];
            poinPelanggaran[i] = poinPelanggaran[i + 1];

        }
        System.out.println("Peraturan berhasil dihapus");
    }

    public static void main(String[] args) {
        // Data Username and Password Admin
        userAdmin[0][0] = "Admin1"; // Username Admin1
        userAdmin[0][1] = "Admin45"; // Password Admin1
        userAdmin[1][0] = "Admin2"; // Username Admin1
        userAdmin[1][1] = "Admin245"; // Password Admin2
        userAdmin[2][0] = "Admin3"; // Username Admin3
        userAdmin[2][1] = "Admin345"; // Password Admin3
        // Data Username and Password Dosen
        userdosen[0][0] = "Dosen1"; // Username Dosen 1
        userdosen[0][1] = "Dosen145"; // Password Dosen 1
        userdosen[1][0] = "Dosen2"; // Username Dosen 2
        userdosen[1][1] = "Dosen245"; // Password Dosen 2

        // Contoh data 1
        strMahasiswa[0][0] = "Muhammad Afif Al Ghifari"; // nama
        strMahasiswa[0][1] = "TI-1H"; // kelas
        strMahasiswa[0][2] = "2341720898"; // nim
        strMahasiswa[0][3] = "085475323796"; // no telp
        intMahasiswa[0][1] = 0;// alpha
        intMahasiswa[0][3] = 1; // validasi
        strMahasiswa[0][4] = "tes"; // pekerjaan siswa

        // Contoh data 2
        strMahasiswa[1][0] = "Fali Irham Maulana"; // nama
        strMahasiswa[1][1] = "TI-1H"; // kelas
        strMahasiswa[1][2] = "2342869293"; // nim
        strMahasiswa[1][3] = "085475321008"; // no telp
        intMahasiswa[1][1] = 0;// alpha
        intMahasiswa[1][3] = 1; // validasi
        strMahasiswa[1][4] = "-"; // pekerjaan siswa

        // Contoh data 3
        strMahasiswa[2][0] = "Octrian Adiluhung Tito Putra"; // nama
        strMahasiswa[2][1] = "TI-1H"; // kelas
        strMahasiswa[2][2] = "2341720078"; // nim
        strMahasiswa[2][3] = "085771220364"; // no telp
        intMahasiswa[2][1] = 0; // alpha
        intMahasiswa[2][3] = 1; // validasi
        strMahasiswa[2][4] = "tes"; // pekerjaan siswa

        // Contoh data 4
        strMahasiswa[3][0] = "arif"; // nama
        strMahasiswa[3][1] = "TI-1H"; // kelas
        strMahasiswa[3][2] = "235445"; // nim
        strMahasiswa[3][3] = "0854753"; // no telp
        intMahasiswa[3][1] = 2;// alpha
        intMahasiswa[3][3] = 1; // validasi
        strMahasiswa[3][4] = "tes"; // pekerjaan siswa

        // Contoh data 5
        strMahasiswa[4][0] = "asa"; // nama
        strMahasiswa[4][1] = "TI-1H"; // kelas
        strMahasiswa[4][2] = "235445"; // nim
        strMahasiswa[4][3] = "0854753"; // no telp
        intMahasiswa[4][1] = 0;// alpha
        intMahasiswa[4][3] = 1; // validasi
        strMahasiswa[4][4] = "tes"; // pekerjaan siswa

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
                    Login(numUsers);
                    break;
                case '2':
                    Register(users, numUsers);
                    break;
                default:
                    kembali = Lanjut(kembali, plh);
                    break;
            }

            // dataMahasiwa();
        } while (kembali);
    }
}