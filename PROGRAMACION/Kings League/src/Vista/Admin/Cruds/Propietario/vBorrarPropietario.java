package Vista.Admin.Cruds.Propietario;

import Controlador.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vBorrarPropietario extends JDialog{
    private JPanel panelAbajo;
    private JPanel panelArriba;
    private JPanel panelCentrado;
    private JButton volverButton;
    private JButton borrarButton;
    private JComboBox cbIDPropietario;
    private JTextField tfNombre;
    private JPanel pPrincipal;

    public vBorrarPropietario(){
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.vBorrarPropietario.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("vBorrarPropietario");
        frame.setContentPane(new vBorrarPropietario().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel getpPrincipal() {
        return pPrincipal;
    }
}
