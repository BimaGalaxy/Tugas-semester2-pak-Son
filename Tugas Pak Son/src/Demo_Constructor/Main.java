
package Demo_Constructor;

public class Main {
    
    public static void main(String[] args) {
        DemoConstructor petani = new DemoConstructor("petanikode", "kopi");
        
        petani.setUsername("Bima Galaxy");
        petani.setPassword("Doraemon");
        
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
    }
    
}
