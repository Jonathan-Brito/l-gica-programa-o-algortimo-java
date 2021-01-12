package unidade03;

import java.util.Locale;
import java.util.Scanner;

public class FormaPagamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double valorProduto;
		double valorFinalProduto;
		int codigo;
		
		System.out.println("Favor informar o valor do produto");
		valorProduto = sc.nextDouble();
		
		System.out.println("Favor informar o tipo de pagamento " + "[1 - 10% desconto para pagamentos à vista] [2 - 5% de desconto para pagamentos com cartões de crédio] [3 - 2 x sem juros] [4 - 3 x com juros de 10%]");
		codigo = sc.nextInt();
		
		switch (codigo) 
		{
		case 1: 
		{
			valorFinalProduto = valorProduto * 0.9;
			System.out.println("O valor com desconto de 10% será de " + valorFinalProduto);
			break;
		}
		
		case 2: 
		{
			valorFinalProduto = valorProduto * 0.95;
			System.out.println("O valor com desconto de 5% será de " + valorFinalProduto);
			break;
		}
			
		case 3: 
		{
			valorFinalProduto = valorProduto;
			System.out.println("O valor em 2x sem juros será de " + valorFinalProduto / 2);
			break;
		}
		
		case 4: 
		{
			valorFinalProduto = valorProduto * 1.1;
			System.out.println("O valor em 3x com juros será de " + valorFinalProduto / 3);
			break;
		}
		
		default:
			System.out.println("O valor informado é inálido !");
		
		sc.close();
		}
		
	}

}
