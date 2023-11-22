import java.util.Scanner;

public class lamanawal {
    static Scanner sc = new Scanner(System.in);

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
                System.out.println("\tAnda berhasil login.");
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
            // users[numUsers][0] = sc.nextLine();//membersihkan buffer
            System.out.print("Masukkan Password: ");
            users[numUsers][1] = sc.next();

            numUsers++; // Tambahkan jumlah pengguna yang telah diregistrasi
        } else {
            System.out.println("Kapasitas pengguna penuh. Tidak dapat menambahkan username.");

        }
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
            System.out.println("||\t  SISTEM KOMPENSASI MAHASISWA \t      ||");
            System.out.println("================================================");
            System.out.println("\t\t1.Login   \t\t      ");
            System.out.println("\t\t2.Register   \t\t      ");
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

                    if (plh == '1' || plh == '2') {
                        continue;
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                    break;
            }
            System.out.print("Apakah anda ingin kembali ke laman awal (ya/tidak) : ");
            String lagi = sc.nextLine();
            lagi = sc.nextLine();
            if (lagi.equalsIgnoreCase("ya")) {
                kembali = true; // Keluar dari program jika tidak ingin kembali
            } else {
                kembali = false; // Keluar dari program jika ingin kembali
            }
        } while (kembali);
    }
}
