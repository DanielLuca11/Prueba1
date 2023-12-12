package parteSegunda;

import java.util.Scanner;

public class operadores {
	
	 public static void main(String[] args) {
		   
	
		 int a=3, b=2;
		 
		 var resultado = a+b ;
		 
		 System.out.println("Resultado suma es : " + resultado);
		 
         resultado = a-b ;
		 
		 System.out.println("Resultado resta es : " + resultado);

		 
		 resultado = a*b ;
		 
		 System.out.println("Resultado multiplicacion es : " + resultado);

		 var resultado2 = 3.0/b ;// ,modificamos a una variable flotante double 
		 
		 System.out.println("Resultado division es : " + resultado2);
		 
		 resultado = a%b;
		 
		 System.out.println("Resultado modulo = " + resultado );
	 
	     if ( b % 2 == 0)
	    	 System.out.println("es numero par");
	     
	     else
	    	 System.out.println("es numero impar");
	 
	 }
	}