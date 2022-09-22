
package controller;
import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import beans.Usuarios;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController{

    @Override    
    public String login(String username,String contrasena){
        
        Gson gson = new Gson();
        
        DBConnection con = new DBConnection();
        String sql = "Select * from usuarios where username = '" + username + "'and contrasena = '" + contrasena + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String apartamento =rs.getString("apartamento");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String email  =rs.getString("email");
                double numero_de_apartamento =rs.getDouble("numero_de_apartamento");
                boolean premium = rs.getBoolean("premium");
            
            Usuarios usuarios =   
                    new Usuarios(username,contrasena,apartamento,nombre,apellidos,email,numero_de_apartamento,premium);
            return gson.toJson(usuarios);
             
                
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
        return "false";
    }
}
