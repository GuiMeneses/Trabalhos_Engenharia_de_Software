package PackagePrincipal;
import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas = new ArrayList<>();

	public void adicionar(Moeda moeda){
		// Adiciona uma moeda na listaMoedas.
		listaMoedas.add(moeda);
		System.out.println("Moeda "+moeda.info()+" adicionada com sucesso.");
	}
	
	public void remover(Moeda moeda) {
		// Remove uma moeda da listaMoedas.
		double valorMoeda = 0;
		if(moeda != null) {
			valorMoeda = moeda.converter();
			System.out.println();
			System.out.println("Moeda a ser retirada:"+moeda.info());
			if(!listaMoedas.isEmpty()) {
				for(Moeda m : listaMoedas) {
					if(m.converter() == valorMoeda) {
						if(m.getClass() == moeda.getClass()) {
							// Valor igual && Class igual.
							listaMoedas.remove(m);
							System.out.println("Moeda "+m.info()+" retirada com sucesso.");
							return;
						}
					}
				}
				System.out.println("Moeda não encontrada.");
			}else {
				System.out.println("Não há moedas no cofrinho, tente ");
				System.out.println("novamente após inserir alguma moeda.");
			}
		}
	}
	
	public void listagemMoedas() {
		// Cria uma lista com todas a moedas de todos os tipos
		int num = 0;
		
		System.out.println();
		System.out.println("~~ Lista Moedas ~~");
		
		for (Moeda m : listaMoedas) {
			num++;
			System.out.println(num+"º Moeda: " + m.info());
		}
		
		if(num == 0) {
			System.out.println();
			System.out.println("~~ Lista vazia ~~");
			System.out.println();
		}
		
		System.out.println("~~ Fim lista ~~");
		System.out.println();
	}
	
	public void totalConvertido() {
		// Mostra o valor total da lista de moedas em real.
		double total = 0;
		for (Moeda m : listaMoedas) {
			total += m.converter();
		}

		if(total != 0) {
			
			System.out.println("~~ Total convertido ~~");
			System.out.println("R:  R$" + total);
			System.out.println();
		}else {
			System.out.println();
			System.out.println("~~ 4- Calcular total convertido para Real ~~");
			System.out.println("  Não há moedas no cofrinho para converter. ");
		}
	}
}



// Guilherme Meneses Ramalho.