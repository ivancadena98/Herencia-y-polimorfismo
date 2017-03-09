/**
 * Abstract class Publicacion - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Publicacion
{
   private String Nombre;
   private String Marca;
   private int Likes;
   private int Hora;
   private String Comentario;
   
   public Publicacion(String N,String M,String C,int L,int H)
   {
       Nombre=N;
       Marca=M;
       Likes=L;
       Hora=H;
       Comentario=C;
    }
    
    abstract public void MostrarP();
    
    
    public String Nom()
    {return Nombre;}
}
