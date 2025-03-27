package vet_ex1;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Configura o scanner e o locale para usar ponto ao invés de vírgula
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de números
        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidade_numeros = sc.nextInt();

        // Criando objeto
        Numeros numeros = new Numeros(quantidade_numeros);

        // Lê os números e adiciona ao array
        for (int i = 0; i < quantidade_numeros; i++) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            numeros.adicionarNumero(i, numero); // Adiciona o número ao array
        }

        // Imprimir
        numeros.imprimirNeg();

        sc.close();
    }
}
