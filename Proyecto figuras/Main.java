import java.util.ArrayList;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main 
{
    private ArrayList<Figura>f;
    public static void main(String [] args)
    {
        Ventana vent= new Ventana(900,700);
        vent.setVisible(true);
        
        Triangulo t1= new Triangulo(3,6);
        Cuadrado c1= new Cuadrado(4,4);
        Circulo ci1= new Circulo(5);
        Circulo ci2= new Circulo(5);
        
        ArrayList<Figura>figuras=new ArrayList<Figura>();
        figuras.add(t1);
        figuras.add(c1);
        figuras.add(ci1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*if(ci1.equals(t1))
        {
            System.out.println("Iguales ");
        }
        else 
            {System.out.println("Diferentes");}
            
        
        for(Figura f:figuras)
        {
            f.calculaArea();
        }
        
        for(Figura f:figuras)
        {
            System.out.println(f);
        }
        for(int i=0;i<figuras.length;i++)
        {
            figuras[i].calculaArea();
        }
        
         for(int i=0;i<figuras.length;i++)
         {
             System.out.println("El area  es "+figuras[i].accedeArea());
            }*/
        
    }
}
