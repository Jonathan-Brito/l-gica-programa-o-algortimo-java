package unidade02;

import javax.swing.JOptionPane;

public class OpcoesPagamentos {
	public static void main(String[] args) {
		
		double valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do produto"));
		double produto_avista = valor_produto * 0.9;
		double produto_parcelado = valor_produto / 3;
		
		
		JOptionPane.showMessageDialog(null, "O produto pago a vista tem 10 % de desconto e será de " + produto_avista);
		JOptionPane.showMessageDialog(null, "O produto pago a prazo em 3 x de " + produto_parcelado );
	}

}
