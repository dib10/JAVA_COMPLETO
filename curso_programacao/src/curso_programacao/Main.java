package curso_programacao;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 10.35784;
		
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.print("Resultado = " + x + " Metros");

	}

}
