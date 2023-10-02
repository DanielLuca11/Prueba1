package es.curso.java.poo1;

public class Alumno {
	
	//Variables de instancia
		String dni;
		String nombre;
		String apellido;
		Double nota;
		
    //Constructores
		
		public Alumno() {
			
		}	
	    public Alumno(String dni, String nombre,String apellido) {
				this.dni = dni;
				this.nombre = nombre;
				this.apellido = apellido;
	    }
		public Alumno(String dni, String nombre,String apellido,double nota) {
					this.dni = dni;
					this.nombre = nombre;
					this.apellido = apellido;
					this.nota = nota;
			
		}
		
		//metodos
		public void estudiar(String()) {
			
		
			System.out.println("2l alumno");
			if (estudiar == 0) {
	           String mensaje = "El alumno no ha estudiado";
	        } else if (estudiar >0 && estudiar <5) {
	           String mensaje = "El alumno ha estudiado poco ";
	        } else if (estudiar >=5 && estudiar <9) {
		       String mensaje = "Has estudiado mucho "; 
	        } else if (estudiar >=10) {
			       String mensaje = "Has estudiado mucho "; 
	        } else {
	           String mensaje = "Reprobado";
	        }
			
			
}
}
//		metodo
//		+ estudiar()
//			0 ->	el alumno nombre no ha estudiado nada
//			<5 ha estudiado poco
//			5-9 ha estudiado mucho
//			10 	Es un genio  

		
