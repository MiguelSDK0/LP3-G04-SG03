/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_02_02;

/**
 *
 * @author user
 */
public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int año;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int año, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public int calcularEdad(int anio){
        int edad = 2023 - anio;
        return edad;
    }
    
    public double calcularFMC(double edad){
        double fmc = 208 - 0.7 * edad;
        return fmc;
    }
    
    public double calcularIMD(double peso, double altura){
        double imc = peso/altura;
        return imc;
    }
    
    @Override
    public String toString() {
        return "PerfilMedico{" + "nombre: " + nombre + ", apellido: " + apellido + ", sexo: " + sexo + ", fecha de nacimiento: " + dia + "/" + mes + "/" + año + ", altura: " + altura + ", peso: " + peso + '}';
    }
    
    
}
