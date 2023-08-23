/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.funkos.FactorySelector;
import Modelo.funkos.Funkos;
import Vista.JFAccesorio;
import Vista.JFCamisa;
import Vista.JFPantalon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Laura
 */
public class EventosPantalon implements ActionListener {

    private JFPantalon jfpantalon;
    private Funkos funkos;
    public int currentImageIndex = 0;
    public int pantalonAmount;

    public EventosPantalon(JFPantalon jfpantalon, Funkos funkos) {
        this.jfpantalon = jfpantalon;
        this.funkos = funkos;

        this.jfpantalon.BIzquierda.addActionListener(this);
        this.jfpantalon.Bderecha.addActionListener(this);
        this.jfpantalon.BSiguiente.addActionListener(this);
        this.jfpantalon.BAntes.addActionListener(this);

        this.jfpantalon.setVisible(true);
        inicializar();
        movimientos(currentImageIndex);

        rsscalelabel.RSScaleLabel.setScaleLabel(jfpantalon.LabelFunk1, "src" + funkos.getColorPiel(funkos.getPieln()).getColorPiel());
        rsscalelabel.RSScaleLabel.setScaleLabel(jfpantalon.LabelCabello, "src" + funkos.getCabello(funkos.getCabellon()).getData());
        if (FactorySelector.getInstance().isGender() == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(jfpantalon.LabelBarba, "src" + funkos.getBarba(funkos.getBarban()).getData());
        }
        rsscalelabel.RSScaleLabel.setScaleLabel(jfpantalon.JLabelCamisa, "src" + funkos.getCamisa(funkos.getCamisan()).getData());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jfpantalon.Bderecha)) {
            currentImageIndex = (currentImageIndex + 1) % pantalonAmount;
            movimientos(currentImageIndex);
        }
        if (e.getSource().equals(this.jfpantalon.BIzquierda)) {
            currentImageIndex = (currentImageIndex - 1 + pantalonAmount) % pantalonAmount;
            movimientos(currentImageIndex);
        }
        if (e.getSource().equals(this.jfpantalon.BSiguiente)) {
            EventosAccesorios ev = new EventosAccesorios(new JFAccesorio(), funkos);
            this.jfpantalon.setVisible(false);
        }
        if (e.getSource().equals(this.jfpantalon.BAntes)) {
            EventosCamisa ev = new EventosCamisa(new JFCamisa(), funkos);
            this.jfpantalon.setVisible(false);
        }
    }

    public void movimientos(int currentImageIndex) {
        ImageIcon newIcon = new ImageIcon(getClass().getResource(funkos.getPantalon(currentImageIndex).getData()));
        ImageIcon resizedIcon = new ImageIcon(newIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        jfpantalon.JlabelOpcionesC.setIcon(resizedIcon);
        rsscalelabel.RSScaleLabel.setScaleLabel(jfpantalon.JLabelPantalon, "src" + funkos.getPantalon(currentImageIndex).getData());
    }

    public void inicializar() {
        pantalonAmount = funkos.getPantalonAmount();
    }

}
