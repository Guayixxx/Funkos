/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.funkos.atributoss.ColorPiel;

import Modelo.funkos.atributos.ColorPiel;
import Modelo.funkos.atributos.Genero;

/**
 *
 * @author Laura
 */
public class MujerMorena1 implements ColorPiel, Genero{
    public String rutaGen= "Mujer";
    
    @Override
    public void getGenero() {
        rutaGen = "Mujer";
    }

    @Override
    public String getColorPiel() {
        return "/Imagenes/"+rutaGen+"Morena1"+".png";
    } 
}
