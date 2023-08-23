
package Modelo.funkos.atributoss.ColorPiel;

import Modelo.funkos.atributos.ColorPiel;
import Modelo.funkos.atributos.Genero;

/**
 *
 * @author Laura
 */
public class MujerMorena2 implements ColorPiel, Genero {
    public String rutaGen= "Mujer";
    
    @Override
    public void getGenero() {
        rutaGen = "Mujer";
    }

    @Override
    public String getColorPiel() {
        return "/Imagenes/"+rutaGen+"Morena2"+".png";
    } 
}
