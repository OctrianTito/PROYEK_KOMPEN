import java.util.Scanner;

public class LoginUserString {
    public static void main(String[] args) {
        // Deklarasi variabel dan input nilai
        String[][] users = new String[100][2];
        String[][] userAdmin = new String[3][2];
        userAdmin[0][0] = "Admin1";
        userAdmin[0][1] = "Admin45";
        userAdmin[1][0] = "Admin2";
        userAdmin[1][1] = "Admin245";
        userAdmin[2][0] = "Admin3";
        userAdmin[2][1] = "Admin345";
        String relog = "ya";

        Scanner sc = new Scanner(System.in);

        // Proses perulangan
        int jmlPercobaan = 0;
        do {
            jmlPercobaan++;
            String usernameInput, passInput;
            System.out.print("Masukkan Username : ");
            usernameInput = sc.nextLine();
            System.out.print("Masukkan Password : ");
            passInput = sc.nextLine();

            boolean found = false;
            int numUsers = 0;

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
                if (jmlPercobaan>3)
                    System.out.println("percobaan telah melampaui batas");
                    System.out.println("silahkan coba lagi nanti");
                if (!found) {
                        System.out.println("Username atau password tidak terdaftar");
                        System.out.println("Apakah ingin mencoba kembali : ");
                        relog = sc.nextLine();
                     if (jmlPercobaan>3){
                    System.out.println("percobaan telah melampaui batas");
                    System.out.println("silahkan coba lagi nanti");
                    break;

                     }
                }
            sc.close();
        } while (relog.equalsIgnoreCase("ya"));
        
        
        
    }
}
