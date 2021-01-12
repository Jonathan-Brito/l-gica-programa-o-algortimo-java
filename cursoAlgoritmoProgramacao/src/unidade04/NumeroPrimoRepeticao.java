package unidade04;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumeroPrimoRepeticao {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor informe o n�mero:"));
		int i;
		int numeroDivisores = 0;
		
		for (i = 1; i <= numero; i = i + 1) 
		{
			if (numero % i == 0) {
				numeroDivisores = numeroDivisores + 1; // numeroDivisores ++ !
			}	
		}
		
		if (numeroDivisores == 2) {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � Primo!");
		
		} 
		else {
			JOptionPane.showMessageDialog(null, "O n�mero n�o � Primo!");
		}
		
		
		sc.close();
	}

}
