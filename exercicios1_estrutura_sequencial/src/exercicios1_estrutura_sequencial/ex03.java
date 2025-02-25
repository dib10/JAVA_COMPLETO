package exercicios1_estrutura_sequencial;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		System.out.println("Exercício 3.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int A = sc.nextInt();
		System.out.println("Digite o valor de B:");
		int B = sc.nextInt();
		System.out.println("Digite o valor de C:");
		int C = sc.nextInt();
		System.out.println("Digite o valor de D");
		int D = sc.nextInt();
		
		int DIFERENCA = (A * B - C *D); 
		
		System.out.println("A diferença é: " + DIFERENCA);



	
		

	}

}
