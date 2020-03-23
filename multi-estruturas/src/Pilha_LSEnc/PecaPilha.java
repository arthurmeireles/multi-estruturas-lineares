package Pilha_LSEnc;

public class PecaPilha {
	private String nome;
	private PecaPilha anterior;
	
	public PecaPilha(String nome, PecaPilha proximo) {
		this.setNome(nome);
		this.setAnterior(anterior);
	}

	public PecaPilha getAnterior() {
		return anterior;
	}

	public void setAnterior(PecaPilha anterior) {
		this.anterior = anterior;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
