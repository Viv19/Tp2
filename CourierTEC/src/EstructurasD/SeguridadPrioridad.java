package EstructurasD;

import EstructurasD.Client;
import EstructurasD.Queue;
import java.util.Random;

/**
 *
 * @author vivi
 */
public class SeguridadPrioridad {
    //atributos
    public Queue arrayTipos [] = new Queue[2];
    public Random random = new Random();  
    public Queue colaP = new Queue(); //COLA PERECEDEROS
    public Queue colaNP = new Queue(); //COLA NO PERECEDEROS
    public int tiempoInicio;
    public int tiempoFinal;
    public String clase;
    public int size;
    
    /***
     * Constructor #1: inicializa todos los valores de los atributos.
     * @param tiempoInicio tiempo minimo de espera
     * @param tiempoFinal tiempo maximo de espera
     * @param clase String con la estructura de datos correspondiente
     */
    public SeguridadPrioridad(int tiempoInicio, int tiempoFinal, String clase){
        arrayTipos[0] = colaP; //ARREGLO PARA PERECEDEROS
        arrayTipos[1] = colaNP; //ARREGLO PARA NO PERECEDEROS
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
        this.clase = clase;
    }
    
    /***
     * Metodo que inserta un cliente a la cola de seguridad.
     * @param cliente nuevo cliente a insertar
     */
    public void enqueue(Client cliente) {
        if("P".equals((String)cliente.getType())) { //AGREGA A PERECEDEROS
            colaP.enqueueS(cliente);
                
        }else if("NP".equals((String)cliente.getType())) { //AGREGA A NO PERECEDEROS
            colaNP.enqueueS(cliente);
        }
    }

    public Client atender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /***
     * Metodo que atiende a un cliente en la cola de seguridad.
     * @return tiempo que dura el cliente en ser atendido
     */
    public int Atender(){
        int numero = random.nextInt((tiempoFinal-tiempoInicio+1)+tiempoInicio);
        if (arrayTipos[0].isEmpty() == false){ //ATIENDE A PERECEDEROS
            System.out.println(arrayTipos[0].dequeue());
            return numero;
        }
        
        else if (arrayTipos[1].isEmpty() == false){ //ATIENDE A NO PERECEDEROS
            System.out.println(arrayTipos[1].dequeue());
            return numero;
        }
        return -1;
    }
    
    /***
     * Metodo que devuelve la estructura de datos correspondiente de la cola.
     * @return String con la estructura de datos
     */
    public String getClase() {
        return this.clase;
    }
    
    /***
     * Metodo que calcula el tamaño total de la cola de seguridad.
     * @return el tamaño total de la cola
     */
    public String getSize() {
        return "TAMAÑO: PERECEDEROS "+arrayTipos[0].getSize()+", NO PERECEDEROS "+arrayTipos[1].getSize();
    }
    
    /***
     * Metodo que busca el siguiente cliente a atender en la cola de seguridad
     * @return String con el tiquete del cliente a atender.
     */
    public String siguienteAtender() {
        if (arrayTipos[0].isEmpty() == false){ //SIGUIENTE POR ATENDER: PERECEDEROS
            return arrayTipos[0].First().getTicket();
        }
        else if(arrayTipos[1].isEmpty() == false){ //SIGUIENTE POR ATENDER: NO PERECEDEROS
            return arrayTipos[1].First().getTicket();
        }
        else{
            return "-NO EXISTE UN SIGUIENTE-"; 
        } 
    }
}