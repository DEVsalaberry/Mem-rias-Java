package GarbageEVetores;


import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {

		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	        int n;

	        System.out.print("Quantos valores vai ter cada vetor? ");
	        n = sc.nextInt();

	        double[] a = new double[n];
	        double[] b = new double[n];
	        double[] c = new double[n];

	        System.out.println("Digite os valores do vetor A:");

	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt(); // Use nextDouble() para ler números decimais
	        }

	        System.out.println("Digite os valores do vetor B:");

	        for (int i = 0; i < n; i++) {
	            b[i] = sc.nextInt(); // Use nextDouble() para ler números decimais
	        }

	        for (int i = 0; i < n; i++) {
	            c[i] = a[i] + b[i];
	        }

	        System.out.println("VETOR RESULTANTE:");

	        for (int i = 0; i < n; i++) {
	            System.out.printf("%.2f\n", c[i]); // Use "%.2f" para imprimir números decimais com 2 casas decimais
	        }
		sc.close();

	}

}
