import java.util.ArrayList;
/**
 * Write a description of class Planeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planeta
{
    ArrayList<Pais>coleccionPais=new ArrayList<Pais>();
    public void agregarPais(Pais P)
    {
        coleccionPais.add(P);
    }
    
    public int promedioHabitantes()
    {
        int aux=0;
        float aux2=0;
        for(int i=0; i<coleccionPais.size();i++)
        {
            aux=coleccionPais.get(i).accedeH+aux;
        }
         aux2=aux/coleccionPais.size();
        return aux2;
       }
}

