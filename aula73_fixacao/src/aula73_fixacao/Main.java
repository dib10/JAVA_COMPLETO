package aula73_fixacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Comprar Dólar $:");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor em dólares que deseja comprar: ");
        double valorDolarCompra = sc.nextDouble();
		
		System.out.println("Digite a cotação do dólar");
		double cotacaoDolar = sc.nextDouble();
		
		double valorFinal = CurrencyConverter.ConverterReais(valorDolar, cotacaoDolar);
		
		System.out.println("O preço a ser pago por " + valorDolar + " dólares será de " + valorFinal);
		 

	}

}
