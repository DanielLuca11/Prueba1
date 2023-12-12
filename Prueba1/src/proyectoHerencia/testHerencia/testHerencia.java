package proyectoHerencia.testHerencia;

import proyectoHerencia.Alumno1;

public class testHerencia {
	
	public static void main (String [] args) {
		
	Alumno1 alumno = new Alumno1  ("Ada","Gonzales","Negrin",45,2);
	Alumno1 alumno1 = new Alumno1 ("Raul","Chicharron","Negrin",12,3);
	Alumno1 alumno2 = new Alumno1 ("Luca","Lorzita","Negrin",10,4);
	Alumno1 alumno3 = new Alumno1 ("Daniel","Mente","Negrin",42,5);
	
	
	alumno.mostrarDatos();
	System.out.println("============================================");
	alumno1.mostrarDatos();
	System.out.println("============================================");
	alumno2.mostrarDatos();
	System.out.println("============================================");
	alumno3.mostrarDatos();
	
	}

}
