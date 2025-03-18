package a70ex3;

public class Student {
	
	String nomeAluno;
	double nota1;
	double nota2;
	double nota3;
	
	
	public double calcularMedia(double nota1, double nota2, double nota3) {
		double mediaFinal = ((nota1 * 30) + (nota2 * 35) + (nota3 * 35)) / 100;
		return mediaFinal;
	}
	
	

}
