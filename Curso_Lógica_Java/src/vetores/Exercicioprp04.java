package vetores;

import java.util.Scanner;

public class Exercicioprp04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos n�meros voc� pretende digitar:");
		int num= sc.nextInt();
		double vet[]= new double[num];
		double media=0;
		
		for(int i=0;i<num;i++) {
			System.out.println("Digite um n�mero:");
			vet[i]= sc.nextDouble();
			media = media + vet[i];
		}
		media = media /num;
		System.out.printf("%.2f\n",media);
		for(double s: vet) {
			if(s < media) {
				System.out.println(s);
			}
		}
	}

}
