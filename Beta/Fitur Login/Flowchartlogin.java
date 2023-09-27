import java.util.Scanner;

public class Flowchartlogin {
    public static void main(String[] args) {
        int correctusername = 12345, correctpass = 12345, username, pass;

   
        Scanner sc = new Scanner(System.in);
    System.out.print(" Masukkan Username anda : ");
        username = sc.nextInt();
    System.out.print(" Masukkan pass : ");
        pass = sc.nextInt();

    if (username == correctusername && pass == correctpass){
        System.out.print("Anda berhasil login");
     } else { 
        System.out.print("Anda gagal login");
     }
  
    }
}