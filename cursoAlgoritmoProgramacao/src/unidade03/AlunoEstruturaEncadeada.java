package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class AlunoEstruturaEncadeada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final int geral = 4;
		double nota1, nota2, nota3, nota4;
		double media;
		double frequencia;
		
		System.out.println("Digite a nota 1");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota 2");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota 3");
		nota3 = sc.nextDouble();
		
		System.out.println("Digite a nota 4");
		nota4 = sc.nextDouble();
		
		System.out.println("Digite a frequência");
		frequencia = sc.nextDouble();
		
		
		media = (nota1 + nota2 + nota3 + nota4) / geral;
		
		if (media >= 7 && frequencia >= 75) {
			System.out.println("Aluno Aprovado sua média foi de " + media + " Parabéns !!");
		}
		else {
			System.out.println("Aluno reprovado sua média foi de " + media + " estude mais !!");
		}
		
		
		
		sc.close();
	}

}
