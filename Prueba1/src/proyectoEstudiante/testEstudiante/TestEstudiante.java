package proyectoEstudiante.testEstudiante;

import proyectoEstudiante.Estudiante;

public class TestEstudiante {
	
	public static void main (String[] args) {
		
		Estudiante estudiante1 = new Estudiante ("Alejandro","Taboada",25,16153,5);
		Estudiante estudiante2 = new Estudiante ("Luca","Chicharron",9,1912,8);
		Estudiante estudiante3 = new Estudiante ("Raul","Lorzita",12,1804,7);
		
		estudiante1.mostrarDatos();
		System.out.println("========================================");
		estudiante2.mostrarDatos();
		System.out.println("========================================");
		estudiante3.mostrarDatos();
		System.out.println("========================================");
		
	}

}
