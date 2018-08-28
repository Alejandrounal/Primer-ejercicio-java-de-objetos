/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class Cliente {
    
    public int numero;
    public int clave;
    public String nombre;
    public double saldo;
    
    public void consignar(int valor){
        saldo = saldo+valor;
    }
    
    public void retirar (int valor){
        saldo =saldo - valor;
    }
    
    public void cambiar_clave(int nueva_clave){
        clave = nueva_clave;
    }
    
    public void ver_saldo(){
        System.out.print("El saldo de   " + nombre + "es de:  " + saldo);
    }
}
