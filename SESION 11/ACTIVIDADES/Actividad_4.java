public class Actividad_4 {
    public static void main(String[] args) {
        try {
            Goodies_2 goodies = new Goodies_2("Gomitas");
            goodies.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Goodies: " + e.getMessage());
        }

        try {
            Biscuits biscuits = new Biscuits("Galleta Morocha", 5);
            biscuits.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Biscuits: " + e.getMessage());
        }

        try {
            Chocolates chocolates = new Chocolates("Chocolate Ferrero", "Dulce");
            chocolates.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Chocolates: " + e.getMessage());
        }

        try {
            Soda soda = new Soda("Inka Cola", 5, "Alto en azucar");
            soda.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Soda: " + e.getMessage());
        }

        try {
            Sweet sweet = new Sweet("Bizcocho", 8, "Vainilla");
            sweet.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Sweet: " + e.getMessage());
        }
    }
}