package vetores;

import java.util.Scanner;

public class Exercicoprp02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	

		System.out.println("Digite quantos n�meros voc� deseja digitar:");
		int num = sc.nextInt();
		int vet[] = new int[num];
		int cont = 0;
		for (int i = 0; i < num; i++) {
			System.out.println("Digite um n�mero:");
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < num; i++) {
			if (vet[i] % 2 == 0) {
				System.out.printf("%d ", vet[i]);
				cont++;

			}
		}
		System.out.println("");
		System.out.println(cont);
	}

}
