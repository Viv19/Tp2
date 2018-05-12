/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasD;

import EstructurasD.Client;

/**
 *
 * @author vivi
 */
public class Queue {
    //atributos
    private Client front;
    private Client rear;
    private int size;
    private int contador;
    
    /***
     * Constructor #1: inicializa todos los atributos de la cola.
     */
    public Queue(){
        this.front = new Client();
        this.rear = this.front;
        this.size = 0;
        this.contador = 0;
    }
    
    /***
     * Metodo que inserta un nuevo cliente en la cola.
     * @param cliente nuevo cliente a insertar
     */
    public void enqueue(Client cliente){
        this.rear.setNext(cliente);
        this.rear = rear.getNext();
        cliente.setNumber(contador);
        this.contador++;
        this.size++;
    }
    
    /***
     * Metodo que ingresa un cliente en la cola de seguridad.
     * @param cliente nuevo cliente a insertar a la cola de seguridad
     */
    public void enqueueS(Client cliente){
        this.rear.setNext(cliente);
        this.rear = rear.getNext();
        this.size++;
    }
    
    /***
     * Metodo que saca a un cliente de la cola.
     * @return cliente que se elimino de la cola
     */
    public Client dequeue(){
        Client temp = this.front.getNext();
        this.front.setNext(this.front.getNext().getNext());
        if(this.rear == temp){
            this.rear = this.front;
        }
        this.size--;
        return temp;
    }
    
    /***
     * Metodo que devuelve el primer cliente de la cola.
     * @return primer cliente de la cola
     */
    public Client First(){
        return this.front.getNext();
    }
    
    /***
     * Metodo que calcula el tamaño de la cola.
     * @return tamaño total de la cola
     */
    public int getSize(){
        return this.size;
    } 
    
    /***
     * Metodo que verifica si la cola esta vacia o no.
     * @return true si esta vacia y false de lo contrario
     */
    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        else{
            return false;
        }
    }
} 