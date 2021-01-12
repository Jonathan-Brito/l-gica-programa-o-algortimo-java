package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraMedia50Alunos {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final double avaliacoes = 4; // Constante!
		int i;
		double n1;
		double n2;
		double n3;
		double n4;
		double media;
		double mediaAlunos;
		
		mediaAlunos = 0;
		
		for (i = 1; i <= 3; i = i + 1) {
			System.out.println("Favor informar a nota 1 ");
			n1 = sc.nextDouble();
			
			System.out.println("Favor informar a nota 2 ");
			n2 = sc.nextDouble();
			
			System.out.println("Favor informar a nota 3 ");
			n3 = sc.nextDouble();
			
			System.out.println("Favor informar a nota 4 ");
			n4 = sc.nextDouble();
			
			media = (n1 + n2 + n3 + n4) / avaliacoes;
			
			mediaAlunos = mediaAlunos + media;
		}
		
		mediaAlunos = mediaAlunos / i;
		
		System.out.println("Média dos 03 alunos = " + mediaAlunos);
		
		
		
		
		sc.close();
	}

}
