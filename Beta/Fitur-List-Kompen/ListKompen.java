import java.util.Scanner;

public class ListKompen {

    public static void main(String[] args) {
        String jeniskompen [] = new String [12]; 
        String konfirmasi;
        int i;

        Scanner sc = new Scanner(System.in);
        //input jenis pekerjaan kompen 
        for ( i = 0; i < jeniskompen.length; i++) {
        System.out.print("Masukkan jenis pekerjaan kompen yang ingin anda berikan : ");
        jeniskompen[i] = sc.nextLine();
        //proses pemilihan ingin menambahkan kompen
        System.out.print("Apakah anda ingin menambahkan pekerjaan kompen lagi ? (y/n) : ");
        konfirmasi = sc.nextLine();
            if (konfirmasi.equals("y")) {
                System.out.print("Masukkan jenis pekerjaan kompen yang ingin anda berikan : ");
                jeniskompen[i] = sc.nextLine();
            }else{ 
                break;}
        } 
     sc.close(); 
    }
}