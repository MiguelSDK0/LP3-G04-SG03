/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Ejercicio1 {
    private static Connection conexion;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Query Result");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        DefaultTableModel model = new DefaultTableModel(new Object[] { "id", "nombre", "email" }, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        JTextField sqlTextField = new JTextField();
        JTextField whereTextField = new JTextField();
        sqlTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (conexion == null) {
                    establecerConexion();
                }
                String sql = sqlTextField.getText();
                String where = whereTextField.getText();
                String completeSql = sql + where;
                try {
                    Statement statement = conexion.createStatement();
                    ResultSet rs = statement.executeQuery(completeSql);
                    model.setRowCount(0);
                    while (rs.next()) {
                        Object[] row = new Object[3];
                        row[0] = rs.getInt("id");
                        row[1] = rs.getString("nombre");
                        row[2] = rs.getString("email");
                        model.addRow(row);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        frame.add(sqlTextField, BorderLayout.NORTH);

        frame.add(whereTextField, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    private static void establecerConexion() {
        String url = "jdbc:mysql://localhost:3306/grupo4";
        String nombre = "root";
        String contra = "";
        try {
            conexion = DriverManager.getConnection(url, nombre, contra);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
