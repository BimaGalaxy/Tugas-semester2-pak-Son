
package pkginterface;

public class SMSNotification implements Interfacenotifikasi{
    
    public void sendMessage (String receiver, String content) {
        System.out.println("Mengirim SMS ke " + receiver + " dengan isi: ");
        System.out.println(content);
    }

}