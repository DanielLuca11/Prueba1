package clases;

public class PruebaPersona {
	
	public static void main(String args[]) {
		
		/**
		 * Se crea un objeto de lado derecho reserva memoria 
		 * y esta referencia de memoria se asigna a persona1
		 * Se denomina crear una instancia de clase 
		 */
		
		Persona persona1 = new Persona() ;
		
		persona1.nombre = "Juan";
		persona1.apellido = "Perez";
		persona1.desplegarInformacion();
		System.out.println("=========================================================");
		Persona persona2 = new Persona() ;
		
		/**
		 * Asigna posicion de memoria a cada prueba de estas 
		 * persona1 : clases.Persona@cac736f
		 * persona2 : clases.Persona@5e265ba4
		 */
		System.out.println("persona1 : " + persona1);
		System.out.println("persona2 : " + persona2);
		
		System.out.println("=========================================================");
		/**
		 * Aqui se asignara valor null al no modificar los valores
		 * nombre : null
		 * apellido : null
		 * son valores por default 
		 */
		persona2.desplegarInformacion();
		System.out.println("=========================================================");
	
	    persona2.nombre = "Karla";
	    persona2.apellido = "Lara";
	    persona2.desplegarInformacion();
	    System.out.println("=========================================================");
	}

}
