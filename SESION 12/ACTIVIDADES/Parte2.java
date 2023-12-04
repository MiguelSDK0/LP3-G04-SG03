/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDADES;

/**
 *
 * @author Miguel
 */
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class Parte2 {
    public static void main(String[] args) {
        try {
            CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();

            rowSet.setUrl("jdbc:mysql://localhost:3306/grupo4");
            rowSet.setUsername("root");
            rowSet.setPassword("");

            rowSet.setCommand("SELECT * FROM usuarios");
            rowSet.execute();

            while (rowSet.next()) {
                int id = rowSet.getInt("id");
                String nombre = rowSet.getString("nombre");
                String email = rowSet.getString("email");
            }

            rowSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
