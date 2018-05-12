package EstructurasD;

import EstructurasD.Queue;
import EstructurasD.Client;

/**
 *
 * @author vivi
 */
public class QueuePrioridad {
    //atributos
    Queue arrayPrioridad [] = new Queue[4];   
    public Queue colaD = new Queue();
    public Queue colaM = new Queue();
    public Queue colaE = new Queue();
    public Queue colaR = new Queue();
    public String clase;
    public int size;
    
    /***
     * Constructor #1: inicializa las colas correspondientes a cada prioridad.
     * @param clase string con el tipo de estructura de datos
     */
    public QueuePrioridad(String clase){
        arrayPrioridad[0] = colaD; //ARREGLO DE DISCAPACITADOS
        arrayPrioridad[1] = colaM; //ARREGLO DE ADULTOS MAYORES
        arrayPrioridad[2] = colaE; //ARREGLO DE EMBARAZADAS
        arrayPrioridad[3] = colaR; //ARREGLO DE REGULARES
        this.clase = clase;
    }
    
    /***
     * Metodo que inserta un cliente en la cola especifica segun su prioridad.
     * @param cliente nuevo cliente a insertar
     */
    public String enqueue(Client cliente) {
        if(null == (String)cliente.getPriority()){
            System.out.println("El cliente requiere una prioridad");
        }
        else switch ((String)cliente.getPriority()) {
            case "D":
                arrayPrioridad[0].enqueue(cliente); //AGREGA DISCAPACITADOS
                return "AGREGADO";
            case "M":
                 arrayPrioridad[1].enqueue(cliente); //AGREGA ADULTOS MAYORES
                return "AGREGADO";
            case "E":
                 arrayPrioridad[2].enqueue(cliente); //AGREGA EMBRAZADAS
                return "AGREGADO";
            case "R":
                 arrayPrioridad[3].enqueue(cliente); //AGREGA REGULARES
                return "AGREGADO";
            default:
                System.out.println("Este tipo ("+ cliente.getPriority() +") no existe, por favor revisar");
                return "LISTO";
        }
        return "LISTOO";
    }
    /***
     * Metodo que atiende a un cliente de la cola sacandolo de la misma.
     * @return el cliente que se esta atendiendo
     */
    public Client atender() {
        if (arrayPrioridad[0].isEmpty() == false){ //ATIENDE A DISCAPACITADOS
            return arrayPrioridad[0].dequeue();
        }
        else if(arrayPrioridad[1].isEmpty() == false){ //ATIENDE A ADULTOS MAYORE
            return arrayPrioridad[1].dequeue();
        }
        else if (arrayPrioridad[2].isEmpty() == false){ //ATIENDE A EMBARAZADAS
            return arrayPrioridad[2].dequeue();
        }
        else if (arrayPrioridad[3].isEmpty() == false){ //ATIENDE A REGULARES
            return arrayPrioridad[3].dequeue();
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
     * Metodo que calcula el tamaño de todas las colas correspondientes a la cola de prioridad
     * @return tamaño total de la cola
     */
    public String getSize() {
        return "TAMAÑO: D "+arrayPrioridad[0].getSize()+", M "+arrayPrioridad[1].getSize()+
       ", E "+arrayPrioridad[2].getSize()+", R "+arrayPrioridad[3].getSize();
    }
    /***
     * Metodo que encuentra el siguiente cliente a atender en la cola.
     * @return tiquete del siguiente cliente a atender
     */
    public String siguienteAtender() {
        if (arrayPrioridad[0].isEmpty() == false){ //SIGUIENTE POR ATENDER: DISCAPACITADO
            return arrayPrioridad[0].First().getTicket();
        }
        else if(arrayPrioridad[1].isEmpty() == false){ //SIGUIENTE POR ATENDER: ADULTO MAYOR
            return arrayPrioridad[1].First().getTicket();
        }
        else if (arrayPrioridad[2].isEmpty() == false){ //SIGUIENTE POR ATENDER: EMBARAZADAS
            return arrayPrioridad[2].First().getTicket();
        }
        else if (arrayPrioridad[3].isEmpty() == false){ //SIGUIENTE POR ATENDER: REGULAR
            return arrayPrioridad[3].First().getTicket();
        }
        else{
            return "-NO SE ENCUENTRA UN SIGUIENTE POR ATENDER-"; 
        } 
    }
}