import java.util.ArrayList;
/**
 * Write a description of class Foto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Foto extends Publicacion
{
    private String nombreArch;
    private String tituloFoto;
    ArrayList<Foto> y;
    public Foto(String nA,String Ti,String N,String M,String C,int L,int H)
    {
        super(N,M,C,L,H);
        nombreArch=nA;
        tituloFoto=Ti;
        y= new ArrayList<Foto>();
    }
    
    public void agregarComentario(String j)
    {
        //y.add(j);
    }
    @Override
    public void MostrarP()
    {
        int aux=0;
        System.out.println("Nombre "/*+super(N)*/+ "Titulo de foto "+tituloFoto);
        System.out.println("Marca "/*+super(M)*/+ "Nombre de Archivo "+nombreArch);
        System.out.println("Hora "+aux+ "Likes "/*+super(L)*/);
        
    }
}
