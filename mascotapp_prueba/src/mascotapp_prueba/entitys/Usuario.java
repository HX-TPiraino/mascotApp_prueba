/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp_prueba.entitys;

import java.time.LocalDate;

/**
 *
 * @author tpira
 */
public class Usuario {
    
    public String nombre;
    public String apellido;
    public int dni;
    public LocalDate nacimiento;
    public String pais;
    
    public Usuario() {
        
    }

    public Usuario(String nombre, String apellido, int dni, LocalDate nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
    
}
