
package test;

import beans.ingresos;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    
     public static void main(String[] args){
        listaringresos();
    }
     
     public static void actualizarIngresos(int id, String genero) {
        
        DBConnection con = new DBConnection();
       String sql = "UPDATE ingresos SET genero = '"+genero+"' WHERE id = "+id;

        
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }
    public static void listaringresos() { 
        
        DBConnection con = new DBConnection ();
        String sql = "SELECT * FROM ingresos";
        
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next ()) {
                int id = rs.getInt("id");
                String novedad = rs.getString("novedad");
                String genero = rs.getString("genero");
                String nombre = rs.getString("nombre");
                int cedulas =  rs.getInt("cedulas");
                int cantidad_de_personas = rs.getInt("cantidad de personas");
                int objetos = rs.getInt("objetos");
                
                ingresos Ingresos = new ingresos(id, novedad, genero, nombre, cedulas,cantidad_de_personas, objetos);
                System.out.println(Ingresos.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally { 
            con.desconectar();
        }
    }
    
}
