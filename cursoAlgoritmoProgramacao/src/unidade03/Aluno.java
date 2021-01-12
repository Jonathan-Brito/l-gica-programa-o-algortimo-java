package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		final double numeroAvaliacoes = 4; // Constante.
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		int frequencia;
		
		System.out.println("Por favor informar a nota 1");
		nota1 = teclado.nextDouble();
		
		System.out.println("Por favor informar a nota 2");
		nota2 = teclado.nextDouble();
		
		System.out.println("Por favor informar a nota 3");
		nota3 = teclado.nextDouble();
		
		System.out.println("Por favor informar a nota 4");
		nota4 = teclado.nextDouble();
		
		System.out.println("Por favor informar frequência");
		frequencia = teclado.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4) / numeroAvaliacoes;
		
		if (media >= 7 && frequencia >= 75) {
			System.out.println("Parabéns a sua média foi = " + media + " Aprovado");
		}
		else {
			System.out.println("infezlimente a sua média foi = " + media + " Reprovado");
		}
		
		teclado.close();
	}

}
