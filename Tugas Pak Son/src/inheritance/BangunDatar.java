
package inheritance;
import java.util.Scanner;
public class BangunDatar {
    
   public void Pilihan() {
       
       int pilihan;
       
       System.out.println("Masukkan Pilihan: ");
       System.out.println("1. Luas dan keliling Lingkaran");
       System.out.println("2. Luas dan keliling Persegi");
       System.out.println("3. Luas dan keliling PersegiPanjang");
       System.out.println("4. Luas dan keliling Segitiga");
       System.out.println("--------------------------------------");
       
       Scanner input = new Scanner(System.in);
       
       pilihan = input.nextInt();
       
       if (pilihan == 1){
           Lingkaran pLingkaran = new Lingkaran();
           pLingkaran.inputLingkaran();
       }
       if (pilihan == 2) {
           Persegi pPersegi = new Persegi();
           pPersegi.inputPersegi();
       }
       if (pilihan == 3) {
           PersegiPanjang pPersegiPanjang = new PersegiPanjang();
           pPersegiPanjang.inputPersegiPanjang();
       }
       if (pilihan == 4) {
           Segitiga pSegitiga =  new Segitiga();
           pSegitiga.inputSegitiga();
       }
       
       
   }
    
   
    float Luas() {
        return 0;
        
    }
    
    float Keliling() {
        return 0;
        
    }
    
}
