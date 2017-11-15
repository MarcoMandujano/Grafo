package grafo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Clases
 */
public class ListaDeAdyacencias {
    /**
     * Atributo que contiene las listas de cada fila del archivo.
     */
    private ArrayList arregloDeListasAdya;
    /**
     * Atributo que contiene el nombre del archivo donde esta el grafo.
     */
    private String nombreArchivo;
    /**
     * Atributo que contiene al archivo del grafo.
     */
    private File archivo;
    /**
     * Cosntructor que genera un Archivo.
     * @param nombreArchivo Es el nombre que se le dara al archivo cuendo se
     *                      constuye.
     */
    public ListaDeAdyacencias(String nombreArchivo) {
        this.arregloDeListasAdya = new ArrayList();
        this.nombreArchivo = nombreArchivo;
        this.archivo = new File(this.nombreArchivo + ".txt");
    }
    /**
     * Este metodo lee el archivo que tiene el grafo(linea por linea) y genera
     * Listas con que contienen al vertice padre, a los vertices hijos con sus
     * respectivos pesos y la cantidad de hijos que tiene un vertice padre.
     * Estas listas que se obtiene linea por linea del archivo, son guardadas en
     * un ArrayList que es el que regresa el metodo.
     * @return ArrayList
     */
    public ArrayList leerListasAdyacentesDeArchivo() {
        Lista list;
        int i;
        int ini = 0;
        int fin = 0;
        char[] sCaracteres;
        String informacion;
        String vertPadre;
        int numHijos;
        String vertHijo;
        int pesAris = 0;
        try {
            /*Si existe el fichero*/
            if (this.archivo.exists()) {
                /*Abre un flujo de lectura a el fichero*/
                BufferedReader Flee = new BufferedReader(new FileReader(this.archivo));
                String Slinea;
                /*Lee el fichero linea a linea hasta llegar a la ultima*/
                while ((Slinea = Flee.readLine()) != null) {
                    list = new Lista();
                    informacion = Slinea;
                    ini = informacion.indexOf("+");
                    fin = informacion.indexOf("/");
                    vertPadre = Slinea.substring(ini + 1, fin);
                    ini = informacion.indexOf("/");
                    fin = informacion.indexOf("?");
                    numHijos = Integer.parseInt(Slinea.substring(ini + 1, fin));
                    ini = informacion.indexOf("?");
                    fin = informacion.indexOf("-");
                    vertHijo = Slinea.substring(ini + 1, fin);
                    ini = informacion.indexOf("-");
                    fin = informacion.indexOf(",");
                    pesAris = Integer.parseInt(Slinea.substring(ini + 1, fin));
                    list.agregarAlFinal(pesAris, vertHijo, vertPadre);
                    i = fin + 1;
                    ini = fin;
                    sCaracteres = Slinea.toCharArray();
                    while (i < Slinea.length()) {
                        if (sCaracteres[i] == '-') {
                            fin = i;
                            vertHijo = Slinea.substring(ini + 1, fin);
                            ini = fin;
                        }
                        if (sCaracteres[i] == ',' || i == Slinea.length() - 1) {
                            fin = i;
                            if (i == Slinea.length() - 1) {
                                pesAris = Integer.parseInt(Slinea.substring(
                                                             ini + 1, fin + 1));
                            } else {
                                pesAris = Integer.parseInt(Slinea.substring(ini
                                                                     + 1, fin));
                            }
                            list.agregarAlFinal(pesAris, vertHijo, vertPadre);
                            ini = fin;
                        }
                        i++;
                    }
                    this.arregloDeListasAdya.add(list);
                }
                /*Cierra el flujo*/
                Flee.close();
            } else {
                System.out.println("Fichero No Existe");
            }
        } catch (Exception ex) {
            /*Captura un posible error y le imprime en pantalla*/
            System.out.println("Error en escritura!!! " + ex.getMessage());
        }
        return this.arregloDeListasAdya;
    }
}
