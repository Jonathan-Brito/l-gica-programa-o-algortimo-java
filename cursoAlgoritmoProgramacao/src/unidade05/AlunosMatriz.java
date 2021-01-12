package unidade05;

import java.util.Locale;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AlunosMatriz {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String listaAlunos [] = new String [5];
		boolean situacaoAlunos [] = new boolean [5];
		double notaAlunos [] [] = new double [5] [4]; // Matriz
		double soma = 0;
		double media = 0;
		int i;
		int j;
		int aprovado = 0;
		int reprovado = 0;
		
		
		for (i = 0; i < 5; i ++) {
			
			nome = JOptionPane.showInputDialog("Por favor digite o nome do aluno: ");
			listaAlunos [i] = nome;
			
			for (j = 0; j < 4; j ++) {
				
				System.out.println("Por favor informar a nota do aluno: ");
				notaAlunos [i] [j] = sc.nextDouble();
				
				soma = soma + notaAlunos [i] [j];
			}
			
			media = soma / 4;
			
			if (media < 5) {
				situacaoAlunos [i] = false;
			} else {
				situacaoAlunos [i] = true;
			}
			soma = 0;
		}
		
		for (i = 0; i < 5; i ++) {
			
			if (situacaoAlunos [i]) {
				aprovado ++;
			} else {
				reprovado ++;
			}
			
		}
		
		System.out.println("Aprovado: " + aprovado);
		System.out.println("Reprovado: " + reprovado);
		
		
		sc.close();
	}

}
