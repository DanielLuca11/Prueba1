package es.curso.java.introduccion.bucles;

import java.util.Scanner;

public class EjercicioVelocidad {

	public static void main(String[] args) {

		System.out.println("Introduce el numero de coches");
		Scanner scan = new Scanner(System.in);

		int numcoches = scan.nextInt();

		int velocidadMinima = 400;

		for (int i= 0; i<numcoches; i++){

			System.out.println("Introduce la velocidad del coche" + i);
			scan = new Scanner(System.in);
			int velocidadcoche = scan.nextInt();

			if (velocidadcoche<velocidadMinima) {
				velocidadMinima = velocidadcoche;
			}
			
		}

		System.out.println("La velocidad minima" + velocidadMinima);

	}
}
