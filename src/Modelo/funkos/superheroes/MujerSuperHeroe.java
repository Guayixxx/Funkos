/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.funkos.superheroes;

import Modelo.funkos.Mujer;
import Modelo.funkos.atributos.*;
import Modelo.funkos.atributoss.Accesorios.Accesorio1;
import Modelo.funkos.atributoss.Accesorios.Accesorio2;
import Modelo.funkos.atributoss.Accesorios.Accesorio3;
import Modelo.funkos.atributoss.Accesorios.Accesorio4;
import Modelo.funkos.atributoss.Accesorios.AccesorioNinguno;
import Modelo.funkos.atributoss.Cabello.*;
import Modelo.funkos.atributoss.Camisas.*;
import Modelo.funkos.atributoss.ColorPiel.*;
import Modelo.funkos.atributoss.Pantalones.*;

import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class MujerSuperHeroe implements Mujer{
    
    private int camisan=0;
    private int pieln=0;
    private int cabellon=0;
    private int pantalonn=0;
    private int accesorion = 0;
    private ArrayList<Cabello> cabellosList = new ArrayList<>();
    private ArrayList<Camisa> camisasList = new ArrayList<>();
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
    
    private void registrarCamisas(){
        camisasList = new ArrayList<>();
        camisasList.add(new Camisa1SH());
        camisasList.add(new Camisa2SH());
        camisasList.add(new Camisa3SH());
    }
    
    private void registrarCabellos(){
        cabellosList = new ArrayList<>();
        cabellosList.add(new Cabello1Mujer());
        cabellosList.add(new Cabello2Mujer());
        cabellosList.add(new Cabello3Mujer());
        cabellosList.add(new Cabello4Mujer());
        cabellosList.add(new Cabello5Mujer());
        cabellosList.add(new CabelloNinguno());
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
        piel.add(new MujerBlanca1());
        piel.add(new MujerBlanca2());
        piel.add(new MujerMorena1());
        piel.add(new MujerMorena2());
        
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
    public int getCabellon() {
        return cabellon;
    }

    @Override
    public Barba getBarba(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getBarban() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getBarbaAmount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
