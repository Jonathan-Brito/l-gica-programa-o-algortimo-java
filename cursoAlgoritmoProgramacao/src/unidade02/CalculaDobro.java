package unidade02;

import javax.swing.JOptionPane;

/*import java.util.Locale;
import java.util.Scanner;*/

public class CalculaDobro {
	public static void main(String[] args) {
		
		/*Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu n�mero: ");
		
		double numero = teclado.nextDouble();
		double dobro = numero * 2;
		
		System.out.println("O dobro do n�emero digitado � = " + dobro);*/
		
		var numero = JOptionPane.showInputDialog("Digite seu n�mero: ");
		double dobro = Double.parseDouble(numero) * 2;
		JOptionPane.showMessageDialog(null, "O dobro do n�mero � " + dobro);
		
		
		
		
		
		
		//teclado.close();
	}

}
