package a83_ex1;

public class Banco {
	
	private String nome;
	private int numeroDaConta;
	private double saldo;
	
	//define os construtores
	
	public Banco(String nome, int numeroDaConta, double depositoInicial) {
		super();
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
		this.efetuarDeposito(depositoInicial);

	
	}
	
	// Construtor SEM depósito inicial
    public Banco(String nome, int numeroDaConta) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0; // Saldo começa com 0.0
    }

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void efetuarDeposito(double valorDeposito) {
		
		saldo += valorDeposito;
	}
	
	public void efetuarSaque(double valorSaque) {
		
		saldo -= valorSaque+5;
		
	}
	
	
	public String toString() {
		return "Conta: "
				+ numeroDaConta
				+ ", " + "Nome: "
				+ nome
				+ "Saldo: "
				+ String.format(" %.2f",saldo);
	}
	
	
	
	
	

}
