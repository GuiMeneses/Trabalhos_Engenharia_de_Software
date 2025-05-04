package PackagePrincipal;

public abstract class Moeda {

	double valor;
	
	public Moeda(double valor) {
		// Construtor da classe mãe.
		super();
		this.valor = valor;
	}
	
	public String info() {
		return null;
	}
	public abstract double converter();
}

// Classe abstrata para servir de modelo para a classe Real, Dolar e Euro. 
// Com essa classe abstrata, conseguimos usufruir do polimorfismo,
// como por exemplo em uma lista referenciando a classe mãe, assim
// conseguimos colocar nessa lista todas as filhas da classe mãe.

// Guilherme Meneses Ramalho.