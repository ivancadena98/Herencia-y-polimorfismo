import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
     ArrayList<Figura>figuras=new ArrayList<Figura>();
    public Lienzo()
    {
        Triangulo t1= new Triangulo(3,6);
        Cuadrado c1= new Cuadrado(4,4);
        Circulo ci1= new Circulo(5);
        Rombo r1= new Rombo(40,15);
        figuras.add(t1);
        figuras.add(c1);
        figuras.add(ci1);
        figuras.add(r1);
    }
   
        
   @Override
   public void paintComponent(Graphics g)
   {
       for(Figura f: figuras)
       {
           f.dibuja(g);
        }
   }
}
