package es.curso.java.introduccion.bucles;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		System.out.println("Multiplicamos por ...");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		//tabla del numero indicado 
		
		for (int i = 0; i <= 10; i++) {
			System.out.println( numero + "*" + i + "=" + ( numero*i));
		}
		
		for (int j = 0; j <= 10; j++) {
			System.out.println( numero + "*" + j + "=" + ( numero*j));
		}
		
			 
		}
	}






