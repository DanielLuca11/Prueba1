package parteSegunda;

public class operadoresIgualdad {
	
	public static void main(String[] args) {
		
	var a = 3;
	var b = 2;
	
	var c = (a == b);
	System.out.println("c ="+ c);
	
	var d = (a!= b);
	System.out.println("d ="+ d);
	
    var cadena = "hola";
    var cadena2 = "hola";
    
    var e = cadena == cadena2 ; // compara referencias de objetos
    System.out.println("e =" + e); 
    
    var f = cadena.equals(cadena2);// Aqui si igualamos contenido 
    System.out.println("f =" + f);
		
    
    var g = a>b;
    var h = a>b;
    System.out.println("g = " + g +"  \n" + h);
    
		
	}

}
