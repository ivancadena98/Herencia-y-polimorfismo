
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura
{
    protected float area;
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
}
