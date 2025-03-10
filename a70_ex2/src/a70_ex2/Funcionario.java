package a70_ex2;

public class Funcionario {
	
	String nome;
	double salarioBruto;
	double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;

	}
		
	public void incrementarSalario(double porcentagem) {
		salarioBruto+= salarioBruto * porcentagem/100.0;
	}
	
	public String toString()
	{
		return nome + ", $ " + String.format("%.2f",incrementarSalario()); 
	}
}
