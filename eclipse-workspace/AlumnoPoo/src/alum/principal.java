package alum;
import java.util.*;

public class principal {

	public static void main(String[] args) {
	   Scanner leer = new Scanner(System.in);
		
		
	//	Alumno alu1= new Alumno(1234, "Juanito", "Novita");
	    //    Alumno alu2= new Alumno(123, "Juan", "Rodado");
	     //   alu1.verDatos();
          //  alu2.verDatos();
    
    
            
            
            // LEER DATOS DESDE TECLADO
        	
        	System.out.println("ingrese id:");
        	int i=leer.nextInt();
        	
        	System.out.println("Ingrese Nombre");
        	String N=leer.next();
        	
        	System.out.println("ingrese Apellido:");
        	String A = leer.next();
        Alumno alu3= new Alumno(i, N,A);
       
              
    
    //llamando get
   System.out.println("Obteniedo el nombre del alumno:"+alu3.getNombre());
//cambiar nombre a usuario
    
   alu3.setNombres("jose");
  System.out.println("Obteniedo el nuevo nombre de juan :"+alu3.getNombre());
  
	    System.out.println(alu3.toString());
        
        
        
        
	}

}
