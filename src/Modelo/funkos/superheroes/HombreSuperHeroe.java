/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.funkos.superheroes;


import Modelo.funkos.Hombre;
import Modelo.funkos.atributos.*;
import Modelo.funkos.atributoss.Accesorios.Accesorio1;
import Modelo.funkos.atributoss.Accesorios.Accesorio2;
import Modelo.funkos.atributoss.Accesorios.Accesorio3;
import Modelo.funkos.atributoss.Accesorios.Accesorio4;
import Modelo.funkos.atributoss.Accesorios.AccesorioNinguno;
import Modelo.funkos.atributoss.Barbas.*;
import Modelo.funkos.atributoss.Cabello.*;
import Modelo.funkos.atributoss.Camisas.*;
import Modelo.funkos.atributoss.ColorPiel.*;
import Modelo.funkos.atributoss.Pantalones.*;
import java.util.ArrayList;


/**
 *
 * @author Laura
 */
public class HombreSuperHeroe implements Hombre {
    
    private int pieln=0;
    private int camisan=0;
    private int barba=0;
    private int cabellon=0;
    private int pantalonn=0;
    private int accesorion = 0;
    private ArrayList<Cabello> cabellosList = new ArrayList<>();
    private ArrayList<Camisa> camisasList = new ArrayList<>();
    private ArrayList<Barba> barbasList = new ArrayList<>();
    private ArrayList<Pantalon> pantalonesList = new ArrayList<>();
    private ArrayList<Accesorios> AccesoriosList = new ArrayList<>();
    
    
    private void registrarAccesorios(){
        AccesoriosList = new ArrayList<>();
        AccesoriosList.add(new Accesorio1());
        AccesoriosList.add(new Accesorio2());
        AccesoriosList.add(new Accesorio3());
        AccesoriosList.add(new Accesorio4());
        AccesoriosList.add(new AccesorioNinguno());
    }
    private void registrarPantalones(){
        pantalonesList = new ArrayList<>();
        pantalonesList.add(new Pantalon1SH());
        pantalonesList.add(new Pantalon2SH());
        pantalonesList.add(new Pantalon3SH());
    }
    
    private void registrarBarbas(){
        barbasList = new ArrayList<>();
        barbasList.add(new Barba1());
        barbasList.add(new Barba2());
        barbasList.add(new Barba3());
        barbasList.add(new Barba4());
        barbasList.add(new Barba5());
        barbasList.add(new BarbaNinguno());
    }
    
    private void registrarCamisas(){
        camisasList = new ArrayList<>();
        camisasList.add(new Camisa1SH());
        camisasList.add(new Camisa2SH());
        camisasList.add(new Camisa3SH());
    }
   
    
    private void registrarCabellos(){
        cabellosList = new ArrayList<>();
        cabellosList.add(new Cabello1Hombre());
        cabellosList.add(new Cabello2Hombre());
        cabellosList.add(new Cabello3Hombre());
        cabellosList.add(new Cabello4Hombre());
        cabellosList.add(new Cabello5Hombre());
        cabellosList.add(new CabelloNinguno());
    }
    
    @Override
    public Barba getBarba(int i) {
        this.barba = i;
        registrarBarbas();
        return barbasList.get(i);
    }


    @Override
    public Cabello getCabello(int i) {
        this.cabellon = i;
        registrarCabellos();
        return cabellosList.get(i);
    }
    

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ColorPiel getColorPiel(int i) {
        this.pieln = i;
        ArrayList<ColorPiel> piel = new ArrayList<>();
        piel.add(new HombreBlanco1());
        piel.add(new HombreBlanco2());
        piel.add(new HombreMoreno1());
        piel.add(new HombreMoreno2());
        
        return piel.get(i);
    }

    @Override
    public Camisa getCamisa(int i) {
        this.camisan = i;
        registrarCamisas();
        return camisasList.get(i);
    }

    @Override
    public Genero getGenero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getCabelloAmount() {
        registrarCabellos();
        return this.cabellosList.size();
    }
    
    @Override
    public int getPieln() {
        return pieln;
    }


    @Override
    public int getCamisaAmount() {
        registrarCamisas();
        return this.camisasList.size();
    }

    @Override
    public int getCamisan() {
        return camisan;
    }
    
    @Override
    public int getBarban() {
        return barba;   
    }

    @Override
    public int getBarbaAmount() {
        registrarBarbas();
        return this.barbasList.size();
    }
    
    @Override
    public int getCabellon() {
        return cabellon;
    }
    
    @Override
    public Pantalon getPantalon(int i) {
        this.pantalonn = i;
        registrarPantalones();
        return pantalonesList.get(i);
    }

    @Override
    public int getPantalonn() {
        return pantalonn;
    }

    @Override
    public int getPantalonAmount() {
        registrarPantalones();
        return this.pantalonesList.size();
    }
    
    @Override
    public Accesorios getAccesorios(int i) {
        this.accesorion = i;
        registrarAccesorios();
        return AccesoriosList.get(i);
    }

    @Override
    public int getAccesoriosn() {
        return accesorion;
    }

    @Override
    public int getAccesoriosAmount() {
        registrarAccesorios();
        return this.AccesoriosList.size();
    }
}
