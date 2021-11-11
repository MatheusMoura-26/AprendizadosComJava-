package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de pessoas que iram ser registradas:");
		int num = sc.nextInt();
		String nome[]= new String[num];
		int idade[]= new int [num];
		double altura[]= new double [num];
		double soma=0;
		int menor= 0;
		for (int i=0;i<num;i++) {
			System.out.println("Digite o seu nome:");
			nome[i]= sc.next();
			System.out.println("Digite sua idade:");
			idade[i]= sc.nextInt();
			System.out.println("Digite sua altura:");
			altura[i]= sc.nextDouble();
			soma = soma + altura[i];
			if(idade[i] < 16) {
				menor= menor + 1; 
			}
		}
		soma = soma /num;
		System.out.println("média:" + soma);
		menor = (menor *100)/ num ;
		System.out.println("Pessoas com menos de 16 anos "+menor + "%");
		sc.close();
	}

}
