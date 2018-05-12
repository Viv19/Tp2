package EstructurasD;

import EstructurasD.Client;
import EstructurasD.Heap;

/**
 *
 * @author vivi
 */
public class HeapPrioridad {
    public Heap[] arrayPrioridad = new Heap[4];  
    public Heap heapD = new Heap();
    public Heap heapM = new Heap();
    public Heap heapE = new Heap();
    public Heap heapR = new Heap();
    public String clase;
    public int size;
    
    /***
     * Constructor #1: inicializa los heaps correspondientes a cada prioridad.
     * @param clase string con el tipo de estructura de datos
     */
    public HeapPrioridad(String clase){  
        arrayPrioridad[0] = heapD;
        arrayPrioridad[1] = heapM;
        arrayPrioridad[2] = heapE;
        arrayPrioridad[3] = heapR;  
        this.clase = clase;
    }
    
    /***
     * Metodo que inserta un cliente en el heap especifico segun su prioridad.
     * @param cliente nuevo cliente a insertar
     */
    public void enqueue(Client cliente) {
        if(null == (cliente.getPriority())){
            System.out.println("El cliente requiere una prioridad");
        }
        else switch (cliente.getPriority()) {
            case "D":
                cliente.setPrioridad(4);
                arrayPrioridad[0].insert(cliente);
                break;
            case "M":
                cliente.setPrioridad(3);
                arrayPrioridad[1].insert(cliente);
                break;
            case "E":
                cliente.setPrioridad(2);
                arrayPrioridad[2].insert(cliente);
                break;
            case "R":
                cliente.setPrioridad(1);
                arrayPrioridad[3].insert(cliente);
                break;
            default:
                System.out.println("Este tipo ("+ cliente.getPriority() +") no existe, por favor revisar");
                break;
        }
    }
    
    /***
     * Metodo que atiende a un cliente del heap sacandolo del mismo.
     * @return el cliente que se esta atendiendo
     */
    public Client atender() {
        if (arrayPrioridad[0].isEmpty() == false){ //ATIENDE A DISCAPACITADOS
            return arrayPrioridad[0].remove();
        }
        else if(arrayPrioridad[1].isEmpty() == false){ //ATIENDE A ADULTOS MAYORES
            return arrayPrioridad[1].remove();
        }
        else if (arrayPrioridad[2].isEmpty() == false){ //ATIENDE A EMBARAZADOS
            return arrayPrioridad[2].remove();
        }
        else if (arrayPrioridad[3].isEmpty() == false){ //ATIENDE A REGULARES
            return arrayPrioridad[3].remove();
        }
        else{
            return null; 
        } 
    }

    public int Atender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /***
     * Metodo que devuelve la estructura de datos correspondiente.
     * @return String con la estructura de datos
     */
    public String getClase() {
        return this.clase;
    }
    
    /***
     * Metodo que calcula el tamaño de todos los heaps correspondientes al heap de prioridad
     * @return tamaño total del heap
     */
    public String getSize() {
        return "TAMAÑOS: D "+arrayPrioridad[0].getSize()+", E "+arrayPrioridad[1].getSize()+
        ", M "+arrayPrioridad[2].getSize()+", R "+arrayPrioridad[3].getSize();
    }
    
    /***
     * Metodo que encuentra el siguiente cliente a atender en el heap.
     * @return tiquete del siguiente cliente a atender
     */
    public String siguienteAtender() {
        if (arrayPrioridad[0].isEmpty() == false){ //SIGUIENTE POR ATENDER: DISCAPACITADOS
            return arrayPrioridad[0].getFirst().getTicket();
        }
        else if(arrayPrioridad[1].isEmpty() == false){ //SIGUIENTE POR ATENDER: ADULTOS MAYORES
            return arrayPrioridad[1].getFirst().getTicket();
        }
        else if (arrayPrioridad[2].isEmpty() == false){ //SIGUIENTE POR ATENDER: EMBARAZADAS
            return arrayPrioridad[2].getFirst().getTicket();
        }
        else if (arrayPrioridad[3].isEmpty() == false){ //SIGUIENTE POR ATENDER: REGULARES
            return arrayPrioridad[3].getFirst().getTicket();
        }
        else{
            return "-"; 
        } 
    }
}   