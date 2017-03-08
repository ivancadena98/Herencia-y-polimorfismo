
/**
 * Write a description of class EmpleadoHraComision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoHraComision extends Nomina
{
    private int ventas;
    private int comision;
    private int salario;
    
    public EmpleadoHraComision(int v,int c,int s)
    {
        
        ventas=v;
        comision=c;
        salario=s;
    }
    
    public int calcularIngreso()
    {
        int aux=0;
        aux=(ventas*comision)+salario;
        return aux;
    }
}
