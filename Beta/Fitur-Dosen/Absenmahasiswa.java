import java.util.Scanner;
public class Absenmahasiswa {
    static Scanner sc = new Scanner (System.in);
    //Fungsi pemilihanTingkat 
    static void Kelas (String[][]kelas){
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
                DataKelas1(kelas, kelas);
                break;
            case '2':
               
                break;
            case '3':
                
                break;
            case '4':
                
                break;
            default:
                break;
            }
    }
    static void DataKelas1(String [][] mahasiswa1,String [][] kelas){
        System.out.println("===================");
        System.out.println("Kelas : ");
        for (int i = 0; i <kelas[0].length; i++){
        System.out.print(kelas[0][i]+"\t");
        } 
        System.out.println();   
        System.out.print("Pilih kelas :");
        String kls = sc.next();

        boolean found = false;
        for (int i=0; i<kelas[0].length;i++){
            if (kls.equals(kelas[0][i])) {
                System.out.println("Kelas ditemukan: " + kelas[0][i]);
                found = true;
                
                break;
            }
        
        if (!found) {
            System.out.println("Data belum ada");
        }
        }
    }
      
    
    
    public static void main(String[] args) {
        String [][] kelas = {
            {"1-A", "1-B", "1-C", "1-D","1-E", "1-F", "1-G", "1-H", "1-I"},
            {"2-A", "2-B", "2-C", "2-D","2-E", "2-F", "2-G","2-H", "2-I"},
            {"3-A", "3-B", "3-C", "3-D", "3-E", "3-F", "3-G","3-H", "3-I"},
            {"4-A", "4-B", "4-C", "4-D","4-E", "4-F", "4-G","4-H", "4-I"}
            };
        String [][] mahasiswa1 = new String [9][30];
        //Contoh data pada kelas  tingkat 1 Kelas 1-H 
        mahasiswa1 [8] = new String []{"Aisyah","Hamzah","Hanan","Alvan","Anya","Aryo","Cakra","Diana","Evan","Fali",
                                        "Febri","Getsa","dll"};
        String [][] mahasiswa2 = new String[9][30];
        String [][] mahasiswa3 = new String[9][30];
        String [][] mahasiswa4 = new String[9][30];


        Kelas(kelas);

        

    }

}
