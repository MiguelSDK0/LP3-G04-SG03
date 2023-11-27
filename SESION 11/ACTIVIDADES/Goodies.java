/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACTIVIDADES;

import java.util.Objects;

/**
 *
 * @author Miguel
 */
public class Goodies implements Contenedorapp {
    int id;
    String description;
    float price;

    Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public Goodies(int id) {
        this.id = id;
    }

    @Override
    public boolean contiene(Object valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
                 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Goodies goodie = (Goodies) obj;
        return id == goodie.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
