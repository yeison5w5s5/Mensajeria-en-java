/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author David
 */
public class DepartamentoDAO {
    //este metodo se utiliza para listar los dapartamentos
    public void listar_departamento(JComboBox box){
        //se establece el modelo de el combobox
        DefaultComboBoxModel value;
        //se llama el metodo para conectar
        Conectar conec = new Conectar();
        Statement st = null;
        Connection con = null;
        ResultSet rs = null;
        try{
            con = conec.getConexion();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM tb_region");
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while(rs.next()){
                value.addElement(new DepartamentoVO(rs.getInt(1),rs.getString(2)));
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                st.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){
            }
        }
        
    }
    
}
