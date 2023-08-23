/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.funkos.FactorySelector;
import Modelo.funkos.Funkos;
import Vista.JFAccesorio;
import Vista.JFFinal;
import Vista.JFPantalon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author TOSHIBA
 */
public class EventosAccesorios implements ActionListener {

    private final JFAccesorio jfAccesorios;
    private final Funkos funkos;
    public int currentImageIndex = 0;
    public int accesorioAmount;

    public EventosAccesorios(JFAccesorio jfAccesorios, Funkos funkos) {
        this.jfAccesorios = jfAccesorios;
        this.funkos = funkos;
        this.jfAccesorios.BIzquierda.addActionListener(this);
        this.jfAccesorios.Bderecha.addActionListener(this);
        this.jfAccesorios.BSiguiente.addActionListener(this);
        this.jfAccesorios.BAntes.addActionListener(this);

        this.jfAccesorios.setVisible(true);
        inicializar();
        movimientos(currentImageIndex);
        rsscalelabel.RSScaleLabel.setScaleLabel(jfAccesorios.LabelFunk1, "src" + funkos.getColorPiel(funkos.getPieln()).getColorPiel());
        rsscalelabel.RSScaleLabel.setScaleLabel(jfAccesorios.LabelCabello, "src" + funkos.getCabello(funkos.getCabellon()).getData());
        if (FactorySelector.getInstance().isGender() == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(jfAccesorios.LabelBarba, "src" + funkos.getBarba(funkos.getBarban()).getData());
        }
        rsscalelabel.RSScaleLabel.setScaleLabel(jfAccesorios.JLabelCamisa, "src" + funkos.getCamisa(funkos.getCamisan()).getData());
        rsscalelabel.RSScaleLabel.setScaleLabel(jfAccesorios.JLabelPantalon, "src" + funkos.getPantalon(funkos.getPantalonn()).getData());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jfAccesorios.Bderecha)) {
            currentImageIndex = (currentImageIndex + 1) % accesorioAmount;
            movimientos(currentImageIndex);
        }
        if (e.getSource().equals(this.jfAccesorios.BIzquierda)) {
            currentImageIndex = (currentImageIndex - 1 + accesorioAmount) % accesorioAmount;
            movimientos(currentImageIndex);
        }
        if (e.getSource().equals(this.jfAccesorios.BSiguiente)) {
            EventosFinal ev = new EventosFinal(new JFFinal(), funkos);
            this.jfAccesorios.setVisible(false);
        }
        if (e.getSource().equals(this.jfAccesorios.BAntes)) {
            EventosPantalon ev = new EventosPantalon(new JFPantalon(), funkos);
            this.jfAccesorios.setVisible(false);
        }
    }

    public void movimientos(int currentImageIndex) {
        ImageIcon newIcon = new ImageIcon(getClass().getResource(funkos.getAccesorios(currentImageIndex).getData()));
        ImageIcon resizedIcon = new ImageIcon(newIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        jfAccesorios.JlabelOpcionesC.setIcon(resizedIcon);
        rsscalelabel.RSScaleLabel.setScaleLabel(jfAccesorios.JlabelAccesosrios, "src" + funkos.getAccesorios(currentImageIndex).getData());
    }

    public void inicializar() {
        accesorioAmount = funkos.getAccesoriosAmount();
    }

}
