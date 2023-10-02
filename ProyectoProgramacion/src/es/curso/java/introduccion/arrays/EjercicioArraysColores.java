package es.curso.java.introduccion.arrays;

import java.util.Scanner;

public class EjercicioArraysColores {
	
	// Preguntar cuantos colores se quieren guardar .ejemplo 3 
	
	//Introduce el nombre del color 1
	//Guardamos todos los colores
	//Mostramos todos los colores 
	//Mostrmaos todos los colores que contengan"o" y empiecen por "a".
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Cuantos colores quieres guardar ...");
			Scanner scan = new Scanner(System.in);
			int numcolores = scan.nextInt();
			
			String []colores  = new String[numcolores];
			
			for (int i = 0; i < colores.length; i++) {
			
				System.out.println("Introduce color.." +(i+1));
				scan = new Scanner(System.in);
				colores[i] = scan.nextLine().trim();
			}	
//			for (int i = 0; i < colores.length; i++) {
//				System.out.println("Tus colores son..."+(colores[i]));
//				}
			
			// BUCLE FOR-EACH
			// Mostramos todos los colores 
			
			for ( String color : colores) {
				System.out.println(color);
			}
			for ( String color : colores) {
                if (color.contains("o")&& color.toLowerCase().charAt(0)=='a') {
                	//color.contains("o")&& color.toLowerCase().startsWith("a"))
                	{
                	System.out.println(color);
                }
			
                }}}}
