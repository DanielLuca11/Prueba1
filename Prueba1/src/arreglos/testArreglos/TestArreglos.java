package arreglos.testArreglos;

public class TestArreglos {
	
	public static void main (String [] args) {
		
		/** 
		 * En este caso vemos la posicion de memoria .
		 */
		int edades [] = new int [3];
		System.out.println("edades = "+ edades);
		
		System.out.println("=========================================================");
        
		/** en este primer caso le damos una variable a la posicion 0 y 
		 * imprimer 10 .
		 */
		
		edades [0] = 10;
		System.out.println("edades 0 =  "+ edades[0]);
		
		System.out.println("=========================================================");
		
		//edades [3] = 10;
		//System.out.println("edades 3 =  "+ edades[3]);
		
		/** Nos da eror por estar 
		 * fuera de la posicion
	     */
		System.out.println("=========================================================");
		
		for(int i= 0; i< edades.length; i++) {
	    System.out.println("edades elemento =  \n"+ i+" : "+ edades[i]);
			
		}
		
	}

}
