package PackagePrincipal;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
		// Construtor herdado da classe mãe.
	}

	@Override
	public String info() {
		// Retorna como string o que a moeda simboliza. Nesse caso moedas de Euro e o valor.
		return "€" + valor;
	}

	@Override
	public double converter() {
		// Converte o valor da moeda em real e retorna o valor como double.
		return valor * 5.97;//Data da cotação 11/02/2025 https://wise.com/br/currency-converter/eur-to-brl-rate?amount=1
	}

}

//Guilherme Meneses Ramalho.