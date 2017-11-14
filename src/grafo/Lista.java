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
public class Lista {
    
    private Nodo head;
    private Nodo tail;
    private int contador;
    
    public void Lista() {
        this.head = null;
        this.tail = null;
        this.contador = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public boolean isEmpty() {
        boolean valor = false;
        if (this.contador == 0) {
            valor = true;
        }
        return valor;
    }
    
    public boolean agregarAlPrincipio(int weight, String name) {
        boolean agregado = false;
        Nodo dato = new Nodo();
        dato.setPeso(weight);
        dato.setNombreVertice(name);
        if (isEmpty()) {
            System.out.printf("Lista vacia:\n");
            this.head = dato;
            this.tail = this.head;
            this.contador++;
            agregado = true;
        } else {
            dato.setSiguiente(this.head);
            this.head.setAnterior(dato);
            this.head = dato;
            this.contador++;
            agregado = true;
        }
        return agregado;
    }
    
    public boolean agregarAlFinal(int weight, String name) {
        boolean agregado = false;
        Nodo dato = new Nodo();
        dato.setPeso(weight);
        dato.setNombreVertice(name);
        if (contador == 0) {
            this.head = dato;
            this.tail = dato;
            this.contador++;
            agregado = true;
        } else {
            this.tail.setSiguiente(dato);
            dato.setAnterior(this.tail);
            this.tail = dato;
            this.contador++;
            agregado = true;
        }
        return agregado;
    }
    
    public boolean agregarPorIndice(int weight, String name){
        boolean agregado = false;
        Nodo dato = new Nodo();
        dato.setPeso(weight);
        dato.setNombreVertice(name);
        
        return agregado;
    }
}
