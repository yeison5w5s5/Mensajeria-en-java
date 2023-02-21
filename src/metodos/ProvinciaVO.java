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
public class ProvinciaVO{
    
    private int id_ciudades;
    private String provincia;
    private int id_region;
    
    public ProvinciaVO(){}
    
    public ProvinciaVO(int id, String name){
        this.id_ciudades = id;
        this.provincia = name;
    }

    /**
     * @return the idProvincia
     */
    public int getId_ciudades() {
        return id_ciudades;
    }

    /**
     * @param id_ciudades the idProvincia to set
     */
    public void setId_ciudades(int id_ciudades) {
        this.id_ciudades = id_ciudades;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
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
    
    public String toString(){
        return this.provincia;
    }
    
}
