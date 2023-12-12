package partePrimera;

public class caracteresEspeciales {

	public static void main (String args[]) {
		
		var nombre = "Karla" ;
		
		System.out.println("Nueva linea:  \n" + nombre);
		System.out.println("Nueva linea:  \t" + nombre); // Genera dos lineas una debajo del otra
		System.out.println("Retroceso:   \b\b\b" + nombre);// retrocedo variables vacias
		System.out.println("Comilla simple \'" + nombre+ "\'"); // Resalta el nombre con una variable
		System.out.println("Comilla doble \"" + nombre+ "\""); // Resalta el nombre con dos comillas .
	}
	
}
