/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADMINISTRADORES_DE_ESQUEMAS_DE_GUI;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
/**
 *
 * @author Miguel
 */
public class MarcoPanel extends JFrame{
    private final JPanel panelBotones; // panel que contiene los botones
    private final JButton[] botones;

    // constructor sin argumentos
    public MarcoPanel() {
        super("Chambi Cesar y Mamani Miguel");
        botones = new JButton[5];
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, botones.length));

        // crea y agrega los botones
        for (int cuenta = 0; cuenta < botones.length; cuenta++) {
            botones[cuenta] = new JButton("Boton " + (cuenta + 1));
            panelBotones.add(botones[cuenta]); // agrega el botón al panel
        }

        add(panelBotones, BorderLayout.SOUTH); // agrega el panel a JFrame
    }
}
