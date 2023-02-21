
package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

    static String us = "root";
    static String pass = null;
    static String bd = "fittnesclub";
    static String url = "jdbc:mysql://localhost:3306/"+bd;
    public Connection con = null;
    
    public Conectar(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, us, pass);
            
            if(con!=null){
                System.out.println("En linea");
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public Connection getConexion(){
        return con;
    }
    
    public void desconectar(){
        con = null;
    }
    
    public static void main(String[] args) {
        Conectar c = new Conectar();
        c.getConexion();
    }
    
}
