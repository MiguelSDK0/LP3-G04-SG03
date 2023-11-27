/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;
/**
 *
 * @author Miguel
 */
public class Bag<T> {
    protected Object[] items;
    protected int size;

    public Bag() {
        this.items = new Object[10]; 
        this.size = 0;
    }

    public void add(Object item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }
}