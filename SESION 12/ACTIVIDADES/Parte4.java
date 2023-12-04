/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDADES;

/**
 *
 * @author Miguel
 */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Parte4 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grupo4", "root", "");

            String procedureCall = "{call SeleccionarRegistros(?, ?)}";
            CallableStatement callableStatement = conn.prepareCall(procedureCall);
            callableStatement.setInt(1, 123);
            callableStatement.registerOutParameter(2, Types.VARCHAR);
            callableStatement.execute();

            String result = callableStatement.getString(2);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
