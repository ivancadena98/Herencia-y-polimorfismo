import java.awt.Graphics;
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Figura
{
    //protected float area;
    private int x;
    private int y;
    public abstract void dibuja(Graphics g);
    
    public void Figura(int a,int b)
    {
        x=a;
        y=b;
    }
   /* 
    public void figura()
    {
        area=0;
    }
    
    public float accedeArea()
    {
        return area;
    }
    
    public void calculaArea()
    {
        System.out.println("Chale");
    }
    
    public String dimeInfo()
    {
        return "" + area;
    }
    
    @Override
    public String toString()
    { return "" + area;}
    
    public abstract void dibuja(Graphics g);
    /*@Override
    public boolean equals(Object obj)
    {
        return this.area == ((Figura)obj).area;

        
    }*/
}
