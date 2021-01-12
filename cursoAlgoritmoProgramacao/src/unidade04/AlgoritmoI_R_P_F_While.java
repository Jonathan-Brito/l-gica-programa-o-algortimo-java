package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoI_R_P_F_While {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Declaração de variáveis!
		double irpf;
		double rendaMensal;
		double salarioLiquido;
		int numeroDependentes;
		int numeroContribuintes = 1;
		String cpf;
		String nome;
		
		while (numeroContribuintes <= 3) 
		{
			System.out.print("Por favor digite um nome: ");
			nome = sc.next();
			System.out.print("Por favor digite um cpf: ");
			cpf = sc.next();
			System.out.print("Por favor digite o número de dependentes: ");
			numeroDependentes = sc.nextInt();
			System.out.print("Por favor digite uma renda mensal: ");
			rendaMensal = sc.nextDouble();
			
			salarioLiquido = rendaMensal - (numeroDependentes * 189.59) - 0.11 * rendaMensal;
			
			if (salarioLiquido <= 1903.98) 
			{
				irpf = 0;
				System.out.println("Contribuinte " + nome + " é isento de imposto de renda");
			}
			
			else if ((salarioLiquido >= 1903.99) && (salarioLiquido <= 2826.65))
			{
				irpf = 0.075 * salarioLiquido - 142.80;
				System.out.println("O irpf do contribuinte " + nome + " é " + irpf);
			}
			
			else if ((salarioLiquido >= 2826.66) && (salarioLiquido <= 3751.05))
			{
				irpf = 0.15 * salarioLiquido - 354.80;
				System.out.println("O irpf do contribuinte " + nome + " é " + irpf);
			}
			
			else if ((salarioLiquido >= 3751.06) && (salarioLiquido <= 4664.68))
			{
				irpf = 0.225 * salarioLiquido - 636.13;
				System.out.println("O irpf do contribuinte " + nome + " é " + irpf);
			}
			
			else 
			{
				irpf = 0.275 * salarioLiquido - 869.36;
				System.out.println("O irpf do contribuinte " + nome + " é " + irpf);
			}
			
			numeroContribuintes = numeroContribuintes + 1;
		}
		
		sc.close();
	}

}
