package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class CadastroAlunoRepita {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String endereco;
		String email;
		int matricula;
		int telefone;
		int cont = 0;
		
		System.out.println("Por favor informar a matr�cula");
		matricula = sc.nextInt();
		
		do
		{
			if (matricula != 0)
			{	
				System.out.println("Por favor informar  o nome:");
				nome = sc.next();
				
				System.out.println("Por favor informar  o endere�o:");
				endereco = sc.next();
				
				System.out.println("Por favor informar  o E-mail:");
				email = sc.next();
				
				System.out.println("Por favor informar  o telefone:");
				telefone = sc.nextInt();
				
				cont = cont + 1; // cont ++!
				
				System.out.println("Pr favor informar  a matr�cula do pr�ximo aluno:");
				matricula = sc.nextInt();
			}	
		}
		while (matricula != 0);
		
		sc.close();
	}

}
