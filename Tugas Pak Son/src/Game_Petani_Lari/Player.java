package Game_Petani_Lari;


public class Player {
        
    //definisi atribut
    //String siswaNyawa;
    String name;
    int speed;
    int healthPoint;
        
    
    
    //Definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
        System.out.print("Sisa nyawa: "+ healthPoint);
    }
    
    //Definisi method isDead untuk mengecek nilai kesehatan (healthPoint)
    boolean isDead(){
        if (healthPoint <= 0) return true;
        return false;
    } 
    
    boolean penuh(){
        if (healthPoint == 100) return true;
        return false;
    }
    
    boolean sekarat (){
        if (healthPoint < 30 && healthPoint >= 1) return true;
        return false;
    }
    
}
