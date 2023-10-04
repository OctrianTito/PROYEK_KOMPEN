import java.util.Scanner;

public class Loginusestring {
    public static void main(String[] args) {
        //Deklarasi variabel dan input nilai
        String username, pass;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Username : ");
        username = sc.nextLine();
        System.out.print("Masukkan Password : ");
        pass = sc.nextLine();

        //proses pemilihan user login
        if (username.equals("Admin") && pass.equals("Admin245")){
            System.out.println("Anda masuk sebagai admin");
        }else if (username.equals("Dosen") && pass.equals("Dosen876")){
            System.out.println("Anda masuk sebagai Dosen");
        }else if (username.equals("Mahasiswa") &&  pass.equals("Mahasiswa213")){
            System.out.println("Anda masuk sebagai mahasiswa");
        }else{
            System.out.println("Username tidak terdaftar");
        }

    sc.close();
    }
}
