package herencia.test;

import java.util.Date;

import herencia.Cliente;
import herencia.Empleado;

public class TestHerencia {
	
	public static void main (String [] args) {
		
		Empleado empleado1 = new Empleado("Juan",50.000) ;
		System.out.println("empleado1 = " + empleado1);
		
		System.out.println("=====================================================");
	
	Cliente cliente1 = new Cliente(new Date(),true,"Karla",'F',28,"Saturno 15");
	Cliente cliente2 = new Cliente(new Date(),true,"Luca",'M',10,"Negrin 1");
	
	
		System.out.println("cliente1 =" + cliente1);
		System.out.println("cliente2 =" + cliente2);
		System.out.println("=====================================================");
		
	}

}
