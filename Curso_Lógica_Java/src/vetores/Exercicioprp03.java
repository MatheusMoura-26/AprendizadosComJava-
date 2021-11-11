package vetores;

import java.util.Scanner;

public class Exercicioprp03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("DIgite quantos números voc~e ira digitar:");
		int quant = sc.nextInt();

		int A[] = new int[quant];
		int B[] = new int[quant];
		int C[] = new int[quant];

		for (int i = 0; i < quant; i++) {
			System.out.println("Digite um número para o vetor A:");
			A[i] = sc.nextInt();
			System.out.println("Digite um número para o vetor B:");
			B[i] = sc.nextInt();
			C[i] = A[i] + B[i];
		}
		for (int s : C) {
			System.out.println(s);
		}
	}

}
