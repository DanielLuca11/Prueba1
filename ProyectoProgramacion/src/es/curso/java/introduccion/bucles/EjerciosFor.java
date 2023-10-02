package es.curso.java.introduccion.bucles;

import java.util.Scanner;

/* Ejercicios notas */


public class EjerciosFor {

	public static void main(String[] args) {

		System.out.println("Introduce el numero de alumnos");
		Scanner scan = new Scanner(System.in);

		int numAlumnos = scan.nextInt();
		
		double notas = 0;
		
		for (int num = 1; num <=numAlumnos; num++) {
		
			System.out.println("Introduce nota del alumno" + num);
			scan = new Scanner(System.in);
			notas+= scan.nextDouble();	
		}	
		
		System.out.println("total de notas" + notas);
		System.out.println("la media de todos los alumnos es ."+ notas/numAlumnos);
		

		}
	}


