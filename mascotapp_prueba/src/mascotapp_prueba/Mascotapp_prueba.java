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
        
        m1.setNombre("Don Corcho");
        m1.setApodo("Corchito");
        
        Mascota m2 = new Mascota("Fredy", "Negro", "Perro");
        
        System.out.println(m1.getNombre() + " o tambien llamado " + m1.getApodo());
        System.out.println(m2.getApodo() + " Es el apodo de " + m2.getNombre() + " y es un " + m2.getTipo());
    }
    
}
