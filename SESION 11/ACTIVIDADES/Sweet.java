public class Sweet extends Biscuits {
    private String sabor;

    public Sweet(String name, int quantity, String sabor) {
        super(name, quantity);
        if (sabor == null || sabor.isEmpty()) {
            throw new IllegalArgumentException("El sabor no puede ser nulo o vacío");
        }
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    @Override
    public void display() {
        System.out.println("Dulce: " + getName() + ", Cantidad: " + getQuantity() + ", Sabor: " + sabor);
    }
}