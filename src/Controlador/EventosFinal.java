/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.funkos.FactorySelector;
import Modelo.funkos.Funkos;
import Vista.JFAccesorio;
import Vista.JFFinal;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author TOSHIBA
 */
public class EventosFinal implements ActionListener {

    private JFFinal jfFinal;
    private Funkos funkos;
    public int currentImageIndex = 0;

    public EventosFinal(JFFinal jfFinal, Funkos funkos) {
        this.jfFinal = jfFinal;
        this.funkos = funkos;
        this.jfFinal.BSetName.addActionListener(this);
        this.jfFinal.BExportar.addActionListener(this);
        this.jfFinal.BAntes.addActionListener(this);

        this.jfFinal.setVisible(true);
        rsscalelabel.RSScaleLabel.setScaleLabel(jfFinal.LabelFunk1, "src" + funkos.getColorPiel(funkos.getPieln()).getColorPiel());
        rsscalelabel.RSScaleLabel.setScaleLabel(jfFinal.LabelCabello, "src" + funkos.getCabello(funkos.getCabellon()).getData());
        if (FactorySelector.getInstance().isGender() == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(jfFinal.LabelBarba, "src" + funkos.getBarba(funkos.getBarban()).getData());
        }
        rsscalelabel.RSScaleLabel.setScaleLabel(jfFinal.JLabelCamisa, "src" + funkos.getCamisa(funkos.getCamisan()).getData());
        rsscalelabel.RSScaleLabel.setScaleLabel(jfFinal.JLabelPantalon, "src" + funkos.getPantalon(funkos.getPantalonn()).getData());
        rsscalelabel.RSScaleLabel.setScaleLabel(jfFinal.JlabelAccesosrios, "src" + funkos.getAccesorios(funkos.getAccesoriosn()).getData());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jfFinal.BSetName)) {
            String nombre = jfFinal.TextName.getText();
            jfFinal.JlabelNombre.setText(nombre);
        }
        if (e.getSource().equals(this.jfFinal.BExportar)) {

            try {
                Robot robot = new Robot();
                Rectangle captureArea = new Rectangle(180, 160, 220, 290); // Define el área de captura (x, y, ancho, alto)
                BufferedImage screenshot = robot.createScreenCapture(captureArea);
                File output = new File("funko_export.png");
                ImageIO.write(screenshot, "png", output);
            } catch (AWTException | IOException ea) {
                ea.printStackTrace();
            }
        }
        if (e.getSource().equals(this.jfFinal.BAntes)) {
            EventosAccesorios ev = new EventosAccesorios(new JFAccesorio(), funkos);
            this.jfFinal.setVisible(false);
        }
    }

}
