package buenas_practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Clase que permite crear los diferentes comportamientos de las playList
 */
public class MusicLibrary {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    private ArrayList<Song> music = new ArrayList<>();

    public MusicLibrary(){

    }

    public MusicLibrary(ArrayList<Song> music) {
        this.music = music;
    }

    public ArrayList<Song> getMusic() {
        return music;
    }

    public void setMusic(ArrayList<Song> music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return "MusicLibrary{" +
                "music=" + music +
                '}';
    }


    public ArrayList<Song> crearMusica(Song so) {
        for (Song s: music) {
            music.add(s);
        }
        return music;
    }

    /**
     * Método crea una lista de con canciones predeterminadas
     * @param musica
     * @return
     * @throws IOException
     */
    public Song createPlayList(ArrayList<Song> musica) throws IOException {
        ArrayList<Song> myList = new ArrayList();
        String name;
        Song son = new Song();
        System.out.println("Nombre de la canción");
        name = bfr.readLine();
        for (Song s: musica) {
            if(s.getName().equalsIgnoreCase(name)){
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
