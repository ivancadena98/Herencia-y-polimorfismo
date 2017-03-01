import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(float b,float a)
    {
        super(x,y);
        base=b;
        altura=a;
    }
    
    
    public void dibuja(Graphics g)
    {

        Graphics2D g2= (Graphics2D)g;
        g2.drawLine(x,y,base/2,y);
        g2.drawLine(x,y,x,base/2);
        g2.drawLine(base/2,y,x,base/2);
    }
    
    
    
    
    /*public Triangulo(float b,float a)
    {
        base=b;
        altura=a;
    }
    
    public void calculaArea()
    {
        area=(base*altura)/2;
    }
    
    public String dimeInfo()
    {
        return "Triangulo " + super.dimeInfo();
    }
    
        @Override
    public String toString()
    { return "Area de Triangulo es " +super.toString();}*/
}
