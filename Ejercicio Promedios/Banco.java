import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
   private ArrayList<CuentaBancaria> coleccion;
   public Banco()
   {
       coleccion= new ArrayList<CuentaBancaria>();
    }
   
    public void agregarCuenta(CuentaBancaria CB)
    {
        coleccion.add(CB);
    }
    
    public float calcularSaldo()
    {
        int aux=0;
        float aux2=0;
        for(int i=0; i<coleccion.size();i++)
        {
            aux=(coleccion.get(i)).accedeSaldo()+aux;
        }
         aux2=aux/coleccion.size();
        return (aux2);
       }
       
    }
