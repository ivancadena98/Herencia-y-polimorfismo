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
    {
        radio=r;
    }
    
    
    public void calculaAreaCi()
    {
        area=(float)3.1416*(float)Math.pow(radio,2);
    }
}