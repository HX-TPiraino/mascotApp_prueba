/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp_prueba;

import mascotapp_prueba.entitys.Mascota;

/**
 *
 * @author tpira
 */
public class Mascotapp_prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mascota m1 = new Mascota();
        
        m1.apodo = "Corcho";
        m1.nombre = "Don Corcho";
        m1.tipo = "Perro";
        m1.edad = 15;
        m1.raza = "Callejero";
        m1.cola = true;
        m1.color = "Negro";
        
        Mascota m2 = new Mascota("Fredy", "Negro", "Perro");
        
        System.out.println(m1.apodo + " o tambien llamado " + m1.nombre);
        System.out.println(m2.apodo + " Es el apodo de " + m2.nombre + " y es un " + m2.tipo);
    }
    
}
