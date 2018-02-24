/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restopos;

import View.MainFrame;
import View.WindowConsole;
import View._1Pedidos.Mesas.PedidosFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MoisesE
 */
public class Restopos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean started = false;
        do{
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        started = true;
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                String mess = "Ha Ocurrido un error Iniciando el programa: \n";
                mess += "Error: "+ex.getMessage();
                JOptionPane.showMessageDialog(null,mess);
                started = false;
                java.util.logging.Logger.getLogger(PedidosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }   
        }while (!started);
        java.awt.EventQueue.invokeLater(() ->{
            WindowConsole.show();
            MainFrame window = new MainFrame();
            window.repaint();
        });
    }
}
