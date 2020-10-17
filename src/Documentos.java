public class Documentos {

    private int numeroRegistro;
    private int idDocumento;
    private String titulo;
    private String url;

    public Documentos(int numeroRegistro, int idDocumento, String titulo, String url) {
        this.setNumeroRegistro(numeroRegistro);
        this.setIdDocumento(idDocumento);
        this.setTitulo(titulo);
        this.setUrl(url);
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
