package aula73_fixacao;

public class CurrencyConverter {
	
	private static final double IOF = 0.06;
	
	public static double ConverterReais(double valorDolarCompra, double cotacaoDolar) {
		
		return valorDolarCompra * cotacaoDolar * (1+IOF);
		
		
	}
	
	
	

}
