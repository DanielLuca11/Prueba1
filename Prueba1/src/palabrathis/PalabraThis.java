package palabrathis;

public class PalabraThis {
	
	public static void main(String args[]) {
		Persona persona = new Persona("Juan" ,"Perez");
		System.out.println("persona = " + persona);
		System.out.println("persona = " + persona.nombre);
		System.out.println("persona = " + persona.apellido);
	}

}
 
 	class Persona{
 		
 		String nombre ;
 		String apellido ;
 		
 		Persona(String nombre, String apellido){
 			this.nombre = nombre;
 			this.apellido = apellido;
 			
 			System.out.println("objeto persona usando this: " + this);
 		/**
 		 * Imprime la reserva de la memoria y genera el constructor vacio de object	
 		 */
 			new Imprimir().imprimir(this);
 		}
 	}
 	class Imprimir{
 		public void imprimir (Persona persona){
 			
 			System.out.println("persona desde imprimir: " + persona);
 			System.out.println("Impresion del objeto actual(this): " + this);
 			
 		}
 		
 	}
 	
 	