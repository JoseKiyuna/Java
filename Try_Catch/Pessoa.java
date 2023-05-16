package Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pessoa {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			double peso, altura;
			
			try {
				System.out.println("Informe o peso: ");
				peso = in.nextDouble();
				System.out.println("Informe a altura: ");
				altura = in.nextDouble();
				System.out.println("IMC: " + (peso/(altura*altura)));
			}
			catch(InputMismatchException e) {
				System.out.println("Erro em um dos valores informados.");
				System.out.println(e.toString());
			}
			catch(ArithmeticException e) {
				System.out.println("Erro de divisão por zero.");
			}
		}
}
	