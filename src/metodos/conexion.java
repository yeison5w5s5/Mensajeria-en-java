/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
    
    Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fittnesclub","root","");
            System.out.println("CONECTADO");
        } catch(Exception e){
            System.out.println("ERROR DE CONECCION BD"+e);
        }
        return cn;
    }
    
    public void desconectar(){
        try {
            System.out.println("Cerrar secion");
            cn.close();
        } catch (Exception e) {
        }
    }
    
    
    public static void main (String[]args){
        
    }

    public com.sun.jdi.connect.spi.Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
