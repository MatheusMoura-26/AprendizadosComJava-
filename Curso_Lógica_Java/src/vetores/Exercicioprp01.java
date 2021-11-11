package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicioprp01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos números você pretende digitar:");
		int quant= sc.nextInt();
		double vet []= new double[quant];
		
		for(int i=0;i<quant;i++) {
			System.out.println("Digite o número:");
			vet[i]= sc.nextDouble();
		}
		double maior=0;
		int pos=0;
		for(int i=0;i<quant;i++) {
			if(vet[i]>maior) {
				maior = vet[i];
				pos = i;		
			}
		}
		
		System.out.println(maior);
		System.out.println(pos);
		sc.close();
	}

}
