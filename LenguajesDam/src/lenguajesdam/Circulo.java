package lenguajesdam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 / Lunes 27 d enero 
en esta primer clase aprenderas:
1.- Encapsulamiento
Todos los atributos deben ser asignados a modificador de acceso private
2.- a cada atributo para poder ser visto desde el exterior tendra que implementarse
un metodo get 
/**
 *
 * @author T107
en  */
public class Circulo {
    //paso1
   private float radio;
   //paso 2 Cracion del metodo set(metodo mutador)
   
    public void setRadio( float radio){
        if(radio<0) radio=-radio;
        this.radio=radio;
    }
    //Creacion del metodo get(o accesorio)
    public float getRadio(){
        return radio;
    }
}
