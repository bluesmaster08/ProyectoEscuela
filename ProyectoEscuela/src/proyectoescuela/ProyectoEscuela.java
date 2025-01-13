/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 *
 * @author equipo
 */
public class ProyectoEscuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioClienteEstudiante.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioServidorEscuela.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoEscuela.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        }

        // </editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Instancia el formulario del lado derecho (servidor)
                FormularioServidorEscuela formularioServidor = new FormularioServidorEscuela();
                posicionFormularioDerecho(formularioServidor);
                formularioServidor.setVisible(true);
                // Esperar un momento para asegurarse de que el servidor esté en marcha antes de
                // mostrar el cliente
                try {
                    Thread.sleep(3000); // Aparecerá despues de 3 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Instancia el formulario del lado izquierdo (cliente)
                FormularioClienteEstudiante formularioCliente = new FormularioClienteEstudiante();
                posicionFormularioIzquierdo(formularioCliente);
                formularioCliente.setVisible(true);
            }
        });
    }

    private static void posicionFormularioIzquierdo(JFrame formulario) {
        formulario.setLocation(0, 0);
    }

    private static void posicionFormularioDerecho(JFrame formulario) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int formularioWidth = formulario.getWidth();

        int x = screenWidth - formularioWidth; // Posición derecha
        formulario.setLocation(x, 0);
    }
}
