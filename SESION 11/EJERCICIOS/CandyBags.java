/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author Miguel
 */
public class CandyBags extends Bag<Goodies> {

    public CandyBags() {
        super();
    }

    @Override
    public void add(Object item) {
        if (item instanceof Goodies && !containsGoodie((Goodies) item)) {
            super.add(item);
        }
    }

    private boolean containsGoodie(Goodies goodie) {
        for (int i = 0; i < size; i++) {
            if (items[i] instanceof Goodies) {
                Goodies GoodieActual = (Goodies) items[i];
                if (GoodieActual.getNombre().equals(goodie.getNombre())) {
                    return true;
                }
            }
        }
        return false;
    }

    public Goodies cheapest() {
        if (size == 0) {
            return null;
        }
        Goodies cheapestGoodie = (Goodies) items[0];
        for (int i = 0; i < size; i++) {
            if (items[i] instanceof Goodies) {
                Goodies currentGoodie = (Goodies) items[i];
                if (currentGoodie.getPrecio() < cheapestGoodie.getPrecio()) {
                    cheapestGoodie = currentGoodie;
                }
            }
        }
        return cheapestGoodie;
    }

    public Goodies[] mostExpensive(int n) {
        if (size == 0) {
            return null;
        }
        Goodies[] sortedGoodies = new Goodies[size];
        System.arraycopy(items, 0, sortedGoodies, 0, size);
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (sortedGoodies[j].getPrecio() < sortedGoodies[j + 1].getPrecio()) {
                    Goodies temp = sortedGoodies[j];
                    sortedGoodies[j] = sortedGoodies[j + 1];
                    sortedGoodies[j + 1] = temp;
                }
            }
        }
        int resultSize = Math.min(n, size);
        Goodies[] result = new Goodies[resultSize];
        System.arraycopy(sortedGoodies, 0, result, 0, resultSize);

        return result;
    }
}
