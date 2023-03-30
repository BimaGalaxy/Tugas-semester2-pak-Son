package inheritance;
import java.util.Scanner;
public class Lingkaran extends BangunDatar {

    float r;

    @Override
    float Luas() {
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran     = "+luas);
        return luas;
    }

    @Override
    float Keliling() {
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling lingkaran = "+keliling);
        return keliling;
    }
       
    void inputLingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.println("===Lingkaran===");
        System.out.print("Masukkan nilai jari jari: ");        
        r = input.nextFloat();
        System.out.println("===== Hasil =====");
        Luas();
        Keliling();
    }

    
}
