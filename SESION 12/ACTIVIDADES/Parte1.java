/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDADES;

/**
 *
 * @author Miguel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Parte1 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grupo4", "root", "");

            PreparedStatement insertStatement = conn.prepareStatement("INSERT INTO usuarios (nombre, email) VALUES (?, ?)");
            insertStatement.setString(1, "Paul");
            insertStatement.setString(2, "paul@gmail.com");
            insertStatement.executeUpdate();

            Statement selectStatement = conn.createStatement();
            ResultSet resultSet = selectStatement.executeQuery("SELECT * FROM usuarios");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
            }

            PreparedStatement updateStatement = conn.prepareStatement("UPDATE usuarios SET nombre = ? WHERE id = ?");
            updateStatement.setString(1, "Claudia");
            updateStatement.setInt(2, 2);
            updateStatement.executeUpdate();

            PreparedStatement deleteStatement = conn.prepareStatement("DELETE FROM usuarios WHERE id = ?");
            deleteStatement.setInt(1, 1);
            deleteStatement.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
