/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class Manejo {
    public static void main(String[] arg){
        
        Cliente c1 = new Cliente();
        c1.clave = 1234;
        c1.nombre = "Magdalena Sanchez";
        c1.numero = 1012;
        c1.saldo = 0;
        
        Cliente c2 = new Cliente();
        c2.nombre = "Joselito Perez";
        c2.clave = 9876;
        c2.numero = 1013;
        c2.saldo = 500000;
        
        c1.consignar(100000);
        c2.cambiar_clave(3541);
        c2.ver_saldo();
        
        
        
        
        
        
        
        
        
        
        
        
    
    }
}
