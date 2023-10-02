package es.curso.java.introduccion.arrays;

import java.util.Scanner;

public class EjercicioArraysAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] alumnoNotas = {"Alumno1:9","Alumno2:8","Alumno3:3","Alumno4:4","Alumno5:5","Alumno6:10","Alumno7:4"};
		
		int contador=0;
		for (int i = 0; i < alumnoNotas.length; i++) {
        String dato = alumnoNotas[i];
     
       int posicionDosPuntos = dato.indexOf(":");
       String nombre = dato.substring(0,posicionDosPuntos);
       String notasStr = dato.substring(posicionDosPuntos+1);
       System.out.println("Nombre: "+nombre+" su nota es .."+notasStr);
     //  System.out.println("Nota: "+notasStr);
       
       int nota = Integer.parseInt(notasStr);
       
		if (nota>=5) {
			contador++;
			
		}
		
		
       String[]alumnosAprobados = new String[contador] ;
       
    		  
     
      
        
{
          
        }
		}


	}
}
	
	

//double[] notas = {7.5, 6.0, 4.5, 8.0, 5.5};
//
//System.out.println("Notas de los alumnos aprobados:");
//
//// Iterar sobre el array de notas
//for (int i = 0; i < notas.length; i++) {
//    // Verificar si la nota es mayor a 5
//    if (notas[i] > 5.0) {
//        System.out.println("Alumno " + (i + 1) + ": " + notas[i]);