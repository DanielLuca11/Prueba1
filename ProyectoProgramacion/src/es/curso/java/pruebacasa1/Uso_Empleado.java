package es.curso.java.pruebacasa1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado[] misEmpleados=new Empleado[5];
		
		misEmpleados[0]=new Empleado("Paco Gomez ", 85000, 1990, 12 , 17);
		misEmpleados[1]=new Empleado("Ada Gonzales ", 95000, 1995, 06 , 02);
		misEmpleados[2]=new Empleado("Raul Cabanillas ", 12000, 2011, 04 , 18);
		misEmpleados[3]=new Empleado("Luca Cabanillas ", 9000, 2014, 12 , 19);
		misEmpleados[4]=new Empleado(" Alcaponne ");
		
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre:"+e.dameNombre()+
					"Sueldo: " + e.dameSueldo()+"Fecha alta : " + e.dameFechaContrato());
			
		}
	}

}

 class Empleado {
	 
	 public Empleado (String nom, double sue , int agno, int mes , int dia) {
		 
		 nombre=nom;
		 sueldo=sue;
		 
		 GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		 altaContrato=calendario.getTime();
		 
	 }
	 
	 public Empleado(String nom) {// esto es una sobrecarga de constructores
		 
		 this(nom, 18123,2023,01,01); // se usa solo para cambiar el nom y lo demas es fijo para todos los nuevos datos 
		 
	 }
	 
	 public String dameNombre() {  // getter devuelve dato
		 
		 return nombre;
		 
	 }
     public double dameSueldo() {  //  getter devuelve dato 
		 
		 return sueldo;
		 
	 }
     public Date dameFechaContrato() {// getter devuelve dato
		 
		 return altaContrato;
		 
	 }
     public void subeSueldo(double porcentaje) {  // setter modifica dato
		 
     double aumento=sueldo*porcentaje/100;
     
     sueldo+=aumento;
     
	 }
		 
	 private String nombre;
	 private double sueldo;
	 private Date altaContrato;
	 
		
 }