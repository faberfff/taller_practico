package buenas_practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Song song = new Song();
        ListMusik listM = new ListMusik();
        ArrayList<Song> musi = new ArrayList();
        ArrayList<Song> sonGener = new ArrayList<>();
        ArrayList<Song> playList = new ArrayList<>();
        ArrayList<Song> sonYear = new ArrayList<>();
        MusicLibrary musik = new MusicLibrary();
        musi = listM.listaMusica();
        musik.imprimir(musi);

        int opcion;

        /**
         * Do while, switch Muestra un menu de opciones para ejecutar en la
         * biblioteca musical
         */
        do {
            System.out.println(" ");
            System.out.println("   Biblioteca Musical : ");
            System.out.println(" ");
            System.out.println("1. Lista de canciones");
            System.out.println("2. Escuchar por género ");
            System.out.println("3. Escuchar por year " );
            System.out.println("4. Crear PlayList " );
            System.out.println("5. Ordenar por duración " );
            System.out.println("6. Ordenar por fecha " );


            System.out.println("7. Salir");
            opcion = Integer.parseInt(bfr.readLine());

            /**
             * Depende de la opción que el usuario digite cada case del switch mostrara
             * una funcionalidad diferente
             */

            switch (opcion) {
                /**
                 * El caso uno muestra toda la biblioteca musical
                 */
                case 1: {
                    musi = listM.listaMusica();
                    musik.imprimir(musi);

                }
                break;

                /**
                 * El caso dos pide al usuario que digite el género que desea escuchar
                 * muestra las canciones existentes para ese género
                 */
                case 2: {
                    sonGener = musik.mostrarPorGenero(musi);
                    musik.imprimir(sonGener);
                }
                break;

                /**
                 * El caso tres pide al usuario que digite el ano de la canción que desea escuchar
                 * el sistema muestra una lista de canciones del ano ingresado
                 */
                case 3: {
                    sonYear = musik.launchYear(musi);
                    musik.imprimir(sonYear);
                }
                break;

                /**
                 * En el caso cuatro el usuario crea una lista de canciones de su gusto
                 * el sistema las almacena en un nuevo Array list
                 */
                case 4: {
                    System.out.println("     Nuestra biblioteca musical :   ");
                    System.out.println("");
                    for (int i = 0; i < 5; i++) {
                        song = musik.createPlayList(musi);
                        playList.add(song);
                    }
                    musik.imprimir(playList);
                }
                break;

                /**
                 * El caso cinco ordena la biblioteca principal por duración de las canciones
                 */
                case 5: {
                    Collections.sort(musi, new CompareSong());
                    musik.imprimir(musi);
                }
                break;

                /**
                 * El caso seis ordena la lista de canciones por fechas
                 */
                case 6: {
                    Collections.sort(musi, (Song s1, Song s2 ) -> s1.getFecha().compareTo(s2.getFecha()));
                    musik.imprimir(musi);
                }
                break;
            }
            /**
             * Si el usuario ingresa la opcion 7 el sistema finalizara
             */

        } while (opcion != 7);

    }

}
