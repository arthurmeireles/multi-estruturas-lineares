package Fila_LSEnc;

import Deque.PecaDeque;

public class FilaListaEncadeada {
	private Peca primeiro;
	private Peca atual;
	private Peca ultimo =  null;
	
	
	public FilaListaEncadeada(Peca primeiro, Peca atual, Peca ultimo) {
		this.primeiro = primeiro;
		this.atual = atual;
		this.ultimo = ultimo;
	}
	
	public void push(Peca peca) {
		if(primeiro == null) {
			primeiro = peca;
			ultimo= peca;
		}
		
		
//	se nao for o primeiro elemento || ESSA VERSÃO EU ACHO QUE ESTÁ O(N)
//		else {
//			atual = primeiro;
//			while(atual.getProximo() != null) {
//				atual = atual.getProximo();
//			}
//			
//			atual.setProximo(peca);
//		}
		
//		se nao for o primeiro elemento || ESSA VERSÃO EU ACHO QUE ESTÁ O(1)		
		
		else {
			Peca batata = ultimo;
			ultimo = peca;
			batata.setProximo(peca);			
		}
	}
	
	public void pop() {
////		se nao estiver vazia
		if(primeiro != null) {
			
			atual = primeiro;
			primeiro = primeiro.getProximo();
			atual = null;
			
		}
		else {
			System.out.println("Ta vazia, não foi possivel remover");
		}
	}
	
	public void imprimirFila() {
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
}
