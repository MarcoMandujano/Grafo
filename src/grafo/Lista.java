package grafo;

/**
 *
 * @author Marco
 */
public class Lista {
    /**
     * Atributo que representa a la cabecera de la lista.
     */
    private Nodo head;
    /**
     * Atributo que representa a la cola de la lista.
     */
    private Nodo tail;
    /**
     * Atributo que cuenta la cantidad de elementos que tiene la lista.
     */
    private int contador;
    /**
     * Constructor que genera una lista con cabecera y cola igual a null
     * y contador igual a cero.
     */
    public void Lista() {
        this.head = null;
        this.tail = null;
        this.contador = 0;
    }
    /**
     * Este metodo regresa un Nodo que representa la cabecera de la lista.
     * @return Nodo
     */
    public Nodo getHead() {
        return head;
    }
    /**
     * Este metodo asigna un Nodo a la cabecera de la lista.
     * @param head
     */
    public void setHead(Nodo head) {
        this.head = head;
    }
    /**
     * Este metodo regresa al Nodo que representa la cola de la lista.
     * @return Nodo
     */
    public Nodo getTail() {
        return tail;
    }
    /**
     * Este metodo asigna un Nodo a la cola de la lista.
     * @param tail
     */
    public void setTail(Nodo tail) {
        this.tail = tail;
    }
    /**
     * Este metodo regresa el valor del contador, que represnta el numero de
     * elemtnos que tiene la lista.
     * @return int
     */
    public int getContador() {
        return contador;
    }
    /**
     * Este metodo asigna un valor al contador, que represnta el numero de
     * elemtnos que tiene la lista..
     * @param contador
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    /**
     * Este metodo comprueba que la lista no este vacia.
     * EL metodo regresa true si la lista esta vacia y false si no lo esta.
     * @return boolean
     */
    public boolean isEmpty() {
        boolean valor = false;
        if (this.contador == 0) {
            valor = true;
        }
        return valor;
    }
    /**
     * Este metodo agrega un elemento al final de la lista.
     * El metodo regresa true cuando se agrego el elemento a la lista y
     * false cuando no se agrego.
     *
     * @param weight Es el peso que tiene la arista que une al vertice hijo
     *                 y al vertice padre. La variable debe ser de tipo Int.
     * @param name Es el nombre del vertice hijo. La variable debe ser de
     *               tipo String.
     * @param nameFather Es el nombre del vertice padre. La variable debe
     *                     ser de tipo String.
     * @return boolean
     */
    public boolean agregarAlPrincipio(int weight, String name, String nameFather) {
        boolean agregado = false;
        Nodo dato = new Nodo();
        dato.setPeso(weight);
        dato.setNombreVertice(name);
        dato.setNombreVerticePadre(nameFather);
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
    /**
     * Este metodo agrega un elemento al final de la lista.
     * El metodo regresa true cuando se agrego el elemento a la lista y
     * false cuando no se agrego.
     *
     * @param weight Es el peso que tiene la arista que une al vertice hijo
     *                 y al vertice padre. La variable debe ser de tipo Int.
     * @param name Es el nombre del vertice hijo. La variable debe ser de
     *               tipo String.
     * @param nameFather Es el nombre del vertice padre. La variable debe
     *                     ser de tipo String.
     * @return boolean
     */
    public boolean agregarAlFinal(int weight, String name, String nameFather) {
        boolean agregado = false;
        Nodo dato = new Nodo();
        dato.setPeso(weight);
        dato.setNombreVertice(name);
        dato.setNombreVerticePadre(nameFather);
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
    /**
     * Este metodo agrega un elemento a la lista en la posicion indicada por
     * el parametro indice.
     * El metodo regresa true cuando se agrego el elemento a la lista y
     * false cuando no se agrego.
     *
     * @param weight Es el peso que tiene la arista que une al vertice hijo
     *                 y al vertice padre. La variable debe ser de tipo Int.
     * @param name Es el nombre del vertice hijo. La variable debe ser de
     *               tipo String.
     * @param nameFather Es el nombre del vertice padre. La variable debe
     *                     ser de tipo String.
     * @return boolean
     */
    public boolean agregarPorIndice(int indice, int weight, String name, String nameFather) {
        boolean agregado = false;
        Nodo dato = new Nodo();
        Nodo temp = this.head;
        Nodo tempAux = new Nodo();
        int contadorAux = 0;
        dato.setPeso(weight);
        dato.setNombreVertice(name);
        dato.setNombreVerticePadre(nameFather);
        if (isEmpty()) {
            System.out.printf("\nLista vacia se agregara dato al principio.\n");
            agregarAlPrincipio(weight, name, nameFather);
            agregado = true;
        } else {
            while (contadorAux <= this.contador) {
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
    /**
     * Este metodo elimina al primer elemento que se encuentra en la lista.
     * El metodo regresa true cuando se elimino el elemento de la lista y
     * false cuando no se elimino.
     * @return boolean
     */
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
    /**
     * Este metodo elimina al ultimo elemento que se encuentra en la lista.
     * El metodo regresa true cuando se elimino el elemento de la lista y
     * false cuando no se elimino.
     * @return boolean
     */
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
    /**
     * Este metodo elimina un elemento de la lista en la posicion indicada por
     * el parametro indice.
     * El metodo regresa true cuando se elimino el elemento de la lista y
     * false cuando no se elimino.
     * @return boolean
     */
    public boolean eliminarPorIndice(int indice) {
        boolean eliminado = false;
        Nodo temp = this.head;
        Nodo tempAux = new Nodo();
        Nodo tempAux2 = new Nodo();
        int contadorAux = 0;
        if (isEmpty()) {
            System.out.printf("Lista vacia, no es posible eliminar datos");
        } else {
            while (contadorAux <= this.contador) {
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
    /**
     * Este metodo imprime a los datos de los nodos que se encuentran en
     * la lista.
     */
    public void imprimirLista() {
        Nodo temp = this.head;
        int i = 1;
        String vertice;
        String peso;
        String verticePadre;
        while (i <= this.contador) {
            verticePadre = temp.getNombreVerticePadre();
            vertice = temp.getNombreVertice();
            peso = String.valueOf(temp.getPeso());
            System.out.printf("Vertice Padre: " + verticePadre
                              + ", Vertice hijo: " + vertice
                              + ", Peso de arista: " + peso + "\n");
            temp = temp.getSiguiente();
            i++;
        }
    }
}