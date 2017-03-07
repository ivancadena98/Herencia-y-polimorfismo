import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * El main crea un banco y agrega tres cuentas bancarias con un saldo de 100, 200 y 300.
 */
public class Main
{
public static void main(String [] args)
{
    //DecimalFormat d= new DecimalFormat("0.00");
    Banco B1;
    B1=new Banco();
    CuentaBancaria c1=new CuentaBancaria(100);
    CuentaBancaria c2=new CuentaBancaria(200);
    CuentaBancaria c3=new CuentaBancaria(300);
    B1.agregarCuenta(c1);
    B1.agregarCuenta(c2);
    B1.agregarCuenta(c3);
    
    
    Planeta P;
    P=new Planeta();
    Pais p1= new Pais(25000000);
    Pais p2= new Pais(32000000);
    Pais p3= new Pais(94000000);
    P.agregarPais(p1);
    P.agregarPais(p2);
    P.agregarPais(p3);
    System.out.println("Saldo promedio = "+B1.calcularPromedio());
    System.out.println("Habitantes promedio = "+P.calcularPromedio());
    
}
}
