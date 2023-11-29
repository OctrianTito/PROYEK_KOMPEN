import java.util.Scanner;

public class lamanawal {
    static Scanner sc = new Scanner(System.in);

    // Array data
    static String namaMahasiswa[] = new String[5],
            nomorTelepon[] = new String[5],
            nim[] = new String[5],
            pekerjaanMahasiswa[] = new String[5]; 

    static int jumlahKompen[] = new int[5], 
                semesterYangDilewati[] = new int[5], 
                jumlahAlpha[] = new int[5], 
                validasiSiswa[] = new int[5];


    // Variabel data sementara
    static String namaMhs, NIM,
                nomorTlp, pekerjaan;
    static int jmlKompen, validSiswa,
                semesterYgDilewati, jmlAlpha;

    // variabel pemilihan
    char stop;
    static short pilihEdit, pilihHapus;
    boolean run = true;

    // fungsi fleksibel
    static void inputStringArray(String str, String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = str;
                break;
            } else {
                continue;
            }
        }
    }

    static void inputIntArray(int num, int[] arr){
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
        namaMahasiswa[0] = "afif";
        nim[0] = "235445";
        nomorTelepon[0] = "0854753";
        semesterYangDilewati[0] = 2;
        jumlahAlpha[0] = 3;
        jumlahKompen[0] = 8;
        validasiSiswa[0] = 1;
        pekerjaanMahasiswa[0] = "tes";

        // Contoh data 2
        namaMahasiswa[1] = "andi";
        nim[1] = "232355";
        nomorTelepon[1] = "0898347";
        semesterYangDilewati[1] = 3;
        jumlahAlpha[1] = 1;
        jumlahKompen[1] = 6;
        validasiSiswa[0] = 2;
        pekerjaanMahasiswa[0] = null;

        // Contoh data 2
        namaMahasiswa[2] = "anya";
        nim[2] = "232355";
        nomorTelepon[2] = "0893447";
        semesterYangDilewati[2] = 2;
        jumlahAlpha[2] = 1;
        jumlahKompen[2] = 4;
        validasiSiswa[0] = 1;
        pekerjaanMahasiswa[0] = "tes";

        tampilDataMahasiswa();

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
                    tambahDataMahasiswa();
                    break;
                case 2:
                    tampilDataMahasiswa();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

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

        if (validSiswa == 1 ) {
            System.out.println("Pekerjaan yang dikerjakan \t: ");
            pekerjaan = sc.next();
        } else {
            pekerjaan = null;
        }

        inputStringArray(namaMhs, namaMahasiswa);
        inputStringArray(NIM, nim);
        inputStringArray(nomorTlp, nomorTelepon);
        inputIntArray(semesterYgDilewati, semesterYangDilewati);
        inputIntArray(jmlAlpha, jumlahAlpha);
        inputIntArray(jmlKompen, jumlahKompen);
        inputIntArray(validSiswa, validasiSiswa);
        inputStringArray(pekerjaan, pekerjaanMahasiswa);
        // Memasukkan ke array dari variabel sementara
        // for (int j = 0; j < 5; j++) {
        //     if (namaMahasiswa[j] == null) {
        //         namaMahasiswa[j] = namaMhs;
        //         nim[j] = NIM;
        //         nomorTelepon[j] = nomorTlp;
        //         semesterYangDilewati[j] = semesterYgDilewati;
        //         jumlahAlpha[j] = jmlAlpha;
        //         jumlahKompen[j] = jmlKompen;
        //         semesterYangDilewati[j] = semesterYgDilewati;
        //         break;
        //     } else {
        //         continue;
        //     }
        // }
    }

    // Tampil data mahasiswa
    static void tampilDataMahasiswa() {
        System.out.println("=========================");
        System.out.println();
        for (int k = 0, j = 1; k < namaMahasiswa.length && j <= 5; k++, j++) {
            if (namaMahasiswa[k] != null) {
                System.out.println((j) + ". Nama Mahasiswa \t\t= " + namaMahasiswa[k]);
                System.out.println("   NIM \t\t\t\t= " + nim[k]);
                System.out.println("   Nomor Telepon \t\t= " + nomorTelepon[k]);
                System.out.println("   Semester Yang Dilewati \t= " + semesterYangDilewati[k]);
                System.out.println("   Jumlah Alpha \t\t= " + jumlahAlpha[k]);
                System.out.println("   Jumlah Kompen \t\t= " + jumlahKompen[k]);
                
                String statusKompen = validasiSiswa[k] == 1 ? "Ada" : "Tidak ada";

                System.out.println("   Status kompen \t\t= " + statusKompen);
                if (validasiSiswa[k] != 0) {
                    System.out.println("   Pekerjaan yang dikerjkan \t= " + pekerjaanMahasiswa[k]);    
                }
                System.out.println();
            }
        }
        System.out.println("=========================");
        System.out.println();
    }

    // Edit data mahasiswa
    static void editDataMahasiswa() {
        System.out.print("Pilih nomor data yang akan diedit \t: ");
        pilihEdit = sc.nextByte();

        // Mengganti nilai dari indeks array
        System.out.print("Masukkan Nama Mahasiswa \t\t: ");
        namaMahasiswa[pilihEdit - 1] = sc.next();

        System.out.print("Masukkan NIM \t\t\t\t: ");
        nim[pilihEdit - 1] = sc.next();

        System.out.print("Masukkan Nomor Telepon \t\t\t: ");
        nomorTelepon[pilihEdit - 1] = sc.next();

        System.out.print("Masukkan Semester Yang Dilewati \t: ");
        semesterYangDilewati[pilihEdit - 1] = sc.nextByte();

        System.out.print("Masukkan jumlah alpha \t\t\t: ");
        jumlahAlpha[pilihEdit - 1] = sc.nextShort();

        jumlahKompen[pilihEdit - 1] = jumlahAlpha[pilihEdit - 1] * 2 * semesterYangDilewati[pilihEdit - 1];

        // Output
        tampilDataMahasiswa();
    }

    // Hapus data mahasiswa
    static void hapusDataMahasiswa(){
        // work in progress
    }

    static boolean Lanjut(boolean kembali, char plh) {
        boolean lagi = true;
        if (plh == '1') {
            Login(null, null, plh);
        } else if (plh == '2') {
            Register(null, plh);
        } else if (plh != '1'||plh!='2'){
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
            // System.out.println("================================================");
            // System.out.println("------------------------------------------------");
            // System.out.println("||\t  SISTEM KOMPENSASI MAHASISWA \t      ||");
            // System.out.println("================================================");
            // System.out.println("\t\t1.Login   \t\t      ");
            // System.out.println("\t\t2.Register   \t\t      ");
            // System.out.print("\t\tpilih (1/2) :");
            // plh = sc.next().charAt(0);
            // sc.nextLine(); // Membersihkan newline dari buffer masukan
            // System.out.println("------------------------------------------------");
            // System.out.println("================================================");

            // switch (plh) {
            //     case '1':
            //         Login(users, userAdmin, numUsers);
            //         break;
            //     case '2':
            //         Register(users, numUsers);
            //         break;

            //     default:
            //         Lanjut(kembali, plh);
            // }  

            dataMahasiwa();
        } while (kembali);
    }
}
