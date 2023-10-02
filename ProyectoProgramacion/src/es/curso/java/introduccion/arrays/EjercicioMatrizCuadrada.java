package es.curso.java.introduccion.arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class EjercicioMatrizCuadrada {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("introduce base ");
        int numFilas = sc.nextInt();
        

        // Crear el tamaño especificado
        int[][] cuadrado = new int[numFilas][numFilas];
       
            	
            	for (int i = 0; i < cuadrado.length; i++) {
                    for (int j = 0; j < cuadrado[i].length; j++) {
                        
                        
//                        scan = new Scanner(System.in);
//                        
//                        System.out.println("insert ");
//                        
//                     cuadrado[fila][columna]= sc.nextInt();
//                     
//                 	for ( String [] bingo : cuadrado) {
//                 		
//                 			System.out.println(cuadrado);
//                 	}
////Creamos matriz cuadrada 
//		
////		Pedir numero de filas que va a tener 3
////		Pedir todos los nuemeros para rellenar la matriz indicando la posicion
////		
////		pintar los datos de la matriz 
////		
////		123
////		456
////		789
////		
////		array unidimensional con los datos de la diagonal (izquierda > derecha )de la matriz .pintar los datos del Array .
////		
////		invertir diagonal.
//	
//	}
//
//}
//	}
//}
