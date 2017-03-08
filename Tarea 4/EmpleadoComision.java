
/**
 * Write a description of class EmpleadoComision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoComision extends Nomina
{
    private int ventas;
    private int comision;
    
    public EmpleadoComision(int v,int c)
    {
        ventas=v;
        comision=c;
    }
    
    public int calcularIngreso()
    {
        int aux=0;
        aux=ventas*comision;
        return aux;
    }
}
