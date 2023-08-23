/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.funkos.FactorySelector;
import Modelo.funkos.Funkos;
import Vista.JFBarba;
import Vista.JFCamisa;
import Vista.JFPantalon;
import Vista.JFcabello;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Laura
 */
public class EventosCamisa implements ActionListener {

    private JFCamisa jfcamisa;
    private Funkos funkos;
    public int currentImageIndex = 0;
    public int camisaAmount;

    public EventosCamisa(JFCamisa jfcamisa, Funkos funkos) {
        this.jfcamisa = jfcamisa;
        this.funkos = funkos;

        this.jfcamisa.BIzquierda.addActionListener(this);
        this.jfcamisa.Bderecha.addActionListener(this);
        this.jfcamisa.BSiguiente.addActionListener(this);
        this.jfcamisa.BAntes.addActionListener(this);

        this.jfcamisa.setVisible(true);
        inicializar();

        movimientos(currentImageIndex);
        rsscalelabel.RSScaleLabel.setScaleLabel(jfcamisa.LabelFunk1, "src" + funkos.getColorPiel(funkos.getPieln()).getColorPiel());
        rsscalelabel.RSScaleLabel.setScaleLabel(jfcamisa.LabelCabello, "src" + funkos.getCabello(funkos.getCabellon()).getData());
        if (FactorySelector.getInstance().isGender() == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(jfcamisa.LabelBarba, "src" + funkos.getBarba(funkos.getBarban()).getData());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jfcamisa.Bderecha)) {
            currentImageIndex = (currentImageIndex + 1) % camisaAmount;
            movimientos(currentImageIndex);
        }
        if (e.getSource().equals(this.jfcamisa.BIzquierda)) {
            currentImageIndex = (currentImageIndex - 1 + camisaAmount) % camisaAmount;
            movimientos(currentImageIndex);
        }
        if (e.getSource().equals(this.jfcamisa.BSiguiente)) {
            EventosPantalon ev = new EventosPantalon(new JFPantalon(), funkos);
            this.jfcamisa.setVisible(false);
        }
        if (e.getSource().equals(this.jfcamisa.BAntes)) {
            if (FactorySelector.getInstance().isGender() == 0) {
                EventosBarba ev = new EventosBarba(new JFBarba(), funkos);
            } else {
                EventosCabello ev = new EventosCabello(new JFcabello(), funkos);
            }
            this.jfcamisa.setVisible(false);
        }
    }

    public void movimientos(int currentImageIndex) {
        ImageIcon newIcon = new ImageIcon(getClass().getResource(funkos.getCamisa(currentImageIndex).getData()));
        ImageIcon resizedIcon = new ImageIcon(newIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        jfcamisa.JlabelOpciones.setIcon(resizedIcon);
        rsscalelabel.RSScaleLabel.setScaleLabel(jfcamisa.JLabelCamisa, "src" + funkos.getCamisa(currentImageIndex).getData());
    }

    public void inicializar() {
        camisaAmount = funkos.getCamisaAmount();
    }

}
