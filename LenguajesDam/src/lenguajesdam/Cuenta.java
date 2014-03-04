/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguajesdam;

/**
 *
 * @author T107
 */
public class Cuenta {

    private  String nombre;
    private float saldo;    

    public Cuenta(String nombre, float saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

  
    
    public String toString(){
        return "Usuario "+nombre+" creado con saldo "+ saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
