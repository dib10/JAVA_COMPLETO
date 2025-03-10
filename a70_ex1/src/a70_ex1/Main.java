package a70_ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura do retangulo: ");
		 retangulo.altura = sc.nextDouble();
		
		System.out.println("Digite a largura do retangulo: ");
		 retangulo.largura  = sc.nextDouble();
		
		System.out.println("Área: " + retangulo.area());
		
		System.out.println("Perímetro: " + retangulo.perimetro());
		System.out.println("Diagonal: " + retangulo.diagonal());
		
		sc.close();
	}

}
