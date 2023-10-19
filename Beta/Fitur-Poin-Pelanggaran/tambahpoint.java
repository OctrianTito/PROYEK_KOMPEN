import java.util.Scanner;

public class tambahpoint{
    public static void main(String[] args) {

    // Deklarasi variabel dan input nilai
        int point;
        char doPelanggaran;

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan point anda\t\t\t: ");
    point = input.nextInt();
    System.out.print("Apakah anda melakukan pelanggaran (y/n)\t: ");
    doPelanggaran = input.next().charAt(0);
    
    // sistem pelanggaran
    // Proses pemilihan
    switch (doPelanggaran){
        case 'y':
            System.out.print("Point anda bertambah sebanyak\t\t: " +point * 2);
            break;
        
        case 'n':
            System.out.print("point anda tetap");
            break;

        default:
            break;
    }

    /*
    
    Dinonaktifkan untuk cadangan
    
    if ( doPelanggaran){
        System.out.print("Point anda bertambah sebanyak : " +point * 2);
    }else{
        System.out.print("point anda tetap");
    }
    */

    }
}