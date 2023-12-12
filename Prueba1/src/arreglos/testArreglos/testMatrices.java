package arreglos.testArreglos;

import arreglos.Persona;

public class testMatrices {

	public static void main(String[] args) {

		/**
		 * Al crear esta matriz primero se crean los reglones luego las columnas
		 */
		int edades[][] = new int[3][2];
		System.out.println("edades 0=  " + edades);

		System.out.println("=========================================================");

		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;

		System.out.println("edades 0-0=  " + edades[0][0]);
		System.out.println("edades 0-1=  " + edades[0][1]);
		System.out.println("edades 1-0=  " + edades[1][0]);
		System.out.println("edades 1-1=  " + edades[1][1]);

		System.out.println("=========================================================");

		/**
		 * Haremos ahora un ciclo for anidado
		 */

		for (int ren = 0; ren < edades.length; ren++) {
			for (int col = 0; col < edades[ren].length; col++) {

				System.out.println("edades   " + ren + " - " + col + " : " + edades[ren][col]);
			}
		}

		System.out.println("=========================================================");

		String frutas[][] = { { "Naranja", "Limon" }, { "Fresa", "Zarzamora" } };
		for (int ren = 0; ren < frutas.length; ren++) {
			for (int col = 0; col < frutas[ren].length; col++) {

				System.out.println("frutas   " + ren + " - " + col + " : " + frutas[ren][col]);

			}
		}
		System.out.println("=========================================================");
		Persona personas [][] = new Persona[2][3];
		
		personas[0][0] = new Persona("Juan");
		personas[0][1] = new Persona("Luca");
		personas[0][2] = new Persona("Laura");
		personas[1][0] = new Persona("Raul");
		personas[1][1] = new Persona("Ada");
		personas[1][2] = new Persona("Lidia");
		imprimir(personas);
		
		
	}
	/**
	 * Imprimimos cualquier matriz de tipo object
	 * @param matriz
	 */

	public static void imprimir(Object matriz[][]) {
		for (int ren = 0; ren < matriz.length; ren++) {
			for (int col = 0; col < matriz[ren].length; col++) {

				System.out.println("matriz   " + ren + " - " + col + " : " + matriz[ren][col]);

	}
		
	}
}}