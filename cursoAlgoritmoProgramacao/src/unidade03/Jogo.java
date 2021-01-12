package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial; 
		int horaFinal;
		int duracao;
		
		System.out.println("Digite a hora inicial do jogo");
		horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final do jogo");
		horaFinal = sc.nextInt();
		
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}
}

