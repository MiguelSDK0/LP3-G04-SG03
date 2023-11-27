/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Dictionary {
    private ArrayList<OrderedPair> list;

    public Dictionary() {
        this.list = new ArrayList<OrderedPair>();
    }

    public ArrayList<OrderedPair> getList() {
        return list;
    }

    public void setList(ArrayList<OrderedPair> list) {
        this.list = list;
    }

    public <K, V> void add(K key, V value) {
        OrderedPair parAgregar = new OrderedPair(key, value);
        list.add(parAgregar);
    }

    public <K> boolean delete(K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey().equals(key)) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public <K, V> V getValue(K key) throws ObjectNoExist {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey().equals(key)) {
                V value = (V) list.get(i).getValue();
                return value;
            }
        }
        throw new ObjectNoExist();
    }

    @Override
    public String toString() {
        return "Dictionary \n" + list;
    }
}
