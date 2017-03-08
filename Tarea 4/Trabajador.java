/**
 * Abstract class Trabajador - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Trabajador
{
    private String nombre;
    private int ventas;
    private float comision;
    private int hora;
    private int salario;
   public Trabajador(String n,int v,float c, int h,int s)
   {
       nombre=n;
       ventas=v;
       comision=c;
       hora=h;
       salario=s;
    }
}
