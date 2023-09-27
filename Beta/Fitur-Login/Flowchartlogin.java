import java.util.Scanner;

public class Flowchartlogin {
    public static void main(String[] args) {

        // Deklarasi variabel dan input nilai
        int correctUsername = 12345, correctPass = 12345, username, pass;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Username\t: ");
        username = sc.nextInt();
        System.out.print("Masukkan password\t: ");
        pass = sc.nextInt();

        // Proses pemilihan
        if (username == correctUsername && pass == correctPass) {
            System.out.print("Anda berhasil login");
        } else {
            System.out.print("Anda gagal login");
        }

    }
}