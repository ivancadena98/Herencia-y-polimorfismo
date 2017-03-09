import java.util.ArrayList;
/**
 * Write a description of class Texto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Texto extends Publicacion
{
    private String textoMensaje;
    
    ArrayList<Texto> r;
    public Texto(String tm,String N,String M,String C,int L,int H)
    {   super(N,M,C,L,H);
        textoMensaje=tm;
        r=new ArrayList<Texto>();
    }
    
   
    public void agregarComentario(String j)
    {
       // r.add();
    }
    @Override
    public void MostrarP()
    {
        int aux=0;
        System.out.println("Nombre "/*+super(N)*/+ "Texto  "+textoMensaje);
        System.out.println("Marca ")/*+super(M)*/;
        System.out.println("Hora "+aux+ "Likes "/*+super(L)*/);
        
    }
}
