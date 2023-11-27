public class Biscuits extends Goodies_2 {
    private int quantity;

    public Biscuits(String name, int quantity) {
        super(name);
        if (quantity < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void display() {
        System.out.println("Galleta: " + getName() + ", Cantidad: " + quantity);
    }
}