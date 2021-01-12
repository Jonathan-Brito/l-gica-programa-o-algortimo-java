package unidade02;

//import java.util.Locale;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Jantar {
	public static void main(String[] args) {
		/*Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		final double taxa_garcom = 0.1; // Constante
		
		System.out.println("Favor informar o valor do jantar: ");
		double valor_jantar = teclado.nextDouble();
		double valor_jantar_total = valor_jantar + (taxa_garcom * valor_jantar);
		
		System.out.println("O valor do total do jantar a ser pago é de " + valor_jantar_total);
		
		
		teclado.close();*/
		
		
		
		final double taxa_garcom = 0.1; // Constante
		double valor_jantar;
		double valor_jantar_total;
		
		valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("Informar o valor do jantar: "));
		valor_jantar_total = valor_jantar + (taxa_garcom * valor_jantar);
		JOptionPane.showMessageDialog(null, "O valor total do jantar a ser pago é de " + valor_jantar_total);
	}

}
