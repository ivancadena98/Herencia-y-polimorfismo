import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Rombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rombo extends Figura
{
    private float DMayor;
    private float DMenor;
    
    public Rombo(float dM,float dm)
    {
        super(x,y);
        DMayor=dM;
        DMenor=dm;
    }
    
    public void dibuja(Graphics g)
    {

        Graphics2D g2= (Graphics2D)g;
        //C]omo se dibuja un rombo :(?
    }
}
