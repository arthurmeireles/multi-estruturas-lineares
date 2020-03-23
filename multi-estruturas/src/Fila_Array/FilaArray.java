package Fila_Array;
import java.util.Arrays;

public class FilaArray {
	private int tamanhoFila;
	private int indiceInicio = 0;
	private int indiceFim = -1;
	private int quantidadeElementos = 0;
	private PecaLA[] elementos;
	
	public FilaArray(int tamanhoFila, int indiceInicio, int indiceFim, int quantidadeElementos,PecaLA[] elementos) {
		this.tamanhoFila=tamanhoFila;
		this.indiceInicio = indiceInicio;
		this.indiceFim = indiceFim;
		this.quantidadeElementos = quantidadeElementos;
		this.elementos = elementos;
	}
	

	public void push(PecaLA peca) {
		if(taCheia() == true) {
			System.out.println("Fila cheia");
			duplicaArray();
			indiceFim++;
			elementos[indiceFim] = peca;
			quantidadeElementos++;
			System.out.println("Objeto "+elementos[indiceFim].getNome() + " incluido");
			
		}
		else {
			if(indiceFim == elementos.length-1) {
				indiceFim = -1;
			}
			
			indiceFim++;
			elementos[indiceFim] = peca;
			quantidadeElementos++;
			System.out.println("Objeto "+elementos[indiceFim].getNome() + " incluido");
			
		}
		
	}
	
	public void pop() {
//		se nao estiver vazia
		if(quantidadeElementos>0) {
			PecaLA primeiroFila = elementos[indiceInicio];
			elementos[indiceInicio] = null;
			indiceInicio++;
			if(indiceInicio == elementos.length) {
				indiceInicio = 0;
			}
			quantidadeElementos--;
			
			System.out.println("Objeto removido "+ primeiroFila.getNome());
			
		}
		else {
			System.out.println("Ta vazia, não foi possivel remover");
		}
	}
	
	public boolean taVazia() {
		if(quantidadeElementos == 0) {
			return true;
		}
		return false;
	}
	
	
//	Recebe a fila e vê se a quantidade de elementos 
	public boolean taCheia() {
		if(quantidadeElementos == tamanhoFila) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public int getTamanhoFila() {
		return tamanhoFila;
	}

	public void setTamanhoFila(int tamanhoFila) {
		this.tamanhoFila = tamanhoFila;
	}

	public Object[] getElementos() {
		return elementos;
	}

	public void setElementos(PecaLA[] elementos) {
		this.elementos = elementos;
	}

	public int getIndiceFim() {
		return indiceFim;
	}

	public void setIndiceFim(int indiceFim) {
		this.indiceFim = indiceFim;
	}

	public int getIndiceInicio() {
		return indiceInicio;
	}

	public void setIndiceInicio(int indiceInicio) {
		this.indiceInicio = indiceInicio;
	}

//	===========================================
	public void duplicaArray() {
		System.out.println(tamanhoFila*2);
		
		PecaLA[] novoArray = new PecaLA[tamanhoFila*2];
		for(int i = 0; i<tamanhoFila; i++) {
			novoArray[i] = elementos[i];
		}
		tamanhoFila = tamanhoFila*2;		
		indiceFim++;
		elementos = novoArray;
		System.out.println("Fila duplicada!!!");
	}

	public void imprimirFila() {
		System.out.println(quantidadeElementos);
		if(quantidadeElementos>0) {
			System.out.println("Primeiro Elemento: "+ elementos[indiceInicio].getNome());
			for(int i = 0; i<tamanhoFila; i++) {
				System.out.println(elementos[i].getNome());
			}
		}
		else {
			System.out.println("Fila ta Vazia");
		}
	}

	
	
}
