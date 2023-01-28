package buenas_practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Clase contenedora de la biblioteca principal de las canciones
 */
public class ListMusik {

    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Song> musi = new ArrayList();


    /**
     * Método que crea las canciones y las guarda en un ArrayList
     * @return
     */
    public ArrayList<Song> listaMusica() {

        Song s = new Song("Sirena varada", 1, ("1989"),
                3.56, "Rock", "Albumn dos", "La historia de una sirena");

        Song s1 = new  Song("Entre dos tirrras", 22, "1999",
                5.12, "Rock", "El vino", "");

        Song s2 = new Song("Fade to Black", 2, "1986",
                5.10, "Heavy Metal", "Ride the Lightning", "La vida parece se desbanecera");

        Song s3 = new Song("Fabricando fantasías", 3, "2006",
                4.56, "Salsa", "Salsa romantica", "Un hombre que vive en un mundo lleno de fantasías");

        Song s4 = new Song("Quiero saber de ti", 4, "1998",
                3.39, "Vallenato", "Binomio de america", "Un hombre que quiere tener razón de la mujer que ama");

        Song s5 = new Song("No te quiero perder", 5, "2006",
                4.50, "Vallenato", "Mas vallenatos", "El que desea que su amor perdure por siempre");

        Song s6 = new Song("Siempre amigos", 6, "1998",
                5.21, "Romantico", "Las Valadas", "El relato de que la amistad perdura en el tiempo");

        Song s7 = new Song("Volver volver", 7, "1999",
                3.16, "Ranchera", "Los Recuerdos", "El sentimento que un hombre mantiene por una mujer");

        Song s8 = new Song("Un viejo Amor", 8, "1999",
                3.30, "Pop", "Las nuevas lunas", "Los recuerdos del amor verdadero");

        Song s9 = new Song("Te vote", 9, "2015",
                5.45, "Reggaeton", "Casper Magico", "El desahogo de una persona enamorada");

        Song s10 = new Song("Pa' que te la goces", 10, "2006",
                4.51, "Reggaeton", "Tego calderon", "La mejor actitud para una rumba");

        Song s11 = new Song("DARK NECESSITIES", 11, "2015",
                4.02, "Rock", "The Getaway", "tiene un ritmo grandioso y un estribillo"
                + " que se te quedará pegado a la primera escucha");

        Song s12 = new Song("PUNK-PUNK ROCK", 12, "1998",
                5.32, "Rock Alternativo", "Revolution Radio",
                " Prepárate para dar saltos sin parar en los últimos");

        Song s13 = new Song("HARDWIRED", 13, "2006",
                4.50, "Heavy Metal", "Metallica", "buenos momentos de guitarra,"
                + " una batería espectacular");

        Song s14 = new Song("HEATHENS", 14, "1998",
                3.39, "Alternativo", "Kings of Leon",
                "siempre ayuda en una fiesta con gente de distintos gustos");

        Song s15 = new  Song("24K MAGIC", 15, "2015",
                4.57, "Pop", "Funky", "Sabor a verano que se queda impregnado en tu cuerpo.");

        Song s16 = new Song(" CLOSER", 16, "1999",
                5.36, "Electrónica", "THE CHAINSMOKERS FT. HALSEY",
                "Sin lugar a dudas cualquier temazo de Major Lazer en este puesto");

        Song s17 = new Song("YEMEN", 17, "1998",
                3.58, "Hip Hop", "KASE.O", "Grandes letras, sentimiento, originalidad");

        Song s18 = new Song("STARBOY", 18, "2006",
                3.16, "Pop", "THE WEEKND FT. DAFT PUNK", " como una estrella con su legendario ");

        Song s19 = new Song("Run to the hills", 19, "1998",
                5.34, "Heavy metal", "Iron Miden", "Un muy buen tema para moer la cabeza");

        Song s20 = new Song("Cowboys from hell", 20, "1998",
                4.35, "Heavy Metal", "Pantera", "Un muy buen tema para moer la cabeza");

        musi.add(s);
        musi.add(s1);
        musi.add(s2);
        musi.add(s3);
        musi.add(s4);
        musi.add(s5);
        musi.add(s6);
        musi.add(s7);
        musi.add(s8);
        musi.add(s9);
        musi.add(s10);
        musi.add(s11);
        musi.add(s12);
        musi.add(s13);
        musi.add(s14);
        musi.add(s15);
        musi.add(s16);
        musi.add(s17);
        musi.add(s18);
        musi.add(s19);
        musi.add(s20);

        return musi;

    }

    /**
     * Método para crear una canción
     * @return song
     * @throws IOException throws
     */
   /* public Song createSong() throws IOException {
        Song song = new Song();
        System.out.println("nombre canción");
        song.setName(bfr.readLine());
        System.out.println("Numero de id");
        song.setId(Integer.parseInt(bfr.readLine()));
        System.out.println("Ano de lanzamiento");
        song.setFecha(bfr.readLine());
        System.out.println("Duración de la canción");
        song.setDuracion(Double.parseDouble(bfr.readLine()));
        System.out.println("Genero");
        song.setGenero(bfr.readLine());
        System.out.println("Carátula");
        song.setCaratula(bfr.readLine());
        System.out.println("Una corta descripción");
        song.setDescripcion(bfr.readLine());
        return song;

    }*/

}
