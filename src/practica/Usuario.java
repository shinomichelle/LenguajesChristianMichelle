/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

/**
 *
 * @author T107
 */
public class Usuario {
   private String Nombre;
   private int Edad;
   
   public String getNombre(){
       return Nombre;
   }
   public void setNombre(String Nombre){
       this.Nombre=Nombre;
   }
   
   public int getEdad(){
       return Edad;
   }
   public void setEdad(int Edad)throws EdadNegativaException{
      Validacion val = new Validacion();
      
           
       this.Edad=Edad;
           
   }
   
   
}
