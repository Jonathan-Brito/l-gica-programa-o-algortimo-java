package unidade02;

import java.util.Locale;
import java.util.Scanner;

public class RevendaVeiculos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		String modelo;
		double precoCarro;
		double entrada;
		double restante;
		
		System.out.println("Favor informar o modelo do carro");
		modelo = teclado.nextLine();
		
		System.out.println("Favor informar o preço do carro");
		precoCarro = teclado.nextDouble();
		
		entrada = 0.5 * precoCarro;
		
		restante = (0.5 * precoCarro) / 12;
		
		System.out.println("O valor do carro com 50% de entrada = R$ " + entrada + " com o saldo restante em 12 parcelas = R$ " + restante);
		
		
		
		teclado.close();
	}

}
