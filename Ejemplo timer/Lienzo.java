



/*import javax.swing.JPanel;
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
            this.repaint();
        }
    }
    @Override
    public void paintComponent(Graphics g)
    {
        pelota.dibujate(g);
    }
}*/

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.awt.Rectangle;
public class Lienzo extends JPanel // implements KeyListener
{
    private LinkedList<Pelota> pelotas;
    
    public Lienzo()
    {
        pelotas= new LinkedList<Pelota>();
        pelotas.add(new Pelota(100, 100, 10));
        EscuchadorRaton escucha=new EscuchadorRaton();
        this.addMouseListener(escucha);
    }
    
    public void actua()
    {
        Rectangle r=this.getBounds();
         for(Pelota p : pelotas){
        p.muevete(this.getBounds());
    }    
    this.repaint();
     }
    
    class EscuchadorRaton extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent M)
        {
            int temRandom= 10 + (int)(Math.random()* 20);
            System.out.println(M.getX() + " , " + M.getY());
            Pelota pelotaNueva=new Pelota(M.getX(),M.getY(),temRandom);
            pelotas.add(pelotaNueva);
        }
    }
    @Override
    public void paintComponent(Graphics g)
    {
        //Borra panel al dibujars las diferentes pelotas en una posicion nueva
        super.paintComponent(g);
        for(Pelota p : pelotas){
        p.dibujate(g);
    }
    }
}
