package es.curso.java.introduccion.arrays;

import java.util.Scanner;

public class ArraysNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Preguntar nombre del alumno y nota 
		//Indicar numero de notas a almacenar ,preguntar y guardar las notas 
		//sacar la media de todas las notas 
		//la nota maxima
		//la nota minima 
		//geenerar un nuevo arrays con las notas ordenadas de mayor a menor .Mostrar los valores guardados .
		
		
		System.out.println("Cuantos alumnos con nota tienes   ...");
		Scanner scan = new Scanner(System.in);
		int numalumnos  = scan.nextInt();
		
		String []alumnos  = new String[numalumnos];
		int numnotas = 0;
		String []notas  = new String[numnotas];
		
		for (int i = 0; i < alumnos.length; i++) {
		
			System.out.println("Introduce Alumno.." +(i+1));
			scan = new Scanner(System.in);
			alumnos[i] = scan.nextLine().trim();
		}	
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Tu nota es ..."+(alumnos[i]));
			}
		
		// BUCLE FOR-EACH
		// Mostramos todos los colores 
		
	//	for ( String color : colores) {
	//		System.out.println(color);
	//	}
	//	for ( String color : colores) {
    //        if (color.contains("o")&& color.toLowerCase().charAt(0)=='a') {
     //       	//color.contains("o")&& color.toLowerCase().startsWith("a"))
      //      	{
       //     	System.out.println(color);
            }
}
		
         
