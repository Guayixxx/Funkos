/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.funkos.atributoss.ColorPiel;

import Modelo.funkos.atributos.*;

/**
 *
 * @author Laura
 */
public class MujerBlanca1 implements ColorPiel, Genero{
    
    public String rutaGen = "Mujer";
    
    @Override
    public void getGenero() {
        rutaGen = "Mujer";
    }

    @Override
    public String getColorPiel() {
        return "/Imagenes/"+rutaGen+"Blanco1"+".png";
    }   
}
