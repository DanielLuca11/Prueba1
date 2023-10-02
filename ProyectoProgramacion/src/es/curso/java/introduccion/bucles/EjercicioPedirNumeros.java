package es.curso.java.introduccion.bucles;

import java.util.Scanner;

public class EjercicioPedirNumeros {

	public static void main(String[] args) {


		System.out.println("Introduce 10 Numeros");
		Scanner scan = new Scanner(System.in);

		int numeros = 0;
		int contador1 = 0;
		int contador2 = 0;
		

		for (int num = 0; num < 6; num++) {
			System.out.println("Introducir numeros");
			int numeros1 = scan.nextInt();

			if (numeros1 % 3 == 0) {

				contador1 += 1;
			}
			if (numeros1 % 5 == 0) {

				contador2+= 1;
			}

		}
		System.out.println("Existen multi de 3 -->" + contador1+" multis");
		System.out.println("Existen multi de 5 -->" + contador2+" multis");
	}
}
