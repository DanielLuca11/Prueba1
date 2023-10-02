package es.curso.java.introduccion.bucles;

import java.util.Scanner;

public class Ruleta {

	public static void main(String[] args) {

		String Rojo = "\33[31m";
		String Negro = "\33[30m";
		String Verde = "\33[32m";
		int opcion = 0;
		double importe = 1000;

		String respuesta = "";
		String menu = "1.Apuestas x un numero \n2. Apostar x Docena\n3. Apuesta par /impar\n4 Apuestra rojo/negro\n5 Dejar de jugar (importe)";

		System.out.println(menu);
		System.out.println("Selecciona una opcion");

		Scanner scan = new Scanner(System.in);
		opcion = scan.nextInt();

		do {

			if (opcion == 1);{
				

			System.out.println("Cuanto deseas apostar esta vez de los  " + importe + " €");
			Scanner scan1 = new Scanner(System.in);
			double importeapuesta = scan1.nextDouble();

			System.out.println("Por que numero deseas apostar 0 al 36");
			scan1 = new Scanner(System.in);
			int numeroApuesta = scan1.nextInt();

			// Generamos la bolita y tirada

			int tirada = (int) (Math.random() * 37 + 0);

			if (tirada == 0) {
				System.out.println(Verde + "El numero que ha salido es -->");
				System.out.println(tirada + " verde");
			}

			if (tirada > 0 && tirada < 19) {
				System.out.println(Negro + "El numero que ha salido es -->");
				System.out.println(tirada + " negros");
			}

			if (tirada > 19 && tirada < 37) {
				System.out.println(Rojo + "El numero que ha salido es -->");
				System.out.println(tirada + " rojos");
			}
			

			importe -= importeapuesta;

		}
		}
			while (importe > 0 && !respuesta.equalsIgnoreCase("No"));

		System.out.println("te has quedado con" + importe);

		if (opcion == 2);{
			System.out.println("a por el 2");
			
		}


	
		
}
}