import java.util.Scanner;

public class Flowchartlogin {
    public static void main(String[] args) {
        String correctusername = "admin", correctpass = "adminpass", username, pass ;

   
        Scanner sc = new Scanner(System.in);
    System.out.print(" Masukkan Username anda : ");
        username= sc.nextLine();
    System.out.print(" Masukkan pass : ");
        pass = sc.nextLine();

    if (username.equals(correctusername) && pass.equals(correctpass)){
        System.out.print("Anda berhasil login");
     } else { 
        System.out.print("Anda gagal login");
     }
  
    }
}