package Pilha_LSEnc;

public class PilhaListaEncadeada {
	private PecaPilha primeiro;
	private PecaPilha atual;
	private PecaPilha topo;	
	
	public PilhaListaEncadeada(PecaPilha primeiro, PecaPilha atual, PecaPilha topo) {
		this.setPrimeiro(primeiro);
		this.setAtual(atual);
		this.setTopo(topo);
	}
	
	public void push(PecaPilha pecapilha) {
		if(primeiro == null) {
			primeiro = pecapilha;
			atual = topo;
			topo = primeiro;
		}
		else {
			topo.setProximo(pecapilha);
			topo = pecapilha;
			atual = pecapilha.getProximo();		
		}
	}
	
	// O(N)
	public void pop() {
		System.out.println("O topo atual é: " + topo.getNome());
		atual = topo;
		if(primeiro == null) {
			System.out.println("Pilha Vazia");
		}
		else {
			
			topo = atual;
			atual = null;
			System.out.println("O novo topo é: " + topo.getNome());
		}
	}
	
	public void imprimirPilha() {
		if(primeiro == null) {
			System.out.println("Lista Vazia");
		}
		else {
			atual = primeiro;
			while(atual != null) {
				System.out.println(atual.getNome());
				atual = atual.getProximo();
			}
		}
	}

	public PecaPilha getTopo() {
		return topo;
	}

	public void setTopo(PecaPilha topo) {
		this.topo = topo;
	}

	public PecaPilha getAtual() {
		return atual;
	}

	public void setAtual(PecaPilha atual) {
		this.atual = atual;
	}

	public PecaPilha getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(PecaPilha primeiro) {
		this.primeiro = primeiro;
	}
	
}
