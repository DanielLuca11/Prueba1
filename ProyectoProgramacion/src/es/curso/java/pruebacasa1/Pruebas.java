package es.curso.java.pruebacasa1;

public class Pruebas {
	
	public static void main (String [] args) {
		
		Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2=new Empleados("Ana");
		Empleados trabajador3=new Empleados("Antonio");
		Empleados trabajador4=new Empleados("Luca");
		Empleados trabajador5=new Empleados("Raul");
		
		
		
		trabajador1.cambiaSeccion("RRHH");
		trabajador4.cambiaSeccion("Razonex");
		trabajador5.cambiaSeccion("Memorex");
	//	trabajador1.cambiaNombre("Maria"); // se pone como mensaje para probar la palabra final 
		
		
		System.out.println(trabajador1.devuelveDatos()+"\n"+ trabajador2.devuelveDatos()+"\n"+ 
		trabajador3.devuelveDatos()+"\n"+ trabajador4.devuelveDatos()+"\n"+ trabajador5.devuelveDatos());
		
		System.out.println(Empleados.dameISiguiente());// se llama primero la clase y luego te da el metodo static
		
	}
	
}

class Empleados {
	
	public Empleados (String nom) {
		
		nombre=nom;
		seccion="administracion";
		Id=IdSiguiente;
		IdSiguiente++;
		
		
		
	}
	
	// metodo setter  da valor a una varibale
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;	
	}
	
	//metodo setter que con la varibale "final" no se usa .
	
	//public void cambiaNombre(String nombre) {
		
    //		this.nombre=nombre;
	
	//metodo getter 
	
	public String devuelveDatos () {
		
		return "El nombre es :" + nombre + " la seccion es " + seccion +" y el Id=" + Id;
		
	}
	
	// se agrega la palabra final ,para no cambiar la variable nombre
	
	public static String dameISiguiente() {
		
		return "El IdSigueinte es :" + IdSiguiente;
	}
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente =1;
	
	
		
		
		
	}

