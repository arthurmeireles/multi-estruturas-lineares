package Deque;

public class Deque {
	private PecaDeque primeiro;
	private PecaDeque ultimo;
	
	
	public Deque(PecaDeque primeiro, PecaDeque ultimo) {
		this.primeiro = primeiro;
		this.ultimo = ultimo;
	}
	
	public PecaDeque getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(PecaDeque primeiro) {
		this.primeiro = primeiro;
	}
	public PecaDeque getUltimo() {
		return ultimo;
	}
	public void setUltimo(PecaDeque ultimo) {
		this.ultimo = ultimo;
	}
	
	public void pushInicio(PecaDeque peca) {
		if(primeiro == null) {
			primeiro = peca;
			ultimo = peca;
		}
		else {
			PecaDeque atual = primeiro;
			primeiro = peca;
			primeiro.setProximo(atual);
			atual.setAnterior(primeiro);
			
			if(atual.getProximo() == null) {
				ultimo = atual;
			}		
		}
	}
	
	public void pushFim(PecaDeque peca) {
		if(primeiro == null) {
			primeiro = peca;
			ultimo = peca;
		}
		else {
			PecaDeque atual = ultimo;
			ultimo = peca;
			ultimo.setAnterior(atual);
			atual.setProximo(peca);

			if(atual.getAnterior() == null) {
				primeiro = atual;
			}			
		}
	}
	
	public void popInicio() {
		PecaDeque vaisair = primeiro;
		primeiro = vaisair.getProximo();
		primeiro.setAnterior(null);
		vaisair = null;
	}
	public void popFim() {
		PecaDeque vaisair = ultimo;		
		ultimo = vaisair.getAnterior();		
		ultimo.setProximo(null);
		vaisair = null;
		
	}
	
	public void imprimirDeque() {
		if(primeiro == null) {
			System.out.println("Deque Vazio!!");
		}
		else {
			PecaDeque peca = primeiro;
			while(peca != null) {
				System.out.println(peca.getNome());
				peca = peca.getProximo();
			}
		}
	}

}
