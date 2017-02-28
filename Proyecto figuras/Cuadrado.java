import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
    private float Lado;
    private float Lado2;
    
    public Cuadrado(float l1,float l2)
    {
        Lado=l1;
        Lado2=l2;
    }
    
    public void calculaArea()
    {
        area=(Lado*Lado2);
    }
    
        public String dimeInfo()
    {
        return "Cuadrado " + super.dimeInfo();
    }
    
    @Override
    public String toString()
    { return "Area de Cuadrado es " +super.toString();}
}
