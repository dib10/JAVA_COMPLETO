package a70ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sistema de notas");
		
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		System.out.println("Nome do aluno: ");
		aluno.nomeAluno = sc.nextLine();
		
		System.out.println("Primeira nota: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.println("Segunda Nota: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.println("Terceira nota: ");
		aluno.nota3 = sc.nextDouble();
		
        double media = aluno.calcularMedia(aluno.nota1, aluno.nota2, aluno.nota3);
        
        System.out.printf("A média do aluno %s, é: %.2f", aluno.nomeAluno, media);

	}
}
