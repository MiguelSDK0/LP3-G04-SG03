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
import java.sql.SQLException;

public class Parte3 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grupo4", "root", "");

            String query = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            preparedStatement.setString(1, "Manuel");
            preparedStatement.setString(2, "manuel@gmail.com");

            preparedStatement.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
