package parteSegunda;

public class operadoresUnarios {
	
	 public static void main(String[] args) {
		   
		 
		 var a = 3;
		 var b = -a;
		 System.out.println("a = "+ a);
		 System.out.println("b = "+ b);
		 
		 // unarios de afirmacion o negacion 
		 
		 var c = true;
		 var d = !c;
		 System.out.println("c = "+ c);
		 System.out.println("d = "+ d);
		 
         // unarios de incremento 
		 
		 
		 // preincremento
		 var e = 3;
		 var f = ++e; // primero se incrementa la variable y despues se usa su valor
		 System.out.println("e = "+ e);
		 System.out.println("f = "+ f);
		
		 
		 //postincremento
		 var g = 5;
		 var h = g++; // primero se utiliza el valor y despues se incrementa
		 System.out.println("g = "+ g);
		 System.out.println("h = "+ h);		 
		 
	
         // unarios de decremento 
		 
		 
		 // preincremento
		 var i = 2;
		 var j = --i; // primero se incrementa la variable y despues se usa su valor
		 System.out.println("i = "+ i);
		 System.out.println("j = "+ j);
		
		 
		 //postincremento
		 var k = 4;
		 var l = k--; // primero se utiliza el valor y despues se incrementa
		 System.out.println("k = "+ k);
		 System.out.println("l = "+ l);		 
		 
	 }
}
