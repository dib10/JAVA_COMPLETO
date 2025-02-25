package exercicios1_estrutura_sequencial;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int soma;
		
		System.out.println("Exercício 1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		
		soma = num1 +num2;
		System.out.println("A soma equivale a " + soma);
		sc.close();

	}

}
