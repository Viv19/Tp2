package EstructurasD;
import EstructurasD.Client;
/**
 *
 * @author vivi
 */
public class ColasPadre {

public interface colasPadre {
    //metodos
    public void enqueue(Client cliente);
    public Client atender();
    public int Atender();
    public String getClase();
    public int getSize();
    public String siguienteAtender();
}  
}
