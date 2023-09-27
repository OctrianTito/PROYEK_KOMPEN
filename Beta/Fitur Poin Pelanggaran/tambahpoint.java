import java.util.Scanner;

public class tamahpoint{
    public static void main(String[] args) {
        int point;
        boolean doPelanggaran = true;

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan point anda : ");
    point = input.nextInt();
    System.out.print("Apakah anda melakukan pelanggaran : ");
    doPelanggaran = input.nextBoolean();
    

    if ( doPelanggaran){
        System.out.print("Point anda bertambah sebanyak : " +point * 2);
    }else{
        System.out.print("point anda tetap");
    }

    }
}