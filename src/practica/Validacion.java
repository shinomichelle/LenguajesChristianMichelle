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
public class Validacion {
    
    public void validarEdad(int edad)throws EdadNegativaException{
        if(edad<18)throw new EdadNegativaException();
    }
    
}
