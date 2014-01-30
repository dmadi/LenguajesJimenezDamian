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
public class Imagen {
   private int alto;
   private int ancho;
   
   public void setAlto(int alto){
       if (alto<0) alto=-alto;
       this.alto=alto;
   }
   public int getAlto(){
       return alto;
   }
   
   public void setAncho (int ancho){
       if (ancho<0) ancho=-ancho;
       this.ancho=ancho;
   }
   public int getAncho(){
       return ancho;
   }
}
