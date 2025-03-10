package a70_ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome; ");
		funcionario.nome = sc.nextLine();
		
		System.out.println("Salario bruto");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.println("Taxa");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Porcentagem de incremento; ");
		double porcentagem = sc.nextDouble();
		funcionario.incrementarSalario(porcentagem);
	}

}
