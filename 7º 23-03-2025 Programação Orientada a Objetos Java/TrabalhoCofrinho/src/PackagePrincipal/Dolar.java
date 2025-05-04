package PackagePrincipal;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
		// Construtor herdado da classe mãe.
	}

	@Override
	public String info() {
		// Retorna como string o que a moeda simboliza. Nesse caso moedas de Dólar e o valor.
		return "$" + valor;
	}

	@Override
	public double converter() {
		// Converte o valor da moeda em real e retorna o valor como double.
		return valor * 5.77;//Data da cotação 11/02/2025 site:https://wise.com/br/currency-converter/dolar-hoje
	}

}

//Guilherme Meneses Ramalho.