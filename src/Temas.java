public class Temas {
    private int idTema;
    private String nombre;

    public Temas(int idTema, String nombre) {
        this.setIdTema(idTema);
        this.setNombre(nombre);
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
