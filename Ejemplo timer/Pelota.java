import java.awt.Graphics;
/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota
{
    private int x;
    private int y;
    private int r;
    
    public Pelota(int X,int Y,int R)
    {
        x=X;
        y=Y;
        r=R;
    }
    
    public void dibujate(Graphics g)
    {
        g.drawOval(x,y,r*2,r*2);
    }
}
