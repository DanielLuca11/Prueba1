package matrices.testMatrices;

import arreglos.Persona;

public class TestArreglosObject {
	
	public static void main (String [] args) {
		
		/** Los arreglos y las colecciones se ven en plural
		 * 
		 */
		Persona personas[] = new Persona[2];
		
		personas[0] = new Persona("Juan");
		personas[1] = new Persona("Carlos");
		
		System.out.println("personas o = "+ personas[0]);
		System.out.println("personas 1 = "+ personas[1]);
		
		System.out.println("=========================================================");
		/**
		 * Si no esta configurado el metodo toString nos vuelca la posicion de memoria 
		 */
		for(int i= 0; i< personas.length; i++) {
		    System.out.println("personas =  \n"+ i+" = "+ personas[i]);
		System.out.println("=========================================================");		
  }
    /**
     * A estaparte se llama sintaxis resumida.
     */
 	String frutas[] = {"Naranaja","Platano","Uva"};
 	for(int i= 0; i< frutas.length; i++) {
	    System.out.println("frutas =  \n"+ i+" = "+ frutas[i]);
 	
	}
}
}
