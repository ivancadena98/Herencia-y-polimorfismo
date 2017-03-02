import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float r)
    {        super(x,y);

        radio=r;
    }
    
        public void dibuja(Graphics g)
    {

        Graphics2D g2= (Graphics2D)g;
        g2.drawOval(x,y,radio,radio);
    }
    
    
    /*public Circulo(float r)
    {
        radio=r;
    }
    
    
    public void calculaArea()
    {
        area=(float)3.1416*(float)Math.pow(radio,2);
    }
    
        public String dimeInfo()
    {
        return "Circulo " + super.dimeInfo();
    }
    
    @Override
    public String toString()
    { return "Area de Circulo es " +super.toString();}
    
    @Override
    public boolean equals(Object obj)
    {   if(obj instanceof Circulo)
        {return this.radio==((Circulo)obj).radio;}
        else
        {return false;}
    }*/
    
    
}
