package Vista.Admin.Cruds.Propietario;

import Controlador.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vPropietario {
    private JPanel pPrincipal;
    private JButton volverButton;

    //Getter
    public JPanel getpPrincipal() {
        return pPrincipal;
    }

    //Main
    public static void main(String[] args) {
        JFrame frame = new JFrame("vPropietario");
        frame.setContentPane(new vPropietario().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    //Todo
    public vPropietario() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.vPropietario.setVisible(false);
                Main.vCRUD.setVisible(true);
            }
        });
    }
}
