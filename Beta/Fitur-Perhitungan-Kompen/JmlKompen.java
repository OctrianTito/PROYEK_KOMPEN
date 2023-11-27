import java.util.Scanner;

public class JmlKompen {
    public static void main(String[] args) {
        int totAlphaKompen = 0;
        perhitungan(totAlphaKompen);
        pembayaran(totAlphaKompen);
    }
        
        static void perhitungan(int totAlphaKompen) {
            Scanner sc = new Scanner(System.in);
            int alpha, semester, totAlpha1;
            System.out.printf("================================================================\n");
            System.out.print("Masukkan Jumlah Alpha \t\t\t: ");
            alpha = sc.nextInt();
            System.out.printf("================================================================\n");
            System.out.print("Masukkan Jumlah Semester Yang Dilewati \t: ");
            semester = sc.nextInt();
            System.out.printf("================================================================\n");
    
            totAlpha1 = alpha * 2;
    
            if (semester > 0) {
                if (semester == 1) {
                    totAlphaKompen = totAlpha1 * 2;
                    System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
                } else if (semester == 2) {
                    totAlphaKompen = totAlpha1 * 4;
                    System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
                } else if (semester == 3 ) {
                    totAlphaKompen = totAlpha1 * 8;
                    System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
                } else if (semester == 4) {
                    totAlphaKompen = totAlpha1 * 16;
                    System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
                } else  if (semester == 5) {
                    totAlphaKompen = totAlpha1 * 32;
                    System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
                } else if (semester == 6) {
                    totAlphaKompen = totAlpha1 * 64;
                    System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
                } else if (semester == 7) {
                    totAlphaKompen = totAlpha1 * 128;
                    System.out.println("Total Kompen Anda Adalah \t\t: " + totAlphaKompen);
                } else {
                    System.out.println("Mohon Maaf Semester Yang Anda Masukkan Salah");
                }
                
            } else if (semester == 0) {
                System.out.println("Total Alpha Anda Adalah \t\t: " + totAlpha1);
            }
        }

        static void pembayaran(int totAlphaKompen) {
            do {
                Scanner sc = new Scanner(System.in);
                int jmlYangDikerjakan;
                String konfirmasi;
                System.out.printf("----------------------------------------------------------------\n");
                System.out.print("Apakah anda ingin membayar kompen? (y/t) : ");
                konfirmasi = sc.next();
                System.out.printf("----------------------------------------------------------------\n");
    
                if (konfirmasi.equalsIgnoreCase("y")) {
                    System.out.print("Masukkan jumlah kompen yang telah anda kerjakan : ");
                    jmlYangDikerjakan = sc.nextInt();
    
                    if (jmlYangDikerjakan <= totAlphaKompen) {
                        totAlphaKompen -= jmlYangDikerjakan;
                        System.out.printf("----------------------------------------------------------------\n");
                        System.out.print("Sisa total kompen anda adalah : " + totAlphaKompen + "\n");
                    } else {
                        System.out.printf("----------------------------------------------------------------\n");
                        System.out.print("Sisa total kompen anda adalah : " + totAlphaKompen + "\n");
                    }
                } else if (konfirmasi.equalsIgnoreCase("t")) {
                    System.out.print("Sisa total kompen anda adalah : " + totAlphaKompen + "\n");
                    System.out.println();
                    System.out.printf("----------------------------------------------------------------\n");
                    System.out.println("Jangan lupa untuk membayar sisa kompen anda!");
                    break;
                }
            }
            
            while (totAlphaKompen > 0);
            if (totAlphaKompen == 0) {
                System.out.printf("----------------------------------------------------------------\n");
                System.out.println("Terimakasih Telah Membayar Kompen!");
                System.out.printf("----------------------------------------------------------------\n");
            }
        
    }
}