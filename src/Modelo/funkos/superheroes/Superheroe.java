/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.funkos.superheroes;

import Modelo.funkos.FabricaFunkos;
import Modelo.funkos.Hombre;
import Modelo.funkos.Mujer;

/**
 *
 * @author Laura
 */
public class Superheroe implements FabricaFunkos {

    @Override
    public Hombre getHombre() {
        return new HombreSuperHeroe();
    }

    @Override
    public Mujer getMujer() {
        return new MujerSuperHeroe();
    }
    
}
