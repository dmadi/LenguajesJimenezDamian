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
public class ProbarCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaDebito c1=new CuentaDebito();
        c1.setId(1);
        c1.setNombre("Juan");
        c1.setSaldo(6000);
        c1.crearCuenta();
      }
    
}
