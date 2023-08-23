/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.funkos;

import Modelo.funkos.humanos.HombreHumano;
import Modelo.funkos.humanos.MujerHumana;
import Modelo.funkos.superheroes.HombreSuperHeroe;
import Modelo.funkos.superheroes.MujerSuperHeroe;

/**
 *
 * @author Laura
 */
public class FactorySelector {

    private static FactorySelector instance = null;

    private FactorySelector() {

    }

    public static FactorySelector getInstance() {
        if (instance == null) {
            instance = new FactorySelector();
        }
        return instance;
    }

    private Funkos[][] fac = {{new HombreSuperHeroe(), new MujerSuperHeroe()}, {new HombreHumano(), new MujerHumana()}};

    private int human = 1;// 1-> Humano, 0-> SuperHeroe
    private int gender = 1;//1 = Hombre, 0 = Mujer

    public int isHuman() {
        return human;
    }

    public void setHuman(int human) {
        this.human = human;
    }

    public int isGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Funkos getFunkos(int a, int b) {
        return fac[a][b];
    }

    public Funkos getFunkos() {
        return fac[human][gender];
    }
}
