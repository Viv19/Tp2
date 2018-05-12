package EstructurasD;

import java.util.Random;

/**
 *
 * @author vivi
 */
public class SeguridadPrioridadHeap extends ColasPadre{
    //atributos
    public Heap arrayTipos[] = new Heap[2];  
    public Heap heapP = new Heap(); //HEAP PERECEDEROS
    public Heap heapNP = new Heap(); //HEAP NO PERECEDEROS
    public Random random = new Random();
    public int tiempoInicio;
    public int tiempoFinal;
    public String clase;
    public int size;
    /**
     * Constructor de la clase SeguridadPrioridadHeap.
     * @param tiempoInicio tiempo minimode espera
     * @param tiempoFinal tiempo maximo de espera
     * @param clase String con el tipo de estructura de datos
     */
    
    public SeguridadPrioridadHeap(int tiempoInicio, int tiempoFinal, String clase){
        arrayTipos[0] = heapP;
        arrayTipos[1] = heapNP;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
        this.clase = clase;
    }
    
    /***
     * Metodo que inserta un cliente en el heap de seguridad.
     * @param cliente nuevo cliente para insertar
     */
    public void enqueue(Client cliente) {
        System.out.println("Adentro");
        if("P".equals(cliente.getType())) {
            heapP.insertS(cliente);   
            System.out.println("logrado");
        }else if("NP".equals(cliente.getType())) {
            heapNP.insertS(cliente);
        }
        this.size++;
    }
    
    /***
     * Metodo que atiende a un cliente en el heap de seguridad.
     * @return tiempo de espera que tuvo el cliente en seguridad
     */
    public int Atender() {
        int numero = random.nextInt((tiempoFinal-tiempoInicio+1)+tiempoInicio);
        if (arrayTipos[0].isEmpty() == false){ //ATIENDE A PERECEDERO
            System.out.println(arrayTipos[0].remove().getTicket());
            return numero;
        }
        else if (arrayTipos[1].isEmpty() == false){ //ATIENDE NO PERECEDERO
            System.out.println(arrayTipos[1].remove().getTicket());
            return numero;
        }
        return -1;
    }
    
    /***
     * Metodo que devuelve la estructura de datos que se esta utilizando.
     * @return String con la estructura de datos
     */    public String getClase() {
        return this.clase;
    }
    
    /***
     * Metodo que calcula el tamaño toTal del heap.
     * @return tamaño total del heap
     */
    public String getSize() {
       return "TAMAÑO DE PERECEDORES "+arrayTipos[0].getSize()+", "
               + "TAMAÑO DE NO PERECEDORES "+arrayTipos[1].getSize();
    }
    
    /***
     * Metodo que determina cual es el siguiente cliente a ser atendido.
     * @return String con el tiquete del siguiente cliente
     */
    public String siguienteAtender() {  //SIGUIENTE POR ATENDER D
        if (arrayTipos[0].isEmpty() == false){ //SIGUIENTE POR ATENDER: PERECEDEROS
            return arrayTipos[0].getFirst().getTicket();
        }
        else if(arrayTipos[1].isEmpty() == false){ //SIGUIENTE POR ATENDER: NO PERECEDEROS
            return arrayTipos[1].getFirst().getTicket();
        }
        else{
            return "-"; 
        } 
    }
}