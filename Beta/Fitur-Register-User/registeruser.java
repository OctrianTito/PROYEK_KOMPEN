import java.util.Scanner;

public class registeruser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] users = new String[100][2];
        String tmbh = "Y", knfrms = "Y";
        // Menu Rgister User
        System.out.println("Menu");
        System.out.println("1.menambahkan username");
        System.out.println("2.melihat data user ");
        System.out.print("Masukkan pilihan anda (1/2) : ");
        int menu = sc.nextInt();

        // pemilihan menu
        switch (menu) {
            // menu 1 memasukkan username and password
            case 1:
                System.out.println("Laman Register user");
                for (int i = 0; i < users.length; i++) {
                    System.out.print("Masukkan Username : ");
                    users[i][0] = sc.next();
                    System.out.print("Masukkan Password : ");
                    users[i][1] = sc.next();

                    System.out.print("Apakah anda akan menambahkan lagi (Y/N): ");
                    tmbh = sc.next();
                    if (tmbh.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        break;
                    }
                }
                // menu 2 melihat data yang telah dimasukkan
            case 2:
                System.out.println("Ingin melihat data yang dimasukkan ?");
                if (knfrms.equalsIgnoreCase("y")) {
                    System.out.println("Data yang dimasukkan:");
                    for (int i = 0; i < users.length; i++) {
                        System.out.println("Username: " + users[i][0] + ", Password: " + users[i][1]);
                    }
                }
                break;
        }

        sc.close();
    }
}
