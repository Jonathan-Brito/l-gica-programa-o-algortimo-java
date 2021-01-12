package unidade02;

import javax.swing.JOptionPane;

/*import java.util.Locale;
import java.util.Scanner;*/

public class CalculaDobro {
	public static void main(String[] args) {
		
		/*Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu número: ");
		
		double numero = teclado.nextDouble();
		double dobro = numero * 2;
		
		System.out.println("O dobro do núemero digitado é = " + dobro);*/
		
		var numero = JOptionPane.showInputDialog("Digite seu número: ");
		double dobro = Double.parseDouble(numero) * 2;
		JOptionPane.showMessageDialog(null, "O dobro do número é " + dobro);
		
		
		
		
		
		
		//teclado.close();
	}

}
