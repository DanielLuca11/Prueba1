package parteSegunda;

public class operadorTernario {
	
	public static void main(String[] args) {
		
	var resultado = (1 > 2) ? "verdadero" : "falso ";
	System.out.println("resultado = " + resultado);
	
	var numero = 8;
	resultado = (numero % 2 == 0) ? "numero par" : "numero impar ";
	System.out.println("resultado = " + resultado);
	
	
	// Precedencia de operadores 
	
	var x = 5;
	var y = 10;
	var z = ++x + y--;
	System.out.println("x = "+ x);
	System.out.println("y = "+ y);
	System.out.println("z = "+ z);
	
	var resultado2 = 4 + 5 * 6 / 3; // 4 + ((5*6)/3)
	System.out.println("resultado = " + resultado2); // igual a 14 
	
	
	resultado2= (4+5)*6/3;
	System.out.println("resultado = " + resultado2); // igual a 18
	
	}

}
