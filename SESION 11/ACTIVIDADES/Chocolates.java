public class Chocolates extends Goodies_2 {
    private String sabor;

    public Chocolates(String name, String sabor) {
        super(name);
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
        System.out.println("Chocolate: " + getName() + ", Sabor: " + sabor);
    }
}
