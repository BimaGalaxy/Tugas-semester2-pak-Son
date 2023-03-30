package Game_Petani_Lari;


public class Game {
    public static void main(String[] args) {
        
        //Membuat objek player
        Player petani = new Player();
        
        //Mengisi atribut player 
        petani.name = "Petani kode";
        petani.speed = 76;
        petani.healthPoint = 0;
        
        
        //Menjalankan method
        petani.run();
        
        if(petani.isDead()){
            System.out.println(", Mati!");
        }
        
        if(petani.penuh()){
            System.out.println(", Nyawa masih penuh!");
        }
        
        if(petani.sekarat()){
            System.out.print(" Kamu sekarat cepat isi nyawa!");
        }
             
    }
}
