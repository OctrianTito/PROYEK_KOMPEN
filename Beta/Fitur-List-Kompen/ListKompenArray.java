import java.util.Scanner;

public class ListKompenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

    String [][] list = new String[6][3];
    String hari [] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

    for (int i = 0; i < list.length; i++) {
        System.out.println("Daftar list hari "+hari[i]);
        for (int j = 0; j < list[i].length; j++) {
            System.out.print("Masukkan list pekerjaan ke- " + (j + 1) + ": ");
                list[i][j] = sc.next();
        }
    }
    System.out.println("Daftar perkerjaan :");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Hari " + hari[i] + ":");
            for (int j = 0; j < list[i].length; j++) {
                System.out.println("jenis pekerjaan " + (j + 1) + ": " + list[i][j]);
            }
        }
        sc.close();
    }
}
