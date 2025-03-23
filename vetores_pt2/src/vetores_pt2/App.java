package vetores_pt2;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produtos[] vect = new Produtos[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			
			vect[i] = new Produtos(nome, preco);
			
			
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			
			soma+=vect[i].getPreco();
			
			
		}
		double media = soma / n;
		
		System.out.printf("Média: %.2f%n", media);
	}

}
