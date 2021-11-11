package vetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos números seram digitados");
		int N = sc.nextInt();
		
		int vet []= new int[N];
		for(int i = 0; i<N; i++) {
			System.out.println("Digite um número inteiro");
			vet[i]= sc.nextInt();
		}
		
		for(int i =0;i<N;i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		sc.close();
	}

}
