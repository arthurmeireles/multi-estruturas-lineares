package Deque;

public class PecaDeque {
	private String nome;
	private PecaDeque proximo;
	private PecaDeque anterior;
	
	public PecaDeque(String nome, PecaDeque proximo, PecaDeque anterior) {
		this.nome = nome;
		this.proximo = proximo;
		this.anterior = anterior;
	}
	
	public PecaDeque getAnterior() {
		return anterior;
	}
	public void setAnterior(PecaDeque anterior) {
		this.anterior = anterior;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public PecaDeque getProximo() {
		return proximo;
	}
	public void setProximo(PecaDeque proximo) {
		this.proximo = proximo;
	}
	
}
