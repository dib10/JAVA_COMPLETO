package a83_ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Banco Caio");
		Scanner sc = new Scanner(System.in);
		
		Banco banco;
		
		System.out.print("Número da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Proprietário da conta: ");
		sc.nextLine(); // consumir linha pendente
		String nome = sc.nextLine();
		
		System.out.println("Tem depósito inicial?(s/n)");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			
			System.out.println("Depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			banco = new Banco(nome, numeroConta, depositoInicial);
		}
		
		else {
            banco = new Banco(nome, numeroConta);
        }
		System.out.println();
		System.out.println("Dados da conta");
		System.out.println(banco);
		
		System.out.println("Digite um valor para depositar: ");
		
		double valorDeposito = sc.nextDouble();
		banco.efetuarDeposito(valorDeposito);
		
		System.out.println("Dados atualizados");
		System.out.println(banco);
		
		
System.out.println("Digite um valor para sacar: ");
		
		double valorSaque = sc.nextDouble();
		banco.efetuarSaque(valorSaque);
		
		System.out.println("Dados atualizados");
		System.out.println(banco);
		
		
		
		
		

	}

}
