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
    
    public boolean agregarPorIndice(int indice, int weight, String name) {
        boolean agregado = false;
        Nodo dato = new Nodo();
        Nodo temp = this.head;
        Nodo tempAux = new Nodo();
        int contadorAux = 0;
        dato.setPeso(weight);
        dato.setNombreVertice(name);
        if (isEmpty()) {
            System.out.printf("\nLista vacia se agregara dato al principio.\n");
            agregarAlPrincipio(weight, name);
            agregado = true;
        } else {
            while(contadorAux <= this.contador) {
                if (contadorAux == indice) {
                    temp.setSiguiente(dato);
                    dato.setAnterior(temp);
                    tempAux = temp.getSiguiente();
                    dato.setSiguiente(tempAux);
                    tempAux.setAnterior(dato);
                }
                temp = temp.getSiguiente();
                contadorAux++;
            }
            this.contador++;
            agregado = true;
        }
        return agregado;
    }
    
    public boolean eliminarAlPrincipio() {
        boolean eliminado = false;
        Nodo tempAux = this.head;
        Nodo temp = this.head.getSiguiente();
        if (isEmpty()) {
            System.out.printf("Lista vacia, no es posible eliminar datos");
        } else {
            temp.setAnterior(null);
            tempAux.setSiguiente(null);
            this.head = temp;
            this.contador--;
            eliminado = true;
        }
        return eliminado;
    }
    
    public boolean eliminarAlFinal() {
        boolean eliminado = false;
        Nodo tempAux = this.tail;
        Nodo temp = this.tail.getAnterior();
        if (isEmpty()) {
            System.out.printf("Lista vacia, no es posible eliminar datos");
        } else {
            temp.setSiguiente(null);
            tempAux.setAnterior(null);
            this.tail = temp;
            this.contador--;
            eliminado = true;
        }
        return eliminado;
    }
    
    public boolean eliminarPorIndice(int indice) {
        boolean eliminado = false;
        Nodo temp = this.head;
        Nodo tempAux = new Nodo();
        Nodo tempAux2 = new Nodo();
        int contadorAux = 0;
        if (isEmpty()) {
            System.out.printf("Lista vacia, no es posible eliminar datos");
        } else {
            while(contadorAux <= this.contador) {
                if (contadorAux == indice - 1) {
                    tempAux = temp.getSiguiente();
                    tempAux2 = tempAux.getSiguiente();
                    temp.setSiguiente(tempAux2);
                    tempAux2.setAnterior(temp);
                    tempAux.setAnterior(null);
                    tempAux.setSiguiente(null);
                }
                temp = temp.getSiguiente();
                contadorAux++;
            }
            this.contador--;
            eliminado = true;
        }
        return eliminado;
    }
    
    public void imprimirLista() {
        Nodo temp = this.head;
        int i = 1;
        String vertice;
        String peso;
        while(i <= this.contador) {
            vertice = temp.getNombreVertice();
            peso = String.valueOf(temp.getPeso());
            System.out.printf("\nVertice: " + vertice + "peso: " + peso);
            temp = temp.getSiguiente();
            i++;
        }
    }
}