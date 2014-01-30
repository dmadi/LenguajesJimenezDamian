/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lenguajesdam;

/**
 *
 * @author Damian
 */
public class TestImagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imagen i=new Imagen();
        i.setAlto(-20);
        Imagen a=new Imagen();
        a.setAncho(-80);
        System.out.println(i.getAlto());
        System.out.println(a.getAncho());
    }
    
}
