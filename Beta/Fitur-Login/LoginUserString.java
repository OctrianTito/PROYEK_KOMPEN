import java.util.Scanner;

public class LoginUserString {
    public static void main(String[] args) {
        // Deklarasi variabel dan input nilai
        String usernameInput, passInput,
        usernameAdmin = "Admin", usernameDosen = "Dosen", usernameMhs = "Mahasiswa",
        passAdmin = "Admin245", passDosen = "Dosen876", passMhs = "Mahasiswa213";
        char relog;
        int jmlPercobaan = 0;
        Scanner sc = new Scanner(System.in);
        
        // Proses perulangan
        do {
            jmlPercobaan++;
            System.out.print("Masukkan Username : ");
            usernameInput = sc.nextLine();
            System.out.print("Masukkan Password : ");
            passInput = sc.nextLine();
            
            // proses pemilihan user login
            if (usernameInput.equals(usernameAdmin) && passInput.equals(passAdmin)) {
                System.out.println("Anda masuk sebagai admin");
                break;
            } else if (usernameInput.equals(usernameDosen) && passInput.equals(passDosen)) {
                System.out.println("Anda masuk sebagai Dosen");
                break;
            } else if (usernameInput.equals(usernameMhs) && passInput.equals(passMhs)) {
                System.out.println("Anda masuk sebagai mahasiswa");
                break;
            } else {
                System.out.println("Username atau password tidak terdaftar");
            }
            //batas maksimum percobaan login
            if (jmlPercobaan >= 3) {
                System.out.print("Anda telah mencapai batasan login, silahkan coba lagi nanti\n");
                break;
            }
            System.out.print("Apakah anda mau coba login lagi? (y/n) : ");
            relog = sc.nextLine().charAt(0);
            
        } while (relog == 'y' || relog == 'Y');
        
        
        sc.close();
    }
}
