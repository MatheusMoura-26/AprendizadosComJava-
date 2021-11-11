package vetores;

import java.util.Scanner;

public class Exercicioprp06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas pessoas seram cadastradas");
		int num = sc.nextInt();
		String nome[]= new String[num];
		int idade[]= new int[num];
		int maiorIdade= 0;
		int cont=0;
		for(int i =0;i<num;i++) {
			System.out.println("Digite o nome da pessoa:");
			nome[i]= sc.next();
			System.out.println("Qual a idade de "+nome[i]);
			idade[i]= sc.nextInt();
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				cont = i;
			}
		}
		System.out.println(nome[cont]);
	}

}
