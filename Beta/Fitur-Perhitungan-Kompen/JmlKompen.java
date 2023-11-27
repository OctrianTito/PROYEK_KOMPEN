import java.util.Scanner;

public class JmlKompen {
    public static void main(String[] args) {
        int alpha, semester, totAlpha1, totAlphaKompen = 0, jmlYangDikerjakan;
        String konfirmasi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Alpha \t\t\t: ");
        alpha = sc.nextInt();
        System.out.print("Masukkan Jumlah Semester Yang Dilewati \t: ");
        semester = sc.nextInt();

        totAlpha1 = alpha * 2;

        if (semester > 0) {
            if (semester == 1) {
                totAlphaKompen = totAlpha1 * 2;
                System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
            } else if (semester == 2) {
                totAlphaKompen = totAlpha1 * 4;
                System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
            } else if (semester == 3) {
                totAlphaKompen = totAlpha1 * 8;
                System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
            } else if (semester > 3) {
                System.out.println("Mohon maaf semester yang anda masukkan salah");
            } else {
                System.out.println("invalid");
            }

        } else {
            System.out.println("Total Alpha Anda Adalah \t\t: " + totAlphaKompen);
        }

        do {
            System.out.print("Apakah anda ingin membayar kompen? (y/t) : ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Masukkan jumlah kompen yang telah anda kerjakan : ");
                jmlYangDikerjakan = sc.nextInt();

                if (jmlYangDikerjakan <= totAlphaKompen) {
                    totAlphaKompen -= jmlYangDikerjakan;
                    System.out.print("Sisa total kompen anda adalah : " + totAlphaKompen + "\n");
                } else {
                    System.out.print("Sisa total kompen anda adalah : " + totAlphaKompen + "\n");
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            }
        }

        while (totAlphaKompen > 0);
        sc.close();
    }
}