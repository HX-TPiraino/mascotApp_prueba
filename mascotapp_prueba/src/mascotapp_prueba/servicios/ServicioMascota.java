/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp_prueba.servicios;

import java.util.Scanner;
import mascotapp_prueba.entitys.Mascota;

/**
 *
 * @author tpira
 */
public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota(){
        System.out.println("Nombre");
        String nombre = leer.next();
        
        System.out.println("Apodo");
        String apodo = leer.next();
        
        System.out.println("Tipo");
        String tipo = leer.next();            
    
        return new Mascota(nombre, apodo,tipo);
    }
}
