
/**
 * Write a description of class EmpleadoHra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoHra extends Nomina
{
    private int hora;
    private int salario;
    
    public EmpleadoHra(int v,int c)
    {
        hora=v;
        salario=c;
    }
    
    public int calcularIngreso()
    {
        int aux=0;
        int aux2=0;
        aux=hora*salario;
        if(hora>40)
        {aux2=hora-(int)40;
         aux2=aux2*(2*salario);
        }
        aux=aux2+aux;
        return aux;
    }
}
