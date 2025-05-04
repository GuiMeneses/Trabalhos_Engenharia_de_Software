package PackagePrincipal;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
		// Construtor herdado da classe mãe.
	}

	@Override
	public String info() {
		// Retorna como string o que a moeda simboliza. Nesse caso moedas de Real e o valor.
		return "R$"+valor;
	}

	@Override
	public double converter() {
		// Neste caso a moeda já está em real então retornamos o próprio valor sem alteração.
		return valor;
	}

}

//Guilherme Meneses Ramalho.