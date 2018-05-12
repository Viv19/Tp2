package EstructurasD;

/**
 *
 * @author vivi
 */
public class Client {
    
    private String priority;
    private String type;
    private int number;
    private int prioridad;
    private Client next;
    
    /***
     * Constructor #1: Crea un nodo de tipo cliente con los atributos vacios.
     */
    public Client(){
        this.priority = null;
        this.type = null;
        this.next = null; 
        this.prioridad = 0;
        this.number = 0;
    }
    
    /**
     * Contructor #2: Crea un nodo de tipo cliente con los atributos que se 
     * especifican al solicitar un boarding pass (para la estructura Heap).
     * @param prioridad prioridad con la que va a ser atendido (tipo de cliente)
     * @param type tipo de tiquete que desea adquirir (clase del tiquete)
     */
    
    public Client(int prioridad, String type){
        this.priority = null;
        this.type = type;
        this.next = null; 
        this.prioridad = prioridad;
        this.number = 0;
    }
    
    /***
     * Constructor #3: Crea un nodo de tipo cliente con los atributos que se 
     * especifican al solicitar un boarding pass.
     * @param priority prioridad con la que va a ser atendido (tipo de cliente)
     * @param type tipo de tiquete que desea adquirir (clase del tiquete)
     */
    public Client(String priority, String type){
        this.priority = priority;
        this.type = type;
        this.next = null;
        this.prioridad = 0;
        this.number = 0;
    }
    
    /**
     * Metodo para consultar la prioridad del cliente.
     * @return Devuelve la prioridad en letras.
     */
    
    public String getPriority(){
        return this.priority;
    }
    
    /**
     * Metodo para consultar la prioridad del cliente.
     * @return Devuelve la prioridad de clase del cliente en letras.
     */
    
    public int getPrioridad(){
        return this.prioridad;
    }
    
    /**
     * Metodo para consultar el tipo de clase del cliente.
     * @return Devuelve el tipo de clase del cliente en letras.
     */

    public String getType(){
        return this.type;
    }
    
    /**
     * Metodo para consultar el numero del cliente.
     * @return Devuelve el numero de atencion del cliente.
     */

    public int getNumber(){
        return this.number;
    }
    
    /**
     * Metodo para consultar el cliente siguiente al consultado.
     * @return Devuelve el objeto tipo cliente siguiente al cliente consultado.
     */
    
    public Client getNext(){
        return this.next;
    }
    
    /**
     * Metodo para modificar la prioridad del cliente, en letras.
     * @param priority Variable tipo String que indica prioridad en letras.
     */

    public void setPriority(String priority){
        this.priority = priority;
    }
    
    /**
     * Metodo para modificar la clase del cliente.
     * @param type Variable tipo String, que indica la clase del cliente.
     */

    public void setType(String type){
        this.type = type;
    }
    
    /**
     * Metodo para modificar el numero de atencion del cliente.
     * @param number Variable tipo int, que indica el numero de atencion del 
     * cliente.
     */

    public void setNumber(int number){
        this.number = number;
    }
    
    /**
     * Metodo para modificar la prioridad del cliente, en numeros.
     * @param prioridad Variable tipo int, que indica la prioridad del cliente 
     * en numeros.
     */
    
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    
    /**
     * Metodo para modificar al siguiente cliente con respecto al consultado.
     * @param next Variable tipo Client, que indica el siguiente cliente al 
     * consultado.
     */
    
    public void setNext(Client next){
        this.next = next;
    }
    
    /**
     * Metodo para obtener el tiquete del cliente.
     * @return Devuelve una concatenacion de tipo String, que indica el tipo 
     * de boleto de cliente, su prioridad y su numero de atencion.
     */
    
    public String getTicket(){
        if(null == this.priority | null == this.type){
            System.out.println("Debe indicar tipo y prioridad");
            return "";
        }else{
        return this.type + "-" + this.priority + "-" + this.number;
        }
    }
}