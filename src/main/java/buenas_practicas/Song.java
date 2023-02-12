package buenas_practicas;


/**
 * Clase modelo del objeto canción
 *
 * @version [1.0.01 2023-02-11]
 * @autor[Faber Fernández - faverfff@gmail.com]
 * @since [1.0.01]
 */
public class Song {

    /**
     * instancia de los atributos de la clase
     */
    private String name;
    private int id;
    private String fecha;
    private double duracion;
    private String genero;
    private String caratula;
    private String descripcion;

    public Song(String name) {
        this.name = name;
    }

    /**
     * Constructor vacío
     */
    public Song() {

    }

    /**
     * constructor con parametros
     * @param name nombre canción
     * @param id id canción
     * @param fecha Fecha de lanzamiento
     * @param duracion Duración de la canción
     * @param genero Tipo de género
     * @param caratula Descripción de la portada
     * @param descripcion Descripción de la canción
     */
    public Song(
            String name, int id, String fecha, double duracion, String genero, String caratula, String descripcion) {
        this.name = name;
        this.id = id;
        this.fecha = fecha;
        this.duracion = duracion;
        this.genero = genero;
        this.caratula = caratula;
        this.descripcion = descripcion;
    }

    /**
     * Métodos gett and sett
     * @return atributos
     */

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCaratula() {
        return this.caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método toString
     * @return strings
     */
    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", fecha=" + fecha +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", caratula='" + caratula + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
