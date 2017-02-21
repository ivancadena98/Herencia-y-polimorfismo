
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
        
        Figura [] figuras = new Figura[3];
        figuras[0]= t1;
        figuras[1]= c1;
        figuras[2]= ci1;
        
        for(int i=0;i<figuras.length;i++)
        {
            figuras[i].calculaArea();
        }
        
         for(int i=0;i<figuras.length;i++)
         {
             System.out.println("El area  es "+figuras[i].accedeArea());
            }
        
    }
}
