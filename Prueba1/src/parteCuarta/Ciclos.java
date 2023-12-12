package parteCuarta;

public class Ciclos {

	public static void main(String args[]) {

		/**
		 * CICLO WHILE
		 */

		var contador = 0;

		while (contador < 3) {
			System.out.println("contador =" + contador);
			contador++;

		}
		System.out.println("=========================================================");

		/**
		 * CICLO DO-WHILE
		 */

		var contador1 = 0;

		do {
			System.out.println("contador1 =" + contador1);
			contador1++;

		} while (contador1 < 3);
		System.out.println("=========================================================");
		
		/**
		 * CICLO FOR
		 */

		for (var contador2 = 0; contador2 < 3; contador2++) {
			System.out.println("contador2= " + contador2);
		}
		System.out.println("=========================================================");
		/**
		 * CICLO CONTINUE
		 */
       
		for (var contador3 = 0; contador3 < 3; contador3++) {
			if( contador3 % 2 != 0) {
				continue;  // ir a la siguiente iteracion
			}
			System.out.println("contador3= " + contador3);
		}
		System.out.println("=========================================================");
		/**
		 * CICLO CONTINUE // ETIQUETAS
		 */
        inicio: 
		for (var contador4 = 0; contador4 < 3; contador4++) {
			if( contador4 % 2 != 0) {
				continue inicio;  // ir a la linea de codigo de la etiqueta
			}
			System.out.println("contador3= " + contador4);
		}
	}
}
