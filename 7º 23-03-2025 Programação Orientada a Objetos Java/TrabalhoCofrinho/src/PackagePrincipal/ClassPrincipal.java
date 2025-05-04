package PackagePrincipal;

import java.util.Scanner;

public class ClassPrincipal {

	static String inputUsuario = null;
	static Scanner teclado = new Scanner(System.in);
	static Cofrinho cofrinho = new Cofrinho();
	static Module moeda = null;

	public static void main(String[] args) {
		
		while (inputUsuario == null || inputUsuario != "0") {
			inputUsuario = null;
			
			//Menu principal.
			System.out.println();
			System.out.println("~~ Cofrinho ~~");
			System.out.println("1- Adicionar moeda");
			System.out.println("2- Remover moeda");
			System.out.println("3- Listar moedas");
			System.out.println("4- Calcular total convertido para Real");
			System.out.println("0- Encerrar");
			System.out.print("R: ");
			inputUsuario = teclado.next();
			switch (inputUsuario) {
			case "1": {
				System.out.println();
				System.out.println("~~ Adicionar moeda ~~");
				menuAdicionarMoeda();
				break;
			}
			case "2": {
				System.out.println();
				System.out.println("~~ 2- Remover moeda ~~");
				menuRemoverMoeda();
				break;
			}
			case "3": {
				System.out.println();
				System.out.println("~~ 3- Listar moedas ~~");
				cofrinho.listagemMoedas();
				break;
			}
			case "4": {
				System.out.println();
				System.out.println("~~ 4- Calcular total convertido para Real ~~");
				cofrinho.totalConvertido();
				break;
			}
			case "0": {
				System.out.println();
				System.out.println("~~ Programa encerrado! ~~");
				System.out.println();
				return;
			}
			default:
				System.out.println("-=!#!=- Opção inválida, tente novamente. -=!#!=-");
			}
		}
	}
	
	
	// Métodos auxiliares do main.
	enum tipoMoeda{
		// Variável para tipificar as moedas.
		Real, Dolar, Euro
	}
	
	private static Moeda instanciaMoeda(tipoMoeda tipo, Double valor) {
		// Retorna uma moeda instanciada.
		switch (tipo) {
			case Real: {
				return new Real(valor);
			}
			case Dolar: {
				return new Dolar(valor);
			}
			case Euro: {
				return new Euro(valor);
			}
			default: {
				return null;
			}
		}
	}

	public static void menuAdicionarMoeda() {
		// Adiciona o menu de adicionar moeda.
		Moeda m = selecionaMoeda();
		if(m != null) {
			cofrinho.adicionar(m);
		}
	}
	
	public static void menuRemoverMoeda() {
		// Adiciona o menu de remover moeda.
		cofrinho.listagemMoedas();
		Moeda m = selecionaMoeda();
		cofrinho.remover(m);
	}
	
 	public static Moeda selecionaMoeda() {
 		// Menu para que o usuário selecione um tipo de moeda, este método retorna uma moeda
 		// utilizando o método instanciaMoeda().
		while (true) {
			inputUsuario = null;
			tipoMoeda tipo = null;
			double valor;
			//Menu seleciona moeda
			System.out.println("~~ Selecione o tipo ~~");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			System.out.println("0 - Voltar para o menu principal");
			System.out.print("R:");
			inputUsuario = teclado.next();
			
			// Atribui o tipo da moeda.
			tipo = null;
			switch (inputUsuario) {
			case "1": {
				tipo = tipoMoeda.Real;
				break;
			}
			case "2": {
				tipo = tipoMoeda.Dolar;
				break;
			}
			case "3": {
				tipo = tipoMoeda.Euro;
				break;
			}
			case "0": {
				return null;
			}
			default:
				System.out.println();
				System.out.println("Tipo inválido, tente novamente.");
				System.out.println();
				break;
			}
			
			// Só prossegue caso a moeda tenha um tipo, se não retorna para selecionar o tipo.
			if(tipo != null) {
				while (true) {
					// Atribuir o valor da moeda.
					inputUsuario = null;
					System.out.println();
					System.out.println("~~ Selecione o valor ~~");
					System.out.println("0 - Voltar para o menu principal");
					System.out.print("R: ");
					inputUsuario = teclado.next();
					
					// Só atribui o valor se for possivel transformar para double e for maior que 0.
					try {
						valor = Double.parseDouble(inputUsuario);
						if(valor > 0) {
							return instanciaMoeda(tipo, valor);
						}else if(valor == 0){
							return null;
						}else {
							System.out.println();
							System.out.println("o valor '"+inputUsuario+"' é menor que 0. Tente novamente.");
						}
					} catch (Exception e) {
						System.out.println();
						System.out.println("O valor '"+ inputUsuario +"' é inválido. Tente novamente.");
					}
				}
			}
		}
	}
}	








// Guilherme Meneses Ramalho.