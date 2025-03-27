package vet_ex1;

public class Numeros {
	
	private int[] vetor;
	private int quantidade_numeros;
	
	
	protected Numeros(int quantidade_numeros) {
		super();
		this.vetor = new int[quantidade_numeros];
		this.quantidade_numeros = quantidade_numeros;
	}
	
	//adicionar numero
	
	public void adicionarNumero(int i, int numero) {
		if(i >=0 && i <quantidade_numeros) {
			vetor[i] = numero;
		}
	}
	
	//imprimir os num
	
	
	public void imprimirNeg() {
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i< quantidade_numeros; i++) {
			if(vetor[i] < 0 ) {
				System.out.println(vetor[i]);
			}
		}
	}
	
	

}
