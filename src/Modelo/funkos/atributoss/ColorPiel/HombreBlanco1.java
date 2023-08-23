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
public class HombreBlanco1 implements ColorPiel, Genero{
    public String rutaGen = "Hombre";
    
    @Override
    public void getGenero() {
        rutaGen = "Hombre";
    }

    @Override
    public String getColorPiel() {
        return "/Imagenes/"+rutaGen+"Blanco1"+".png";
    }   
}
