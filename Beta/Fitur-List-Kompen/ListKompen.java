import java.util.Scanner;

public class ListKompen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] list = new String[6][3];
        String hari[] = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu" };

        for (int i = 0; i < hari.length; i++) {
            System.out.println("Tambah pekerjaan di hari " + hari[i]);
            for (int j = 0, k = 0; j < list[0].length; j++, k++) {
                System.out.print("Pekerjaan "+(k+1)+" : ");
                list[i][j] = sc.nextLine();
            }
            System.out.println();
            
        }

        System.out.println("--------------------");       
        System.out.println("Daftar perkerjaan :");
        System.out.println("--------------------");

        for (int i = 0; i < list.length; i++) {
            System.out.println("List pekerjaan hari " + hari[i]);
            for (int j = 0, k = 0; j < list[0].length; j++, k++) {
                System.out.println("Pekerjaan ke-"+(k+1)+" : "+list[i][j]);
            }
            System.out.println();

            sc.close();
        }
    }
}
