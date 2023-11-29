import java.util.Scanner;

public class NumerosSucesivos {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=0, resultado, contador;
		
		boolean bandera = true;
		
		while (bandera) {
			
			System.out.println("Introduzca un número: ");
			
			numero = sc.nextInt();
			
			if (numero > 0) {
		
				bandera = false;
				
			}
			
		}	contador = 1;
			
			do {
				
				resultado = numero + contador;
				
				System.out.print(resultado + " ");
				
				contador = contador + 1;
		
			} while (contador <=20);
			
			sc.close();
			
		}
		
	}
	