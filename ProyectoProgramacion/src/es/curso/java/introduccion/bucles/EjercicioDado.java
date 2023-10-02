package es.curso.java.introduccion.bucles;

public class EjercicioDado {

	/*
	 * Tirar un dado ,y en un numero determinado de veces,parar cuando salga 6
	 * y para el contador general salga 3 veces 6 seguidos 
	 */

	public static void main(String[] args) {

		int contador = 0;
		int contadorGeneral = 0;
		int dado = 0;

		do {
			System.out.println(" Tiramos el dado y   ..");
			dado = (int) (Math.random() * 6) + 1;
			// System.out.println("");
			System.out.println("Ha salido el...... " + dado);
			System.out.println("");
			System.out.println("");

			if (dado== 6) {
				contador++;
				} else {
				contador = 0;
			}
			contadorGeneral++;
			
			if (contador == 3) {
				break;
			}

		} while (true);
		System.out.println("fin,se ha necesitado"+ " " + contadorGeneral + " " + "tiradas");
	}
}
