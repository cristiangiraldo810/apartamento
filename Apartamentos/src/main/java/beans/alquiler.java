
package beans;

import java.sql.Date;

public class alquiler {
    
    private int id;
    private String usuario;
    private Date fechaAlquiler;
    private boolean novedad;
    private String genero;

    public alquiler(int id, String usuario, Date fechaAlquiler, boolean novedad, String genero) {
        this.id = id;
        this.usuario = usuario;
        this.fechaAlquiler = fechaAlquiler;
        this.novedad = novedad;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "alquiler{" + "id=" + id + ", usuario=" + usuario + ", fechaAlquiler=" + fechaAlquiler + ", novedad=" + novedad + ", genero=" + genero + '}';
    }
        
}