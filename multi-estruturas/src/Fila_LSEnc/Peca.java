package Fila_LSEnc;

public class Peca {
	private String nome;
	private Peca proximo;
	
	
	public Peca(String nome, Peca proximo) {
		this.nome = nome;
		this.proximo = proximo;
	}
	
	public Peca getProximo() {
		return proximo;
	}
	public void setProximo(Peca proximo) {
		this.proximo = proximo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
