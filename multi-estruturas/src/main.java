import Fila_Array.*;
import Fila_LSEnc.*;
import java.util.*;
import Pilha_LSEnc.*;
import Deque.Deque;
import Deque.PecaDeque;


public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Digite a estrutura que deseja utilizar:");
			System.out.println("Digite [1] para fila array");
			System.out.println("Digite [2] para fila lista encadeada");
			System.out.println("Digite [3] para pilha lista encadeada");
			System.out.println("Digite [4] para deque lista duplamente encadeada");
			
			int entrada = input.nextInt();
			
			if(entrada == 1) {
				System.out.println("Digite o tamanho da fila:");
				int tamanho = input.nextInt();
				PecaLA[] elementos= new PecaLA[tamanho];
				
				FilaArray filaArray = new FilaArray(tamanho, 0, -1, 0, elementos);
				while (true) {
					System.out.println("Digite o que deseja realizar:");
					System.out.println("Digite [1] para dar push na fila");
					System.out.println("Digite [2] para dar pop na fila");
					System.out.println("Digite [3] para listar");
					System.out.println("Digite [0] para sair");
					int entradaFA = input.nextInt();
					if(entradaFA == 1) {
						System.out.println("Preencha o objeto");
						String objeto = input.next();
						PecaLA peca = new PecaLA(objeto);
						filaArray.push(peca);
					}
					if(entradaFA == 2) {
						filaArray.pop();
					}
					if(entradaFA == 3) {
						filaArray.imprimirFila();
					}
					if(entradaFA == 0) {
						break;
					}
				}
			}
			if(entrada == 2) {
				FilaListaEncadeada listaencadeada = new FilaListaEncadeada(null, null, null);
				while(true) {
					System.out.println("Digite o que deseja realizar:");
					System.out.println("Digite [1] para dar push na fila");
					System.out.println("Digite [2] para dar pop na fila");
					System.out.println("Digite [3] para listar");
					System.out.println("Digite [0] para sair");
					
					int entradaFLE = input.nextInt();
					
					if(entradaFLE == 1) {
						System.out.println("Preencha o objeto");
						String objeto = input.next();
						Peca peca = new Peca(objeto, null);
						listaencadeada.push(peca);
					}
					if(entradaFLE == 2) {
						listaencadeada.pop();
					}
					if(entradaFLE == 3) {
						listaencadeada.imprimirFila();
					}
					if(entradaFLE == 0) {
						break;
					}
				}

			}
			if(entrada == 3) {
				PilhaListaEncadeada pilhalistaencadeada = new PilhaListaEncadeada(null, null, null);
				while(true) {
					System.out.println("Digite o que deseja realizar:");
					System.out.println("Digite [1] para dar push na pilha");
					System.out.println("Digite [2] para dar pop na pilha");
					System.out.println("Digite [3] para listar");
					System.out.println("Digite [0] para sair");
					int entradaPLE = input.nextInt();
					if(entradaPLE == 1) {
						System.out.println("Preencha o objeto");
						String objeto = input.next();
						PecaPilha peca = new PecaPilha(objeto, null);
						pilhalistaencadeada.push(peca);
					}
					if(entradaPLE == 2) {
						pilhalistaencadeada.pop();
					}
					if(entradaPLE == 3) {
						pilhalistaencadeada.imprimirPilha();
					}
					if(entradaPLE == 0) {
						break;
					}
				}
				
			}
			if(entrada == 4) {
				Deque deque = new Deque(null, null);
				
				while(true) {
					
					System.out.println("Digite o que deseja realizar:");
					System.out.println("Digite [1] para dar push no inicio");
					System.out.println("Digite [2] para dar push no fim");
					System.out.println("Digite [3] para dar pop no inicio");
					System.out.println("Digite [4] para dar pop no fim");
					System.out.println("Digite [5] para listar");
					System.out.println("Digite [0] para sair");
					
					int entradaPLE = input.nextInt();
					
					if(entradaPLE == 1) {
						System.out.println("Preencha o objeto");
						String objeto = input.next();
						PecaDeque peca = new PecaDeque(objeto, null, null);
						deque.pushInicio(peca);
					}
					if(entradaPLE == 2) {
						System.out.println("Preencha o objeto");
						String objeto = input.next();
						PecaDeque peca = new PecaDeque(objeto, null, null);
						deque.pushFim(peca);
					}					
					
					
					
					if(entradaPLE == 3) {
						deque.popInicio();
					}
					
					if(entradaPLE == 4) {
						deque.popFim();
					}
					
					if(entradaPLE == 5) {
						deque.imprimirDeque();
					}
					
					if(entradaPLE == 0) {
						break;
					}
				}
				
			}
		}
	}
}
