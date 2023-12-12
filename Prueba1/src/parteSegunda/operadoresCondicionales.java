package parteSegunda;

public class operadoresCondicionales {
	
	public static void main(String[] args) {
	
	var a = 12;
	var valorMinimo = 0;
	var valorMaximo = 10;
	
	
	var resultado = a >=  0 && a <= 10 ;
	
	System.out.println(resultado);
	if(resultado) {
		
		System.out.println("Dentro de rango");
	}
	else {
	   System.out.println("fuera de rango");
			
	}
	
	var vacaciones = true ;
	var diaDescanso = false;
	
	if(vacaciones || diaDescanso) {
		System.out.println("Padre puede asistir al juego de su hijo ");
	}
	else {
	   System.out.println("El padre esta ocupado ");
			
	}
	
	
	}
}
