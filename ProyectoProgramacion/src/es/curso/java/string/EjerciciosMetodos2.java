package es.curso.java.string;

import java.util.Scanner;

public class EjerciciosMetodos2 {
	    
	    public static void calcular(int numerotabla) {
	        for (int i = 0; i <= 10; i++) {
	            System.out.println(numerotabla + " * " + i + " = " + (numerotabla * i));
	        }
	    }
	    
	    public static void main(String[] args) {
	        System.out.println("Introduce un número: ");
	        Scanner scan = new Scanner(System.in);
	        int numerotabla = scan.nextInt();
	        
	        calcular(numerotabla);
	    }
	}


