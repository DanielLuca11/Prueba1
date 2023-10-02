package es.curso.java.pruebacasa1;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Coche micoche1=new Coche();
		
		micoche1.establece_color("rojo");
		
       Furgoneta mifurgoneta1=new Furgoneta(7, 580);
       
       mifurgoneta1.configura_asientos("si");
       
       mifurgoneta1.configura_climatizador("si");
       
       System.out.println(micoche1.dime_datos_generales()+" "+micoche1.dime_color());
       
       System.out.println(mifurgoneta1.dime_datos_generales()+mifurgoneta1.dimeDatosFurgoneta());
       
       
       
       
		
	}

}
