/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import javax.swing.JOptionPane;


/**
 *
 * @author xifoi
 */
public class traerdatos {
    
    
    //VARIABLE EN LA QUE SE VA A GUARDAR LA ID DE EL USUARIO QUE INGRESO
    private static int id_usu;

    //CON ESTA PUEDO TRAER LA ID DE LE USUARIO
    public static int getId_usu() {
        return id_usu;
    }

   //CON ESTE METODO LE OTORGO UN VALOR
    public static void setId_usu(int aId_usu) {
        id_usu = aId_usu;
    }
    
    //ESTE MISMO PROSESO SE APLICA A EL RESTO DE METODOS GET Y SET DE ESTA CLASE
   
    
    private static String nombre_usu;

    /**
     * @return the nombre_usu
     */
    public static String getNombre_usu() {
        return nombre_usu;
    }

    /**
     * @param aNombre_usu the nombre_usu to set
     */
    public static void setNombre_usu(String aNombre_usu) {
        nombre_usu = aNombre_usu;
    }
    
    
    
    
    
    private static int ciudad_usu;

    /**
     * @return the ciudad_usu
     */
    public static int getCiudad_usu() {
        return ciudad_usu;
    }

    /**
     * @param aCiudad_usu the ciudad_usu to set
     */
    public static void setCiudad_usu(int aCiudad_usu) {
        ciudad_usu = aCiudad_usu;
    }
    
    
    
    
    
    private static String nom_club;

    /**
     * @return the nom_club
     */
    public static String getNom_club() {
        return nom_club;
    }

    /**
     * @param aNom_club the nom_club to set
     */
    public static void setNom_club(String aNom_club) {
        nom_club = aNom_club;
    }
    
    
    
    
    
    private static String nom_club2;

    /**
     * @return the nom_club2
     */
    public static String getNom_club2() {
        return nom_club2;
    }

    /**
     * @param aNom_club2 the nom_club to set
     */
    public static void setNom_club2(String aNom_club2) {
        nom_club2 = aNom_club2;
    }
    
    
    
    
    
    private static int id_club;

    /**
     * @return the id_club
     */
    public static int getId_club() {
        return id_club;
    }

    /**
     * @param aId_club the id_club to set
     */
    public static void setId_club(int aId_club) {
        id_club = aId_club;
    }
    
    
    
    
    private static String nom_admin;

    /**
     * @return the nom_admin
     */
    public static String getNom_admin() {
        return nom_admin;
    }

    /**
     * @param aNom_admin the nom_admin to set
     */
    public static void setNom_admin(String aNom_admin) {
        nom_admin = aNom_admin;
    }
    private static String descri;

    /**
     * @return the descri
     */
    public static String getDescri() {
        return descri;
    }

    /**
     * @param aDescri the descri to set
     */
    public static void setDescri(String aDescri) {
        descri = aDescri;
    }
    
    private static String cantidad;

    /**
     * @return the cantidad
     */
    public static String getCantidad() {
        return cantidad;
    }

    /**
     * @param aCantidad the cantidad to set
     */
    public static void setCantidad(String aCantidad) {
        cantidad = aCantidad;
    }

    
    
    
    private static int id_admin;
    /**
     * @return the id_admin
     */
    public static int getId_admin() {
        return id_admin;
    }

    /**
     * @param aId_admin the id_admin to set
     */
    public static void setId_admin(int aId_admin) {
        id_admin = aId_admin;
    }

    public void setId_club(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

