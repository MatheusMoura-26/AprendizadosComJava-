package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite Quantos números vcs querem Digitar:");
		int num = sc.nextInt();
		double vet[]= new double[num];
		double soma = 0;
		for(int i =0; i<num;i++) {
			System.out.println("Digite um número:");
			vet[i]= sc.nextDouble();
			soma = soma + vet[i];
		}
		double media = soma /num;
		for (int i = 0; i<num;i++) {
			System.out.print(vet[i]+ " ");
		}
		System.out.println("");
		System.out.println(soma);
		System.out.println(media);
	}

}
