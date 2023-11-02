import java.util.Scanner;

public class ListKompenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String [][] list = new String[6][3];
        String hari [] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
    
        for (int i = 0; i < list.length; i++) {
            System.out.println("Daftar list hari "+hari[i]);
            System.out.print("Masukkan list pekerjaan ke-1 : " );
            list [i][0] = sc.nextLine();
            System.out.print("Masukkan list pekerjaan ke-2 : " );
            list [i][1] = sc.nextLine();
            System.out.print("Masukkan list pekerjaan ke-3 : " );
            list [i][2] = sc.nextLine();

            }
        
        System.out.println("Daftar perkerjaan :");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Hari " + hari[i] + ":");
            System.out.println("Jenis pekerjaan ke-1 : " + list[i][0]);
            System.out.println("Jenis pekerjaan ke-2 : " + list[i][1]);
            System.out.println("Jenis pekerjaan ke-3 : " + list[i][2]);

        } sc.close();
    }
}
