package estruturasRepetitivas;

import java.util.Scanner;

public class Uri10771 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros:");
		int y = sc.nextInt();
		int x = sc.nextInt();
		int max ;
		int min ;
		if (x > y) {
			 max = x;
			 min = y;
		}
		else {
			 max = y;
			min = x;			
		}
		int soma =0; 
		for (int i= min + 1; i < max; i++) {
			 if(i % 2 !=0) {
				 soma = soma + i;
			 }
		 }
		System.out.println(soma);
		}

}
