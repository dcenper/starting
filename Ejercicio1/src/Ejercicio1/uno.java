package Ejercicio1;
import java.util.Scanner;

public class uno {
	public static void main(String[] args) {
		
		//Declaraciones
		
		byte nota;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Introduce una nota");
		nota = sc.nextByte();
		
		if (nota<0 || nota>10) {
			
			System.out.println("Error!");
		}
		
		else {
		
				if (nota>=5) {
				
				System.out.println("Aprobado!");
				
				}
				
				else  {
					
				System.out.println("Suspenso");
				
				}	
		}		
	}
}
