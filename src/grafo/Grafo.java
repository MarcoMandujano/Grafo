package grafo;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class Grafo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Lista list = new Lista();
        int num = 2;
        list.agregarAlFinal(num, "B", "A");
        list.agregarAlFinal(num + 1, "C", "A");
        list.imprimirLista();
        */
        int i;
        ListaDeAdyacencias arch = new ListaDeAdyacencias("grafo");
        ArrayList arrDListAdya;
        arrDListAdya = arch.leerListasAdyacentesDeArchivo();
        Lista list;
        for (i = 0; i < arrDListAdya.size(); i++) {
            list = (Lista) arrDListAdya.get(i);
            list.imprimirLista();
        }
    }
}
