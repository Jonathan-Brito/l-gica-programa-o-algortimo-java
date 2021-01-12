package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class AvaliacaoNota {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Por favor digite uma nota");
		nota = sc.nextInt();
		
		if (nota >= 0 && nota <= 100)
		{	
			if (nota >= 90) {
				System.out.println("Conceito excelente !! sua nota � " + nota);
			}
			else if (nota >= 70) {
				System.out.println("Conceito bom !! sua nota � " + nota);
			}
			else if (nota >= 50) {
				System.out.println("Conceito regular !! sua nota � " + nota);
			}
			else {
				System.out.println("Conceito insuficiente !! sua nota � " + nota);
			}	
		
		}
		else {
			System.out.println("Nota inv�lida !!");
			AvaliacaoNota.main(null); // Estrutura de repeti��o.
		}
		
		
		
		
		
		sc.close();
	}

}
