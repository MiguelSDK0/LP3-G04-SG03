public class Soda extends Biscuits {
    private String type;

    public Soda(String name, int quantity, String type) {
        super(name, quantity);
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("El tipo no puede ser nulo o vacío");
        }
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void display() {
        System.out.println("Soda: " + getName() + ", Cantidad: " + getQuantity() + ", Tipo: " + type);
    }
}