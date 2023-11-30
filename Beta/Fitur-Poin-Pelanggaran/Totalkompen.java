import java.util.Scanner;

public class Totalkompen {
    static Scanner sc = new Scanner(System.in);

    static int Perhitungan(int alpha, int semester) {
        if (semester == 0) {
            return alpha;
        } else {
            return alpha * Perhitungan(alpha, semester - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah alpha  : ");
        int alpha = sc.nextInt();
        int totalAlpha = alpha * 2;

        System.out.print("Masukkan jumlah semester yang dilewati  : ");
        int semester = sc.nextInt();

        int result = Perhitungan(totalAlpha, semester);
        System.out.println("Hasil perhitungan: " + result);
    }
}
