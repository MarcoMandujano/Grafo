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
    /**
     * Atributo que representa el peso que tiene la arista entre
     * el vertice hijo y el vertice padre.
     */
    private int peso;
    /**
     * Atributo que representa el nombre del vertice hijo.
     */
    private String nombreVertice;
    /**
     * Atributo que representa el nombre del vertice padre.
     */
    private String nombreVerticePadre;
    /**
     * Atributo que representa un apuntador a un siguiente nodo.
     */
    private Nodo siguiente;
    /**
     * Atributo que representa un apuntador a un nodo anterior.
     */
    private Nodo anterior;
    /**
     * Constructor que genera un Nodo con valoes sguiente y anterior
     * igual a null, nombreVertice igual a una cadena vacia,
     * nombreVerticePadre igual a una cadena vacia y peso igual a 0.
     */
    public void Nodo() {
        this.peso = 0;
        this.nombreVertice = "";
        this.nombreVerticePadre = "";
        this.siguiente = null;
        this.anterior = null;
    }
    /**
     * Constructor que genera un Nodo.
     * @param peso Es el peso que tiene la arista entre el vertice padre y el
     *               vertice hijo.
     * @param nombreVertice Es el nombre del vertice hijo.
     * @param nombreVerticePadre Es el nombre del vertice padre.
     */
    public void Nodo(int peso, String nombreVertice, String nombreVerticePadre) {
        this.peso = peso;
        this.nombreVertice = nombreVertice;
        this.nombreVerticePadre = nombreVerticePadre;
        this.siguiente = null;
        this.anterior = null;
    }
    /**
     * Este metodo regresa el peso que tiene la arista entre el vertice padre y
     * el vertice hijo.
     * @return int
     */
    public int getPeso() {
        return peso;
    }
    /**
     * Este metodo asigna el peso que tiene la arista entre el vertice padre y
     * el vertice hijo.
     * @param peso
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    /**
     * Este metodo regresa el nombre del vertice hijo.
     * @return String
     */
    public String getNombreVertice() {
        return nombreVertice;
    }
    /**
     * Este metod asigna un nombre al vertice hijo.
     * @param nombreVertice
     */
    public void setNombreVertice(String nombreVertice) {
        this.nombreVertice = nombreVertice;
    }
    /**
     * Este metodo regresa el nombre del vertice padre.
     * @return String
     */
    public String getNombreVerticePadre() {
        return nombreVerticePadre;
    }
    /**
     * Este asigna un nombre al vertice padre.
     * @param nombreVerticePadre
     */
    public void setNombreVerticePadre(String nombreVerticePadre) {
        this.nombreVerticePadre = nombreVerticePadre;
    }
    /**
     * Este metodo regresa el Nodo siguiente a otro Nodo.
     * @return Nodo
     */
    public Nodo getSiguiente() {
        return siguiente;
    }
    /**
     * Este metodo asigna un Nodo siguiente a otro Nodo.
     * @param siguiente
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    /**
     * Este metodo regresa el Nodo anterior de otro Nodo.
     * @return Nodo
     */
    public Nodo getAnterior() {
        return anterior;
    }
    /**
     * Este metodo asinga un Nodo anterior de otro Nodo.
     * @param anterior
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}