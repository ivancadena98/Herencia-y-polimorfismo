import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer
;
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
    private Pelota pelota;
    
    public Lienzo()
    {
        pelota=new Pelota(100,100,40);
        EscuchadorTiempo escuchatime=new EscuchadorTiempo();
        Timer time= new Timer(1000,escuchatime);
        time.start();
    }
    
    class EscuchadorTiempo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Hola pelota, qué pex?, qué cuentas? ");
            /*pelota.muevete();
            this.repaint();*/
        }
    }
    @Override
    public void paintComponent(Graphics g)
    {
        pelota.dibujate(g);
    }
}
