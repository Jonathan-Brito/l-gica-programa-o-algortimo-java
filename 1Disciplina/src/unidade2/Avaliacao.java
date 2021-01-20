package unidade2;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Avaliacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota"));
		
		if ((nota < 0) || (nota > 100)) {
			JOptionPane.showMessageDialog(null, "Nota inválida! " +
					" Favor digitar nota no intervalo de 0 a 100");
			main(null); // Recursividade
		}
		else {
			if (nota < 50) {
				JOptionPane.showMessageDialog(null, "Conceito insuficiente");
			}
			else if (nota < 70) {
				JOptionPane.showMessageDialog(null, "Conceito regular");
			}
			else if (nota < 90) {
				JOptionPane.showMessageDialog(null, "Conceito bom");
			}
			else {
				JOptionPane.showMessageDialog(null, "Conceito excelente");
			}
			
		}
	}

}
