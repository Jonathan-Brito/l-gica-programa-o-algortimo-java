package unidade02;

import javax.swing.JOptionPane;

public class EscreveVariaveis {
	public static void main(String[] args) {
		
		//String fruta = "Banana";
		double valor = 3.50;
		String fruta = JOptionPane.showInputDialog("Digite a fruta");
		
		JOptionPane.showMessageDialog(null, "O valor da " + fruta + " e de " + valor);
		
		
		//System.out.printf("O valor da fruta %s e de  %.2f reai %n", fruta, valor );
	}

}
