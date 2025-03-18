package aula73_fixacao;

public class CurrencyConverter {
	
	private static final double IOF = 0.06;
	
	public static double ConverterReais(double valorDolar, double cotacaoDolar) {
		
		return valorDolar * cotacaoDolar * (1+IOF);
		
		
	}
	
	
	

}
