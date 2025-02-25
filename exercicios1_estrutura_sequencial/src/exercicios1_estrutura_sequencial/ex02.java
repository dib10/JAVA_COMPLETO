package exercicios1_estrutura_sequencial;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		System.out.println("Exercício 2");
		Double pi = 3.14159;

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio: '");
		Double R = sc.nextDouble();
		Double A = pi * R * R;

		
		System.out.printf("Área = %.4f%n", A);
		

	}

}
