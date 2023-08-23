package Controlador;

import Modelo.funkos.FabricaFunkos;
import Modelo.funkos.FactorySelector;
import Modelo.funkos.Funkos;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosCuerpo implements ActionListener {

    private final JFPaginaSiguiente JFPaginaSiguiente;
    private FabricaFunkos tipoFunko;
    private Funkos funkos;
    public String cuerpo;
    public String tipo;
    public String ss;
    public String colorRuta;

    public EventosCuerpo(JFPaginaSiguiente JFPaginaSiguiente, FabricaFunkos tipoFunko, String tipo) {
        this.JFPaginaSiguiente = JFPaginaSiguiente;
        this.tipoFunko = tipoFunko;
        this.tipo = tipo;
        this.JFPaginaSiguiente.BHombre.addActionListener(this);
        this.JFPaginaSiguiente.BMujer.addActionListener(this);
        this.JFPaginaSiguiente.BNegro.addActionListener(this);
        this.JFPaginaSiguiente.BNegro2.addActionListener(this);
        this.JFPaginaSiguiente.Bblanco.addActionListener(this);
        this.JFPaginaSiguiente.Bblanco2.addActionListener(this);
        this.JFPaginaSiguiente.Bsiguiente.addActionListener(this);
        this.JFPaginaSiguiente.Bantes.addActionListener(this);

        this.JFPaginaSiguiente.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.JFPaginaSiguiente.BMujer)) {
            enableBotones();
            FactorySelector.getInstance().setGender(1);
        }
        if (e.getSource().equals(this.JFPaginaSiguiente.BHombre)) {
            enableBotones();
            FactorySelector.getInstance().setGender(0);
        }
        if (e.getSource().equals(this.JFPaginaSiguiente.Bblanco)) {
            funkos = FactorySelector.getInstance().getFunkos();
            colorRuta = funkos.getColorPiel(0).getColorPiel();
            determinar(colorRuta);
        }
        if (e.getSource().equals(this.JFPaginaSiguiente.Bblanco2)) {
            funkos = FactorySelector.getInstance().getFunkos();
            colorRuta = funkos.getColorPiel(1).getColorPiel();
            determinar(colorRuta);

        }
        if (e.getSource().equals(this.JFPaginaSiguiente.BNegro)) {
            funkos = FactorySelector.getInstance().getFunkos();
            colorRuta = funkos.getColorPiel(2).getColorPiel();
            determinar(colorRuta);
        }
        if (e.getSource().equals(this.JFPaginaSiguiente.BNegro2)) {
            funkos = FactorySelector.getInstance().getFunkos();
            colorRuta = funkos.getColorPiel(3).getColorPiel();
            determinar(colorRuta);
        }
        if (e.getSource().equals(this.JFPaginaSiguiente.Bsiguiente)) {
            this.JFPaginaSiguiente.setVisible(false);
            EventosCabello evcab = new EventosCabello(new JFcabello(), funkos);
        }
        if (e.getSource().equals(this.JFPaginaSiguiente.Bantes)) {
            this.JFPaginaSiguiente.setVisible(false);
            EventosPaginaInicio in = new EventosPaginaInicio(new VentanaInicial());
        }
    }

    public void determinar(String ll) {
        rsscalelabel.RSScaleLabel.setScaleLabel(JFPaginaSiguiente.LabelFunk1, "src" + colorRuta);
        JFPaginaSiguiente.Bsiguiente.setEnabled(true);
    }

    public void enableBotones() {
        JFPaginaSiguiente.Bblanco.setEnabled(true);
        JFPaginaSiguiente.Bblanco2.setEnabled(true);
        JFPaginaSiguiente.BNegro.setEnabled(true);
        JFPaginaSiguiente.BNegro2.setEnabled(true);
    }
}
