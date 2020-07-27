package alum;

public class Alumno {
	
	//ATRIBUTOS
	 int id;
	 String nombres, apellido;
	 
	//CREANDO METODO CONSTRUCTOR
	 Alumno (int id,String nombres,String apellido){
		 //INICIALIZAMOS LOS ATRIBUTOS
		 this.id=id;
		 this.nombres=nombres;
		 this.apellido=apellido;
		 }
	public void verDatos() {
		 System.out.println("su id:"+id);
		 System.out.println("su nombre:"+nombres);
		 System.out.println("su apellido es :"+apellido);
	 }
	
       // creando metodos get and set
	 public int getId()         {
		 return id;
	     }
	public String getNombre()   {
		return nombres;
	     }
	public String getApellido() {
		return apellido;
	    }
	public void setId(int id) {
		this.id=id;
	    }
	public void setNombres(String nombres) {
		this.nombres=nombres;
	}
	public void setApellido(String Apellido) {
		this.apellido=apellido;
	}
	

	public String toString() {
		String mensaje = "Los datos ingresados son : \n id:" +id+" \n nombres:" +nombres+ "\n Apellidos"+apellido;
		return mensaje;}
	}
	
	
	
	

