package unidade02;

import javax.swing.JOptionPane;

public class Numero {
	public static void main(String[] args) {
		 
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informar o n�mero"));
		int anterior = numero - 1;
		int posterior = numero + 1;
		
		JOptionPane.showMessageDialog(null, "O valor do n�mero anterior � " + anterior + " e o n�mero posterior � " + posterior);
	}

}
