/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author Miguel
 */
public class Etiquetas extends JFrame{
    private JTextField campoTexto1; 
    private JTextField campoTexto2; 
    private JTextField campoTexto3;
    private final JLabel etiqueta1;
    private final JLabel etiqueta2;
    private final JLabel etiqueta3;
    private final JLabel etiqueta4;
    private final JLabel etiqueta5;
    private final JLabel etiqueta6;
    private final JLabel etiqueta7;
    private final JLabel etiqueta8;
    private final JButton botonBlanquear;
    private final JButton botonDatos;
    private JCheckBox audifonos;
    private JCheckBox mantas;
    private JCheckBox revistas;
    private String opcionCheckBox = "Ninguna";
    private final JRadioButton piso1;
    private final JRadioButton piso2;
    private ButtonGroup grupoOpciones;
    private String opcionPiso ="1er Piso";
    private final JComboBox<String> origen;
    private final JComboBox<String> destino;
    private String opcionOrigen ="";
    private String opcionDestino ="";
    private static final String origenNombres[] = {"Arequipa","Cusco","Trujillo"};
    private static final String destinoNombres[] = {"Cajamarca","Puno","Lima"};
    private final JList<String> calidadServicio;
    private static final String[] servicios= {"economico","standard","VIP"};
    private String opcionServicio ="";

    public Etiquetas() {
        setTitle("Chambi Cesar y Mamani Miguel");
        setLayout(new FlowLayout());
        
        etiqueta1 = new JLabel("Nombres");
        add(etiqueta1);
        campoTexto1 = new JTextField(10);
        add(campoTexto1); 
        etiqueta2 = new JLabel("Documento de identidad");
        add(etiqueta2);
        campoTexto2 = new JTextField(10);
        add(campoTexto2); 
        etiqueta3 = new JLabel("Fecha viaje");
        add(etiqueta3);
        campoTexto3 = new JTextField(10);
        add(campoTexto3); 
        
        etiqueta4 = new JLabel("Servicios adicionales: ");
        add(etiqueta4);
        audifonos = new JCheckBox("audífonos");
        mantas = new JCheckBox("manta");
        revistas = new JCheckBox("revistas"); 
        add(audifonos);
        add(mantas);
        add(revistas);
        
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        audifonos.addItemListener(manejador);
        mantas.addItemListener(manejador);
        revistas.addItemListener(manejador);
        
        etiqueta5 = new JLabel("Piso: ");
        add(etiqueta5);
        piso1 = new JRadioButton("1er piso", true);
        piso2 = new JRadioButton("2do piso", true);
        add(piso1);
        add(piso2);
        
        grupoOpciones = new ButtonGroup();
        grupoOpciones.add(piso1);
        grupoOpciones.add(piso2);
        
        piso1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evento) {
                opcionPiso = "1er Piso";
            }
        });
        
        piso2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evento) {
                opcionPiso = "2do Piso";
            }
        });
        
        etiqueta6 = new JLabel("Origen");
        add(etiqueta6);
        origen = new JComboBox<String>(origenNombres);
        origen.setMaximumRowCount(3);
        origen.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evento) {
                opcionOrigen = (String)origen.getSelectedItem();
            }
        });
        add(origen);
        
        etiqueta7 = new JLabel("Destino");
        add(etiqueta7);
        destino = new JComboBox<String>(destinoNombres);
        destino.setMaximumRowCount(3);
        destino.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evento) {
                opcionDestino = (String)destino.getSelectedItem();
            }
        });
        add(destino);
        
        etiqueta8 = new JLabel("Calidad de servicio: ");
        add(etiqueta8);
        calidadServicio = new JList<String>(servicios);
        calidadServicio.setVisibleRowCount(3);
        add(new JScrollPane(calidadServicio));
        calidadServicio.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evento) {
                opcionServicio = (String)calidadServicio.getSelectedValue();
            }
        });
        
        botonBlanquear = new JButton ("Reiniciar");
        add(botonBlanquear);
        botonDatos = new JButton ("Mostrar Datos");
        add(botonDatos);
        
        ManejadorBotonBlanquear blanqueo = new ManejadorBotonBlanquear();
        ManejadorBotonDatos datos = new ManejadorBotonDatos();
        botonBlanquear.addActionListener(blanqueo);
        botonDatos.addActionListener(datos); 
    }

    private class ManejadorBotonBlanquear implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            campoTexto1.setText(null);
            campoTexto2.setText(null);
            campoTexto3.setText(null);
            opcionCheckBox = "---";
            opcionOrigen = "---";
            opcionDestino = "---";
            opcionServicio = "---";
        }
    }

    private class ManejadorBotonDatos implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(Etiquetas.this, String.format(
                "Nombre: " + campoTexto1.getText() + "\n"+
                "Documento de Identidad: " + campoTexto2.getText() + "\n"+
                "Fecha de viaje: " + campoTexto3.getText() + "\n"+
                "Servicios Adicionales: " + opcionCheckBox + "\n"+
                "Piso: " + opcionPiso + "\n"+
                "Origen: " + opcionOrigen + "\n"+
                "Destino: " + opcionDestino + "\n"+
                "Calidad de Servicio: " + opcionServicio + "\n"
            ));
        }
    }

    private class ManejadorCheckBox implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent evento) {
            if (audifonos.isSelected() && mantas.isSelected() && revistas.isSelected()) {
                opcionCheckBox = "Audífonos, mantas y revistas";
            } else if (audifonos.isSelected() && mantas.isSelected()) {
                opcionCheckBox = "Audífonos y mantas";
            } else if (audifonos.isSelected() && revistas.isSelected()) {
                opcionCheckBox = "Audífonos y revistas";
            } else if (mantas.isSelected() && revistas.isSelected()) {
                opcionCheckBox = "Mantas y revistas";
            } else {
                opcionCheckBox = "Ninguna";
            }
        }
    }
}
