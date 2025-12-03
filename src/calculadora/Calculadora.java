package calculadora;

public class Calculadora {

	private double numero1;
	private double numero2;
	private String operacao;

	// Construtor
	public Calculadora(double numero1, double numero2, String operacao) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.operacao = operacao;
	}

	// Método que realizará o cálculo
	public Double calcular() {
		switch (operacao) {
		case "+":
			return numero1 + numero2;
		case "-":
			return numero1 - numero2;
		case "*":
			return numero1 * numero2;
		case "/":
			if (numero2 == 0) {
				System.out.println("Erro! Divisão por zero!");
				return null;
			}
			return numero1 / numero2;
		default:
			System.out.println("Operação inválida!");
			return null;
		}
	}

	// Métodos que permitem alterar os valores dos números ou da operação
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
}
