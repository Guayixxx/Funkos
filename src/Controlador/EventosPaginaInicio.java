/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.funkos.FabricaFunkos;
import Modelo.funkos.FactorySelector;
import Modelo.funkos.humanos.Humanos;
import Modelo.funkos.superheroes.Superheroe;
import javax.swing.Icon;
import java.util.Timer;
import java.util.TimerTask;
import Vista.JFPaginaSiguiente;
import Vista.VentanaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Laura
 */
public class EventosPaginaInicio implements ActionListener {

    //Lleva el control de en que imagen esta
    static int contador = 0;
    private final VentanaInicial ventanaInicial;
    private FabricaFunkos fabricaFunkos = null;

    public EventosPaginaInicio(VentanaInicial ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
        this.ventanaInicial.setVisible(true);

        int velocidad = 1; //Cada cuanto va a cambiar

        //el timer funciona con milisegundos
        Timer timer;
        TimerTask tarea;

        int velmil = velocidad * 1000;

        tarea = new TimerTask() {
            @Override
            public void run() {
                Icon icono;

                switch (contador) {
                    case 0:
                        contador = 1;
                        icono = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/funko1.png"));
                        ventanaInicial.Jlabel2Cambio.setIcon(icono);
                        break;
                    case 1:
                        contador = 2;
                        icono = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/funko2.png"));
                        ventanaInicial.Jlabel2Cambio.setIcon(icono);
                        break;
                    case 2:
                        contador = 3;
                        icono = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/funko3.png"));
                        ventanaInicial.Jlabel2Cambio.setIcon(icono);
                        break;
                    case 3:
                        contador = 4;
                        icono = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/funko4.png"));
                        ventanaInicial.Jlabel2Cambio.setIcon(icono);
                        break;
                    case 4:
                        contador = 0;
                        icono = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/funko5.png"));
                        ventanaInicial.Jlabel2Cambio.setIcon(icono);
                        break;
                }
            }

        };

        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);

        this.ventanaInicial.BotonStartSuperHeroe.addActionListener(this);
        this.ventanaInicial.BotonStartHumano.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.ventanaInicial.BotonStartSuperHeroe)) {
            this.ventanaInicial.setVisible(false);
            fabricaFunkos = new Superheroe();
            EventosCuerpo evCuerpos = new EventosCuerpo(new JFPaginaSiguiente(), new Superheroe(), "SH");

            FactorySelector.getInstance().setHuman(0);
        }
        if (e.getSource().equals(this.ventanaInicial.BotonStartHumano)) {
            this.ventanaInicial.setVisible(false);
            EventosCuerpo evCuerpos = new EventosCuerpo(new JFPaginaSiguiente(), new Humanos(), "H");

            FactorySelector.getInstance().setHuman(1);
        }

    }

}
