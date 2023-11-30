import java.util.Scanner;

public class Absenmahasiswa {
    static Scanner sc = new Scanner (System.in);
    //Fungsi pemilihanTingkat 
    static void Kelas (String[][]kelas,String[][]tngkt1,int[][]alphatngkt1,int [][]sakittngkt1,int[][]izintngkt1){
         System.out.println("===================");
        System.out.println("\tKelas : ");
        System.out.println("Kelas Tingkat 1");
        System.out.println("Kelas Tingkat 2");
        System.out.println("Kelas Tingkat 3");
        System.out.println("Kelas Tingkat 4");
        System.out.print("Pilih kelas : ");
        char plhks = sc.next().charAt(0);
        System.out.println("===================");

        switch (plhks) {
            case '1':
                DataKelas1(tngkt1, kelas,alphatngkt1,sakittngkt1,izintngkt1);
                break;
            case '2':
               
                break;
            case '3':
                
                break;
            case '4':
                
                break;
            
            }
    }
    //Fungsi Data pada kelas tingkat 1
    static void DataKelas1(String[][]tngkt1,String [][] kelas,int [][] alphatngkt1,int [][] sakittngkt1,int[][]izintngkt1){
        System.out.println("===================");
        System.out.println("Kelas : ");
        for (int i = 0; i <kelas[0].length; i++){
        System.out.print(kelas[0][i]+"\t");
        } 
        System.out.println();   
        System.out.print("Pilih kelas :");
        String kls = sc.next();
        //Pemilihan Kelas
        switch (kls) {
            case "1-A":
                System.out.println("Berikut data Kelas : 1-A");
            for (int i = 1; i <tngkt1[0].length;i++ ){
                System.out.print(tngkt1[0][i]+" ");
            }
            System.out.println();
            System.out.print("Pilih Mahasiswa :");
            String nm1 = sc.next();
            for(int b =1; b<tngkt1[0].length; b++){
                if (nm1.equals(tngkt1[0][b])) {
                    System.out.println("Masukkan kehadiran "+tngkt1[0][b]);
                    System.out.println("1.Alpha");
                    System.out.println("2.Sakit");
                    System.out.println("3.Izin");
                    System.out.print("Pilih (1/2/3) : ");
                    byte khdrn = sc.nextByte();
                    switch (khdrn){ 
                        case 1: 
                            System.out.print("Berikan jumlah Alpha "+tngkt1[0][b]+" :");
                            alphatngkt1[b][0] = sc.nextInt();
                            break;
                        case 2:
                            System.out.print(tngkt1[0][b]+" Sakit");
                            sakittngkt1[b][1]++;
                            break;
                        case 3:
                            System.out.println(tngkt1[6][b]+" Izin");
                            izintngkt1[b][2]++;
                            break;
                    }
                }
                
            }
            break;
            case "1-B":
                System.out.println("Berikut data Kelas : 1-B");
                for (int i = 1; i <tngkt1[1].length;i++ ){
                    System.out.print(tngkt1[1][i]+" ");
                }
                System.out.println();
                System.out.print("Pilih Mahasiswa :");
                String nm2 = sc.next();
                for(int b =1; b<tngkt1[1].length; b++){
                    if (nm2.equals(tngkt1[1][b])) {
                        System.out.println("Masukkan kehadiran "+tngkt1[1][b]);
                        System.out.println("1.Alpha");
                        System.out.println("2.Sakit");
                        System.out.println("3.Izin");
                        System.out.println("Pilih (1/2/3) : ");
                        byte khdrn = sc.nextByte();
                        switch (khdrn){ 
                            case 1: 
                                System.out.println("Berikan jumlah Alpha "+tngkt1[1][b]+" :");
                                alphatngkt1[b][0] = sc.nextInt();
                                break;
                            case 2:
                                System.out.println(tngkt1[6][b]+" Sakit");
                                sakittngkt1[b][1]++;
                                break;
                            case 3:
                                System.out.println(tngkt1[6][b]+" Izin");
                                izintngkt1[b][2]++;
                                break;
                        }
                    }
                }
                break;
            case "1-H":
                System.out.println("Berikut data Kelas : 1-H");
                for (int i = 1; i <tngkt1[6].length;i++ ){
                    System.out.print(tngkt1[6][i]+" ");
                }
                System.out.println();
                System.out.print("Pilih Mahasiswa :");
                String nm6 = sc.next();
                for(int b =1; b<tngkt1[6].length; b++){
                    if (nm6.equals(tngkt1[6][b])) {
                        System.out.println("Masukkan kehadiran "+tngkt1[6][b]);
                        System.out.println("1.Alpha");
                        System.out.println("2.Sakit");
                        System.out.println("3.Izin");
                        System.out.println("Pilih (1/2/3) : ");
                        byte khdrn = sc.nextByte();
                        switch (khdrn){ 
                            case 1: 
                                System.out.println("Berikan jumlah Alpha "+tngkt1[6][b]+" :");
                                alphatngkt1[b][0] = sc.nextInt();
                                break;
                            case 2:
                                System.out.println(tngkt1[6][b]+" Sakit");
                                sakittngkt1[b][1]++;
                                break;
                            case 3:
                                System.out.println(tngkt1[6][b]+" Izin");
                                izintngkt1[b][2]++;
                                break;
                        }
                    }
                }
                break;
            default:
                break;
        }
    }
    
    public static void main(String[] args) {
        //Array Daftar Kelas Tiap tingkat
        String [][] kelas = {
            {"1-A", "1-B", "1-C", "1-D","1-E", "1-F", "1-G", "1-H", "1-I"},
            {"2-A", "2-B", "2-C", "2-D","2-E", "2-F", "2-G","2-H", "2-I"},
            {"3-A", "3-B", "3-C", "3-D", "3-E", "3-F", "3-G","3-H", "3-I"},
            {"4-A", "4-B", "4-C", "4-D","4-E", "4-F", "4-G","4-H", "4-I"}
            };
        //Array Daftar Nama Mahasiswsa Kelas tingkat 1
        String[][] tngkt1 = {
            {"1A", "Budi", "Buda", "Bibi", "Biba"},
            {"1B", "Budi", "Buda", "Bubi", "Biba"},
            {"1C", "Budi", "Buda", "Bibu", "Biba"},
            {"1D", "Budi", "Buda", "Bobi", "Biba"},
            {"1F", "Budi", "Buda", "Bubo", "Biba"},
            {"1G", "Budi", "Buda", "Bobo", "Biba"},
            {"1H", "Budi", "Buda", "Baba", "Biba"},
            {"1I", "Budi", "Buda", "Babo", "Biba"},
        };
        //Array Absensi mahasiswa tngkt 1
        int [][] alphatngkt1 = new int[8][2];
        int [][] sakittngkt1 = new int[8][2];
        int [][] izintngkt1 = new int[8][2];
    
        Kelas(kelas, tngkt1,alphatngkt1,sakittngkt1,izintngkt1);

        

    }

}
