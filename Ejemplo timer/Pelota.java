/*import java.awt.Graphics;
/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 *
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
}*/

import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota
{
    private int posx;
    private int posy;
    private int radio;
    private int incx;
    private int incy;
    
    public Pelota(int x, int y, int r)  
    {
        posx = x;
        posy = y;
        radio = r;
        int a = (int)(Math.random()*2)-1;
        if(a==0){ a=-1;}
        incx = a*10;
        incy = 1*10;

    }
    
    public void dibujate(Graphics g)
    {
        g.drawOval(posx, posy, radio*2, radio*2);
    }
    
    public void muevete(Rectangle r)
    {
        posx += incx;
        posy += incy;
        if (posx > r.getWidth()-radio*2 || posx < radio*2)    {
            incx = -incx;
        }
        if (posy > r.getHeight()-radio*2 || posy < radio*2) {
            incy = -incy;
        }
    }
}