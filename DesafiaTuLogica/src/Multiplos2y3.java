public class Multiplos2y3 {

public static void main(String[] args) {
		
	int cuenta = 0, multiplo2 = 0, multiplo3 = 0;
	
	System.out.println ("Números que son múltiplos de 2 y 3");
	
		for (int contador=1; contador<=100; contador++) {
			
			if (contador % 2 == 0) {
				
				multiplo2 = contador;
				
				System.out.print (multiplo2 + " ");
				
				cuenta++;
				
			}	else if (contador % 3 == 0) {
			
				multiplo3 = contador;
				
				System.out.print (multiplo3 + " ");
				
				cuenta++;
			}
		}
	
			System.out.println();
			System.out.print("Cantidad de múltiplos de 2 y 3 = " + cuenta);
	
	
		
		
	}
}