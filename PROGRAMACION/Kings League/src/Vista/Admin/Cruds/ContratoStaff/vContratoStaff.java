package Vista.Admin.Cruds.ContratoStaff;

import Controlador.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vContratoStaff {
    private JPanel pPrincipal;
    private JButton volverButton;

    //Getter
    public JPanel getpPrincipal() {
        return pPrincipal;
    }

    //Main
    public static void main(String[] args) {
        JFrame frame = new JFrame("vContratoStaff");
        frame.setContentPane(new vContratoStaff().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    //Todo
    public vContratoStaff() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.vContratoStaff.setVisible(false);
                Main.vCRUD.setVisible(true);
            }
        });
    }
}
