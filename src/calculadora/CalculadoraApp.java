package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double numero1 = lerDouble(sc, "Digite o primeiro valor: ");
		double numero2 = lerDouble(sc, "Digite o segundo valor: ");
		String operacao = lerOperacao(sc);

		// Objeto Calculadora com os números e a operação
		Calculadora calc = new Calculadora(numero1, numero2, operacao);

		// Chamando o método calcular do objeto
		Double resultado = calc.calcular();

		if (resultado != null) {
			System.out.println("Resultado: " + resultado);
		}

		sc.close();
	}

	private static double lerDouble(Scanner sc, String mensagem) {
		Double valor = null;

		while (valor == null) {
			System.out.print(mensagem);
			try {
				valor = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Digite um número válido!");
				sc.next(); // limpa a entrada inválida
			}
		}
		sc.nextLine(); // limpa o buffer
		return valor;
	}

	private static String lerOperacao(Scanner sc) {
		System.out.print("Digite a operação (+, -, *, /): ");
		return sc.nextLine().trim();
	}
}
