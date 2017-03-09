import java.util.ArrayList;
/**
 * Write a description of class Almacenamiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Almacenamiento
{
    ArrayList<Publicacion>P;
    
    public Almacenamiento()
    {
        P=new ArrayList<Publicacion>();
    }
    
    public void AgregarPub(Publicacion p)
    {
        P.add(p);
    }
    
    public void BuscarPub(String x)
    {
        for(int i=0;i<P.size();i++)
    {
            //if((P.get(i)).Nom == x)
        {       //(P.get(i)).MostrarP;
                break;
        }
    }

    }
    
    public void EliminarPub(String x)
    {
        for(int i=0;i<P.size();i++)
    {
            //if((P.get(i)).Nom == x)
        {       P.remove(i);
                break;
        }
    }

    }
}
