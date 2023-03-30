
package settergetter;

public class Main {

    public static void main(String[] args) {
        User Bima = new User();
        
        Bima.setUsername("Bima Galaxy Putra");
        Bima.setPassword("Doraemon123");
        
        System.out.println("Username: "+ Bima.getUsername());
        System.out.println("Password: "+ Bima.getPassword());
    }
    
}
