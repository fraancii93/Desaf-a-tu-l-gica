import java.util.*;
public class OrdenarNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num1, num2, num3;
		
		String orden;
		
		System.out.println("Introduzca el primer número");
	
		num1=sc.nextInt();
	
		System.out.println("Introduzca el segundo número");
	
		num2=sc.nextInt();
	
		System.out.println("Introduzca el tercer número");
	
		num3=sc.nextInt();
		
		System.out.println("Introduce 'asc' en caso de que quieras ordenarlo ascendentemente, o introduce 'desc' en caso que quieras ordenarlo descendentemente");
		
		orden=sc.next();
			
		switch (orden) {
			case "desc":
		
						if(num1>num2) {
				            if(num1>num3) {
				                if(num2>num3) {
				                    
				                	System.out.println("El resultado es " + num1 + " " + num2 + " " + num3);
				                    	
				                }else {
	
				                	System.out.println("El resultado es " + num1 + " " + num3 + " " + num2);
				                    
				            }
				        }else {
	
				            		System.out.println("El resultado es " + num3 + " " + num1 + " " + num2);
				                
				        }
				        }else {
				            if(num2>num3) {
				                if(num1>num3) {
	
				                	System.out.println("El resultado es " + num2 + " " + num1 + " " + num3);
				                    
				                }else {
				                	System.out.println("El resultado es " + num2 + " " + num3 + " " + num1);
				                    
				                }              
				            }else {
				            	System.out.println("El resultado es " + num3 + " " + num2 + " " + num1);
		
				            }
				        }
				            break;
				            
		   case "asc":
				            	if(num1<num2) {
						            if(num1<num3) {
						                if(num2<num3) {
						                    
						                	System.out.println("El resultado es " + num1 + " " + num2 + " " + num3);
						                    	
						                }else {
			
						                	System.out.println("El resultado es " + num1 + " " + num3 + " " + num2);
						                    
						            }
						        }else {
			
						            		System.out.println("El resultado es " + num3 + " " + num1 + " " + num2);
						                
						        }
						        }else {
						            if(num2<num3) {
						                if(num1<num3) {
			
						                	System.out.println("El resultado es " + num2 + " " + num1 + " " + num3);
						                    
						                }else {
						                	System.out.println("El resultado es " + num2 + " " + num3 + " " + num1);
						                    
						                }              
						            }else {
						            	System.out.println("El resultado es " + num3 + " " + num2 + " " + num1);
				
						            }
						            break;
				            }
				            
				        }
		sc.close();
		}
						
	}				
