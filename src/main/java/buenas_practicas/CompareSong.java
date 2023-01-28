package buenas_practicas;

import java.util.Comparator;

/**
 * Clase que implementa de la interfaz Comparator, su funcionalidad es ordenar
 * la música
 */
public class CompareSong implements Comparator<Song>{

    /**
     * Método que compara la duración de dos canciones y las ordena de mayor a menor
     * @param s1 the first object to be compared.
     * @param s2 the second object to be compared.
     * @return int
     */
    @Override
    public int compare(Song s1, Song s2) {

        if(s1.getDuracion() > s2.getDuracion()) {
            return -1;
        } else if (s1.getDuracion() > s2.getDuracion()) {
            return 0;
        }else {
            return 1;
        }

    }
}
