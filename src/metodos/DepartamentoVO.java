/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author David
 */
public class DepartamentoVO{
    
 private int id_region;
 private String departamento;
 
 public DepartamentoVO(){}
 
 public DepartamentoVO(int id, String name){
     this.id_region = id;
     this.departamento = name;
 }

    /**
     * @return the idDepartamento
     */
    public int getId_region() {
        return id_region;
    }

    /**
     * @param id_region the idDepartamento to set
     */
    public void setId_region(int id_region) {
        this.id_region = id_region;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String toString(){
        return this.departamento;
    }
    
}
