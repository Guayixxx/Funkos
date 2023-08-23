/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.funkos.Funkos;
import Vista.JFBarba;
import Vista.JFCamisa;
import Vista.JFcabello;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Laura
 */
public class EventosBarba implements ActionListener {

    private JFBarba jfBarba;
    private Funkos funkos;
    public int currentImageIndex = 0;
    public ArrayList<String> imagePaths = new ArrayList<>();
    public int barbaAmount;

    public EventosBarba(JFBarba jfBarba, Funkos funkos) {
        this.jfBarba = jfBarba;
        this.funkos = funkos;

        this.jfBarba.BIzquierda.addActionListener(this);
        this.jfBarba.Bderecha.addActionListener(this);
        this.jfBarba.BSiguiente.addActionListener(this);
        this.jfBarba.BAntes.addActionListener(this);

        this.jfBarba.setVisible(true);

        inicializar();

        movimientos(currentImageIndex);
        rsscalelabel.RSScaleLabel.setScaleLabel(jfBarba.LabelFunk1, "src" + funkos.getColorPiel(funkos.getPieln()).getColorPiel());
        rsscalelabel.RSScaleLabel.setScaleLabel(jfBarba.LabelCabello, "src" + funkos.getCabello(funkos.getCabellon()).getData());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jfBarba.Bderecha)) {
            currentImageIndex = (currentImageIndex + 1) % barbaAmount;
            movimientos(currentImageIndex);
        }
        if (e.getSource().equals(this.jfBarba.BIzquierda)) {
            currentImageIndex = (currentImageIndex - 1 + barbaAmount) % barbaAmount;
            movimientos(currentImageIndex);
        }
        if (e.getSource().equals(this.jfBarba.BSiguiente)) {
            EventosCamisa ev = new EventosCamisa(new JFCamisa(), funkos);
            this.jfBarba.setVisible(false);
        }
        if (e.getSource().equals(this.jfBarba.BAntes)) {
            EventosCabello ev = new EventosCabello(new JFcabello(), funkos);
            this.jfBarba.setVisible(false);
        }
    }

    public void movimientos(int currentImageIndex) {
        ImageIcon newIcon = new ImageIcon(getClass().getResource(funkos.getBarba(currentImageIndex).getData()));
        ImageIcon resizedIcon = new ImageIcon(newIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        jfBarba.JlabelOpcionesC.setIcon(resizedIcon);
        rsscalelabel.RSScaleLabel.setScaleLabel(jfBarba.LabelBarba, "src" + funkos.getBarba(currentImageIndex).getData());
    }

    public void inicializar() {
        barbaAmount = funkos.getBarbaAmount();
    }

}
