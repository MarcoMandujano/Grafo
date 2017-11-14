/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author Marco
 */
public class Nodo {
    //Variables en la cual se van a guardar los valores.
    private int peso;
    private String nombreVertice;
    // Variable para enlazar los nodos.
    private Nodo siguiente;
    private Nodo anterior;
    
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo(){
        this.peso = 0;
        this.nombreVertice = "";
        this.siguiente = null;
        this.anterior = null;
    }
    
    // Métodos get y set para los atributos.
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombreVertice() {
        return nombreVertice;
    }

    public void setNombreVertice(String nombreVertice) {
        this.nombreVertice = nombreVertice;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
