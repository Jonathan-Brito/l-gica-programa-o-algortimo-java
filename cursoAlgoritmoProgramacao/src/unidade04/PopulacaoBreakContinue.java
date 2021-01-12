package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class PopulacaoBreakContinue {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Declara��o de constantes!
		final double habitantesA = 5000000;
		final double habitantesB = 7000000;
		final double taxaA = 0.03;
		final double taxaB = 0.02;
		
		// Declara��o de vari�veis!
		double populacaoA = habitantesA;
		double populacaoB = habitantesB;
		int tempo = 0;
		
		
		while (  populacaoB >=  populacaoA )  
		{
			populacaoA = populacaoA + populacaoA * taxaA;
			populacaoB = populacaoB + populacaoB * taxaB;
			
			tempo = tempo + 1;
		}
		
		System.out.println("A popula��o de A leva " + tempo + " anos para superar a popula��o de B");
		
		
		
		
		
		
		sc.close();
	}

}
