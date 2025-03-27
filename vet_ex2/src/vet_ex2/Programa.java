package vet_ex2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?: ");
		int n = sc.nextInt();
		
		//criando vetores
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas  = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) +" a pessoa");
			System.out.println("Nome: ");
			nomes[i] = sc.next();
			
			System.out.println("Idade: ");
			idades[i] = sc.nextInt();
			System.out.println("Altura: ");
			alturas[i] = sc.nextDouble();
			
		}
		
		//somando alturas
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			
			soma +=alturas[i];
			
		}
		
		double media_alturas = soma / n;
		
		System.out.printf("Altura média: %.2f%n", media_alturas);
		
		int contagem_idade = 0;
		
		for (int i = 0; i < n; i++) {
			
			if (idades[i] < 16) {
				
				contagem_idade += 1;
				
			}
			
		}
		
		double porcentagem_idade = contagem_idade * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcentagem_idade);
		
		

		
		
		
		
		
		
		
		sc.close();
	}

}
