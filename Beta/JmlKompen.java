// Jumlah Kompen

import java.util.Scanner;
public class JmlKompen {
    public static void main(String[] args) {
        int alpha, semester, totAlpha, totAlphaKompen = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Alpha \t\t\t: ");
        alpha = sc.nextInt();
        System.out.print("Masukkan Jumlah Semester Yang Dilewati \t: ");
        semester = sc.nextInt();

        totAlpha = alpha * 2;

        if (semester > 0) {
            if (semester == 1) {
                totAlphaKompen = totAlpha * 2;
                System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
            } else if (semester == 2) {
                totAlphaKompen = totAlpha * 4;
                System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
            } else if (semester == 3 ) {
                totAlphaKompen = totAlpha * 8;
                System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
            } else if (semester > 3) {
                System.out.println("Mohon maaf semester yang anda masukkan salah");
            } else {
                System.out.println("invalid");
            }
            
            
        } else {
            System.out.println("Total Alpha Anda Adalah \t\t: " + totAlpha);
        }
    }
}