package vetores;

import java.util.Scanner;

public class ParaCada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de pessoas que serão cadastradas:");
		int n = sc.nextInt();
		String nome[]= new String[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("Digite o seu nome:");
			nome[i]= sc.next();
		}
		
		for(String s: nome) {
			System.out.println(s);
		}
		
sc.close();
	}

}
