package sobrecarga.test;

import sobrecarga.Operaciones;

public class TestOperaciones {
	
	public static void main(String[] args) {
		
		var resultado = Operaciones.sumar(5, 3);
		System.out.println("resultado = " + resultado);
		
		System.out.println("===========================================================");
		
		var resultado2 = Operaciones.sumar(2.0, 3);
		System.out.println("resultado2 = " + resultado2);
		
		System.out.println("===========================================================");
		
		var resultado3 = Operaciones.sumar(3, 5L);
		System.out.println("resultado3 = " + resultado3);
	}

}
