import javax.swing.JFrame;
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ventana extends JFrame
{
    private Lienzo dibujo;
    public Ventana(int A,int An)
    {
        this.setSize(A,An);
        dibujo=new Lienzo();
        this.add(dibujo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}