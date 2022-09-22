
package beans;


public class ingresos {
    
     private int id;
     private String novedad;
     private String genero;
     private String nombre;
     private int cedulas;
     private int cantidad_de_personas;
     private int objetos;   

    public ingresos(int id, String novedad, String genero, String nombre, int cedulas, int cantidad, int objetos) {
        this.id = id;
        this.novedad = novedad;
        this.genero = genero;
        this.nombre = nombre;
        this.cedulas = cedulas;
        this.cantidad_de_personas = cantidad;
        this.objetos = objetos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedulas() {
        return cedulas;
    }

    public void setCedulas(int cedulas) {
        this.cedulas = cedulas;
    }

    public int getCantidad() {
        return cantidad_de_personas;
    }

    public void setCantidad(int cantidad) {
        this.cantidad_de_personas = cantidad;
    }

    public int getObjetos() {
        return objetos;
    }

    public void setObjetos(int objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return "ingresos{" + "id=" + id + ", novedad=" + novedad + ", genero=" + genero + ", nombre=" + nombre + ", cedulas=" + cedulas + ", cantidad de personas=" + cantidad_de_personas + ", objetos=" + objetos + '}';
    }
     
     
}
