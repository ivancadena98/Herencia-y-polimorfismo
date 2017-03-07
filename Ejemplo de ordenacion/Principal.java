import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
   public static void main(String [] args)
   {
       ArrayList<Alumno> alumnos;
       alumnos= new ArrayList<Alumno>();
       
       alumnos.add(new Alumno(150));
       alumnos.add(new Alumno(100));
       alumnos.add(new Alumno(120));
       alumnos.add(new Alumno(40));
       alumnos.add(new Alumno(350));
       //Transformar el ArrayList en arreglo
       
       Alumno[]arrAlumno=new Alumno [alumnos.size()];
       arrAlumno= alumnos.toArray(arrAlumno);
       Arrays.sort(arrAlumno);
       System.out.println("Contenido del arreglo" ); 
       for(Alumno al :  arrAlumno)
        System.out.println(al);  
        
       System.out.println("Contenido del ArrayList " ); 
       for(Alumno al :  alumnos)
        System.out.println(al);  
    }
}
