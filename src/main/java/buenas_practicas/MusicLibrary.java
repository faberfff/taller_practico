package buenas_practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Clase que permite crear los diferentes comportamientos de las playList
 * @version [1.0.01 2023-02-11]
 * @author Faber Fernández - faverfff@gmail.com
 * @since [1.0.01]
 */
public class MusicLibrary {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private ArrayList<Song> music = new ArrayList<>();

    /**
     * Constructor vacío
     */
    public MusicLibrary(){

    }

    @Override
    public String toString() {
        return "MusicLibrary{" +
                "music=" + music +
                '}';
    }


    /**
     * Método crea una lista de con canciones predeterminadas
     * @param musica
     * @return canción
     * @throws IOException
     */

    public Song createPlayList(ArrayList<Song> musica) throws IOException {
        ArrayList<Song> myList = new ArrayList();
        int id;
        Song son = new Song();
        System.out.println("Nombre de la canción");
        id =    Integer.parseInt(bfr.readLine());
        for (Song s: musica) {
            if(s.getId() == id){
                son = s;
            }
        }
        return son;
    }

    /**
     * Método que muestra por pantalla un arrayList de canciones
     * @param objeto
     */
    public void imprimir(ArrayList<Song> objeto) {
        objeto.forEach(elemento -> {
            System.out.println(elemento.toString());
        });

    }

    /**
     * Método que lista las canciones por género
     * @param musica
     * @return
     * @throws IOException
     */
    public ArrayList<Song> mostrarPorGenero(ArrayList<Song> musica) throws IOException {
        ArrayList<Song> miLista = new ArrayList();
        System.out.println("Cual genero desea seleccionar ?");

        try {
            String genero;
            genero = bfr.readLine();
            for (Song c : musica) {
                if (c.getGenero().equalsIgnoreCase(genero)) {
                    miLista.add(c);
                }
            }
        } catch (Exception e) {
            System.out.println("Genero no disponible");
            e.printStackTrace(System.out);
        }
        return miLista;
    }

    /**
     * Método que lista las canciones por el year
     * @param musica
     * @return
     * @throws IOException
     */
    public ArrayList<Song> launchYear(ArrayList<Song> musica) throws IOException {
        ArrayList<Song> newList = new ArrayList();
        String year;
        System.out.println("Ingresa el año");
        year = bfr.readLine();
        for (Song s: musica) {
            if(s.getFecha().equalsIgnoreCase(year)){
                newList.add(s);
            }
        }
        return newList;
    }

}
