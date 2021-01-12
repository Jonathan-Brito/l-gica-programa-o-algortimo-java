package unidade04;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContasRepeticao {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String descricaoConta = JOptionPane.showInputDialog("Por favor informe o nome da conta:");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Por favor informe o valor da conta:"));
		int cont = 0;
		double valorTotal = 0;
		
		while (valor > 0) 
		{
			JOptionPane.showMessageDialog(null, "Por favor informar a conta: " + descricaoConta + " - Valor:R$ " + valor);
			cont = cont + 1;
			valorTotal = valorTotal + valor;
			

			descricaoConta = JOptionPane.showInputDialog("Por favor informe o nome da descrição da conta:");
			valor = Double.parseDouble(JOptionPane.showInputDialog("Por favor informe o valor da conta:"));
		}
		
		JOptionPane.showMessageDialog(null, "Número de conta(s): " + cont +  " - Valor:R$ " + valorTotal);
		
		
		
		sc.close();
	}

}
