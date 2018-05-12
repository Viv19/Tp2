package Codigo;
import com.teknikindustries.bulksms.SMS;
public class sms{
    
    /***
     * Metodo que envia un mensaje de texto con el tiquete correspondiente
     * @param mensaje tiquete correspondiente
     * @param numero numero de telefono para enviar el mensaje
     */
    public void sendSMS(String mensaje, String numero){
        
    SMS smsTut = new SMS();
    
    smsTut.SendSMS("aeropuertoTECprogra", "progra12345", mensaje, numero, "https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");
        
    }
    
}