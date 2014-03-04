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
public class CuentaAhorro extends Cuenta{

    public CuentaAhorro(String nombre, float saldo) {
        super(nombre, saldo);
    }

    
    public void crearCuenta(){
     System.out.println("Cuenta de ahorro creada con exito");
    }
    
}
