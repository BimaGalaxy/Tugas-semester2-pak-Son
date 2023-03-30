
package inheritance;
import java.util.Scanner;
public class PersegiPanjang extends BangunDatar{
    
    float panjang;
    float lebar;
    
     @Override
    float Luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang     = " + luas);
        return luas;
    }
    
    @Override
    float Keliling(){
        float kll = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang = " + kll);
        return kll;
    }
    
    void inputPersegiPanjang() {
        Scanner input = new Scanner(System.in);
        System.out.println("===Persegi Panjang===");
        System.out.print("Masukkan nilai panjang: ");        
        panjang = input.nextFloat();
        System.out.print("Masukkan nilai lebar: ");
        lebar = input.nextFloat();
        System.out.println("===== Hasil =====");
        Luas();
        Keliling();
    }
    
}
