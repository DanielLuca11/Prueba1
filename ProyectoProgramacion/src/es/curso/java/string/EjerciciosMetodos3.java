package es.curso.java.string;

import java.util.Scanner;

public class EjerciciosMetodos3 {

	public static void main(String[] args) {
		System.out.println("introduce velocidad ");
		Scanner scan = new Scanner(System.in);
		double espacio = scan.nextDouble();
		scan = new Scanner(System.in);
		int tiempo = scan.nextInt();
			
		calculaVelocidad(espacio , tiempo);
		int numeroResultado= calculaVelocidad(10,5);
		System.out.println(numeroResultado);
		
		int resultado2 = numeroResultado*3;
	}
	    
		public static int calculaVelocidad(double distancia, int tiempo) {
			int var = 0;
			System.out.println("Velocidad: "+distancia/tiempo);
			return var;
			
		}
	}