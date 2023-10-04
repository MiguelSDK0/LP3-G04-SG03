/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3;

/**
 *
 * @author User
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private char tipoCliente;
    
    static private int numC = 1000;
    static private int numB = 5000;
    static private int numE = 8000;

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(numC++, 0);
        this.tipoCliente =  'C';
    }
    public Persona(int id, String nombre, String apellido, char tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = tipoCliente;
        if(this.tipoCliente == 'C'){
            this.cuenta = new Cuenta(numC++,0);
        }
        if(this.tipoCliente == 'B'){
            this.cuenta = new Cuenta(numB++,0);
        }
        if(this.tipoCliente == 'E'){
            this.cuenta = new Cuenta(numE++,0);
        }
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public static void setNumC(int numC) {
        Persona.numC = numC;
    }

    public static void setNumB(int numB) {
        Persona.numB = numB;
    }

    public static void setNumE(int numE) {
        Persona.numE = numE;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public static int getNumC() {
        return numC;
    }

    public static int getNumB() {
        return numB;
    }

    public static int getNumE() {
        return numE;
    }

    @Override
    public String toString() {
        return "Cliente: " + id + "\nTipo: " + tipoCliente + "\nNombres: " + nombre + " " + apellido + "\n" + cuenta;
    }
}