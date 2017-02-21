
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main 
{
    public static void main(String [] args)
    {
        Triangulo t1= new Triangulo(3,6);
        Cuadrado c1= new Cuadrado(4,4);
        Circulo ci1= new Circulo(5);
        t1.calculaArea();
        c1.calculaAreaC();
        ci1.calculaAreaCi();
        System.out.println("El area del triangulo es "+t1.accedeArea());
        System.out.println("El area del cuadrado es "+c1.accedeArea());
        System.out.println("El area del circulo es "+ci1.accedeArea());
        
    }
}
