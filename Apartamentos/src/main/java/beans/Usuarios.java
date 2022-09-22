package beans;


public class Usuarios {
    
    private String username;
    private String contrasena;
    private String apartamento;
    private String nombre;
    private String apellidos;
    private String email;
    private double numero_de_apartamento;
    private boolean Premiun;

    public Usuarios(String username, String contrasena, String apartamento, String nombre, String apellidos, String email, double numero_de_apartamento, boolean Premiun) {
        this.username = username;
        this.contrasena = contrasena;
        this.apartamento = apartamento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.numero_de_apartamento = numero_de_apartamento;
        this.Premiun = Premiun;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNumero_de_apartamento() {
        return numero_de_apartamento;
    }

    public void setNumero_de_apartamento(double numero_de_apartamento) {
        this.numero_de_apartamento = numero_de_apartamento;
    }

    public boolean isPremiun() {
        return Premiun;
    }

    public void setPremiun(boolean Premiun) {
        this.Premiun = Premiun;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "username=" + username + ", contrasena=" + contrasena + ", apartamento=" + apartamento + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", numero_de_apartamento=" + numero_de_apartamento + ", Premiun=" + Premiun + '}';
    }

       
                            
}
