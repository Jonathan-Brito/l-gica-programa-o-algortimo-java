package unidade02;

import javax.swing.JOptionPane;

public class JantarPizza {
	public static void main(String[] args) {
		
		double valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("Informar o valor do jantar: "));
		int numero_clientes = Integer.parseInt(JOptionPane.showInputDialog("Informar o n�mero de clientes: "));
		double valor_jantar_clientes = valor_jantar / numero_clientes;
		
		JOptionPane.showMessageDialog(null, "O valor total do jantar a ser pago � de " + valor_jantar_clientes + " reais para cada cliente");
		
		
	}

}
