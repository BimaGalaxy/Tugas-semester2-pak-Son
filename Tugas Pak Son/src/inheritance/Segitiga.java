
package inheritance;
import java.util.Scanner;
public class Segitiga extends BangunDatar{
        
    float alas;
    float tinggi;
    
    @Override
    float Luas() {
        float luas = alas*tinggi/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
    
    void inputSegitiga() {
        Scanner input = new Scanner(System.in);
        System.out.println("===Segitiga===");
        System.out.print("Masukkan nilai alas segitiga  : ");
        alas = input.nextFloat();
        System.out.print("Masukkan nilai tinggi segitiga: ");
        tinggi = input.nextFloat();
        System.out.println("===== Hasil =====");
        Luas();
    }
    
}
