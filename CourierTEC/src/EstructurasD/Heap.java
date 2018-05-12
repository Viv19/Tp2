package EstructurasD;

import EstructurasD.Client;

/**
 *
 * @author vivi
 */
public class Heap {
    private Client[] heap;
    private int size;
    private int contador;
    
    /**
     * Constructor de la clase Heap, que inicializa un array de y la variable size.
     */
    
    public Heap(){
        this.heap = new Client[0];
        this.size = 0;
        this.contador = 0;
    }
    
    /**
     * Metodo para insercion de elementos en el heap.
     * @param cliente Es el objeto tipo cliente que recibe como parametro.
     */
    
    public void insert(Client cliente){
        Client[] temp = new Client[this.size + 1];
        cliente.setNumber(contador);
        this.contador++;
        this.size++;
        for(int i = 0; i < this.size - 1; i++){
            temp[i] = this.heap[i];
        }
        temp[this.size - 1] = cliente;
        this.heap = temp;
        this.siftUp();
    }
    
    /***
     * Metodo que inserta un cliente al heap de seguridad.
     * @param cliente nuevo cliente en el heap
     */
    public void insertS(Client cliente){
        Client[] temp = new Client[this.size + 1];
        this.size++;
        for(int i = 0; i < this.size - 1; i++){
            temp[i] = this.heap[i];
        }
        temp[this.size - 1] = cliente;
        this.heap = temp;
        this.siftUp();
    }
      
    /**
     * Metodo para ordenar el heap de mayor a menor.
     */
    
    public void siftUp(){
        int tmp = this.size - 1;
        int child = tmp;
        while (child > 1){
            int parent = child / 2;
            if(this.heap[child].getPrioridad() < this.heap[parent].getPrioridad())
                break;
            this.swap(child,parent);
            child = parent;
        }
    }
    
    /**
     * Metodo para elmiminar la raiz del heap.
     * @return el objeto de tipo cliente que se esta eliminando.
     */
    
    public Client remove(){
        Client temp = this.getFirst();
        this.swap(0,this.size - 1);
        this.siftDown();
        this.size--;
        return temp;
    }
    
    /**
     * Metodo para acomodar al heap luego de eliminar un elemento.
     */
    
    public void siftDown(){
        Client[] temp = new Client[this.size - 1];
        System.arraycopy(this.heap, 0, temp, 0, this.size - 1);
        this.heap = temp;
    }
    
    /**
     * Metodo para intercambiar posiciones del heap por medio del array.
     * @param i Posicion inicial.
     * @param j Posicion final.
     */
    
    public void swap(int i, int j) {
        Client tmp = this.heap[i];
        this.heap[i] = this.heap[j];
        this.heap[j] = tmp;
    }
    
    /**
     * Metodo para devolver el primer elemento del heap. (la raiz)
     * @return Devuelve el primer objeto tipo cliente del heap.
     */
    
    public Client getFirst(){
        if(this.size != 0)
            return this.heap[0];
        System.out.println("La fila está vacía");
        return null;
    }
    
    /**
     * Metodo para devolver el ultimo elemento del heap.
     * @return Devuelve el ultimo objeto tipo cliente del heap.
     */
    
    public Client getLast(){
        if(this.size != 0)
            return this.heap[this.size-1];
        System.out.println("La lista está vacía");
        return null;
    }
    
    /**
     * Metodo para determinar si el heap esta vacio.
     * @return true si esta vacio, false si no.
     */
    
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    /**
     * Metodo para devolver los elementos del heap.
     */
    
    public void Mostrar(){
        if(this.size == 0){
            System.out.println("No hay clientes");
        }
        for(Client clientes : this.heap){
            System.out.println(clientes);
        }
    }
    
    /***
     * Metodo que devuelve el tamaño del heap.
     * @return tamaño del heap
     */
    public int getSize(){
        return this.size;
    }   
}