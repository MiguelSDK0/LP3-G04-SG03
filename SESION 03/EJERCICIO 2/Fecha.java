/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion_03_02;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }
    
    public void leer() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        dia = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = entrada.nextInt();
        System.out.println("Ingrese el anio: ");
        anio = entrada.nextInt();
        valida();
    }
    
    public void valida(){
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (dia < 1 || dia > 31) {
            dia = 1;
        }
    }
    
    public void bisiesto(){
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("EL anio es bisiesto");
        }else{
            System.out.println("El anio no es bisiesto");
        }
    }
    
    public int diasMes(){
        YearMonth mesanio = YearMonth.of(anio, mes);
        int cant = mesanio.lengthOfMonth();
        return cant;
    }
    
    public String corta(){
        return String.format("%02d-%02d-%02d", dia, mes, anio);
    }
    
    public long diasTranscurridos(){
        LocalDate inicio = LocalDate.parse("1900-01-01");
        String completo = String.format("%d-%02d-%02d", anio, mes, dia);
        LocalDate fin = LocalDate.parse(completo);
        Duration duracion = Duration.between(inicio.atStartOfDay(), fin.atStartOfDay());
        long dr = duracion.toDays();
        return dr;
    }
    
    public String diaSemana(){
        LocalDate completo = LocalDate.of(anio, mes, dia);
        DayOfWeek nombre = completo.getDayOfWeek();
        String nombreDelDia = nombre.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        return nombreDelDia;
    }
    
    public void larga(){
        LocalDate completo = LocalDate.of(anio, mes, dia);
        DayOfWeek nombreD = completo.getDayOfWeek();
        Month nombreM = completo.getMonth();
        String nombreDelDia = nombreD.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        String nombreDelMes = nombreM.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        System.out.println(nombreDelDia + " " + dia + " de " + nombreDelMes + " de " + anio);
    }
    
    public LocalDate fechaTras(int transcurrido){
        LocalDate inicio = LocalDate.of(1900, 1, 1);
        LocalDate fin = inicio.plusDays(transcurrido);
        return fin;
    }
    
    public LocalDate siguiente(){
        LocalDate inicio = LocalDate.of(anio, mes, dia);
        LocalDate fin = inicio.plusDays(1);
        return fin;
    }
    
    public LocalDate anterior(){
        LocalDate inicio = LocalDate.of(anio, mes, dia);
        LocalDate fin = inicio.plusDays(-1);
        return fin;
    }
    
    public String clon(){
        return String.format("%d-%02d-%02d", anio, mes, dia);
    }
    
    public String futuro(int futuro){
        LocalDate inicio = LocalDate.of(anio, mes, dia);
        LocalDate fin = inicio.plusDays(futuro);
        String actualizado = fin.toString();
        return actualizado;
    }
    
    public static boolean igualQue(String fecha1, String fecha2){
        LocalDate f1 = LocalDate.parse(fecha1);
        LocalDate f2 = LocalDate.parse(fecha2);
        if (f1.isEqual(f2)){
            return true;
        }
        return false;
    }
    
    public static boolean menorQue(String fecha1, String fecha2){
        LocalDate f1 = LocalDate.parse(fecha1);
        LocalDate f2 = LocalDate.parse(fecha2);
        if (f1.isBefore(f2)){
            return true;
        }
        return false;
    }
    
    public static boolean mayorQue(String fecha1, String fecha2){
        LocalDate f1 = LocalDate.parse(fecha1);
        LocalDate f2 = LocalDate.parse(fecha2);
        if (f1.isAfter(f2)){
            return true;
        }
        return false;
    }
}
