/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.funkos;
import Modelo.funkos.atributos.*;

/**
 *
 * @author Laura
 */
public interface Funkos {
    
    public String getNombre();
    public Genero getGenero();
    public Cabello getCabello(int i);
    public int getCabelloAmount();
    public int getCabellon();
    public Camisa getCamisa(int i);
    public int getCamisaAmount();
    public int getCamisan();
    public int getPieln();
    public ColorPiel getColorPiel(int i);
    public Barba getBarba(int i);
    public int getBarban();
    public int getBarbaAmount();
    public Pantalon getPantalon(int i);
    public int getPantalonn();
    public int getPantalonAmount();
    public Accesorios getAccesorios(int i);
    public int getAccesoriosn();
    public int getAccesoriosAmount();

}
