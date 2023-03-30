package Uji_Bus;


public class UjiBus {
    public static void main(String[] args) {
        //Pembuatan object
        Bus busMini = new Bus();
        
        busMini.penumpang = 5;
        busMini.maxPenumpang = 5;
        busMini.cetak();
        
        busMini.penumpang += 2;
        busMini.cetak();
    }
    
}
