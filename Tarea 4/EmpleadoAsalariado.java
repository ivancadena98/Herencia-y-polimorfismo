
/**
 * Write a description of class EmpleadoAsalariado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmpleadoAsalariado extends Nomina
{
    private int salario;
    
    public EmpleadoAsalariado(int c)
    {
        salario=c;
    }
    
    public int calcularIngreso()
    {
        int aux=0;
        aux=salario;
        return aux;
    }
}
