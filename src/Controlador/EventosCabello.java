/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.funkos.FactorySelector;
import Modelo.funkos.Funkos;
import Modelo.funkos.humanos.Humanos;
import Modelo.funkos.superheroes.Superheroe;
import Vista.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Laura
 */
public class EventosCabello implements ActionListener {

    private JFcabello jfcabello;
    private Funkos funkos;
    public int currentImageIndex = 0;
    public String cabello;
    public int cabelloAmount;

    public EventosCabello(JFcabello jfcabello, Funkos funkos) {
        this.jfcabello = jfcabello;
        this.funkos = funkos;

        this.jfcabello.BIzquierda.addActionListener(this);
        this.jfcabello.Bderecha.addActionListener(this);
        this.jfcabello.BSiguiente.addActionListener(this);
        this.jfcabello.BAntes.addActionListener(this);

        this.jfcabello.setVisible(true);

        inicializar();

        movimientos(currentImageIndex);
        rsscalelabel.RSScaleLabel.setScaleLabel(jfcabello.LabelFunk1, "src" + funkos.getColorPiel(funkos.getPieln()).getColorPiel());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jfcabello.Bderecha)) {
            currentImageIndex = (currentImageIndex + 1) % cabelloAmount;
            movimientos(currentImageIndex);
        }
        if (e.getSource().equals(this.jfcabello.BIzquierda)) {
            currentImageIndex = (currentImageIndex - 1 + cabelloAmount) % cabelloAmount;
            movimientos(currentImageIndex);
        }
        if (e.getSource().equals(this.jfcabello.BSiguiente)) {
            if (FactorySelector.getInstance().isGender() == 1) {
                EventosCamisa ev = new EventosCamisa(new JFCamisa(), funkos);
            } else {
                EventosBarba ev = new EventosBarba(new JFBarba(), funkos);
            }
            this.jfcabello.setVisible(false);
        }
        if (e.getSource().equals(this.jfcabello.BAntes)) {
            if (FactorySelector.getInstance().isHuman() == 0) {
                EventosCuerpo ev = new EventosCuerpo(new JFPaginaSiguiente(), new Superheroe(), "SH");
            } else {
                EventosCuerpo ev = new EventosCuerpo(new JFPaginaSiguiente(), new Humanos(), "H");
            }
            this.jfcabello.setVisible(false);

        }
    }

    public void movimientos(int currentImageIndex) {
        ImageIcon newIcon = new ImageIcon(getClass().getResource(funkos.getCabello(currentImageIndex).getData()));
        ImageIcon resizedIcon = new ImageIcon(newIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        jfcabello.JlabelOpcionesC.setIcon(resizedIcon);
        cabello = "src" + funkos.getCabello(currentImageIndex).getData();
        rsscalelabel.RSScaleLabel.setScaleLabel(jfcabello.LabelCabello, cabello);

    }

    public void inicializar() {
        cabelloAmount = funkos.getCabelloAmount();
    }

}
