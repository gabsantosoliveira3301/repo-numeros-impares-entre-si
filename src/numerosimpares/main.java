package numerosimpares;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int contadorImpares = 0;

		String input = JOptionPane.showInputDialog("digite o primeiro numero");
		int numero = Integer.parseInt(input);
		
		String input2 = JOptionPane.showInputDialog("digite o primeiro numero");
		int numero2 = Integer.parseInt(input2);
		
		
		for(int i = numero; i <= numero2; i++ ) {
			
			
			if (i % 2 == 0) {
			    System.out.println("O número é par");
			    
			}else {
				contadorImpares++;
				System.out.println("O número é ímpar");
			}
			
			
			
			
			
		}
		
		
		
		JOptionPane.showMessageDialog(null, "Os numeros pares entre"+numero+ "e "+numero2+" é: " + contadorImpares);
	}

}
