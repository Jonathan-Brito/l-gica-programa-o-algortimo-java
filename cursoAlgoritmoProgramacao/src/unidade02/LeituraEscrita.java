package unidade02;

import javax.swing.JOptionPane;

public class LeituraEscrita {
	public static void main(String[] args) {
		
		/*Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		
		String nome = teclado.next();
		System.out.println("Seja bem vindo " + nome);
		
		teclado.close();*/
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome);
	}

}
