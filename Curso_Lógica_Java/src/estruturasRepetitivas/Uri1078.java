package estruturasRepetitivas;

import java.util.Scanner;

public class Uri1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para v� a sua tabuada:");
		int num = sc.nextInt();
		
		for(int i =1; i<=10; i++) {
			int produto = num *i;
			System.out.printf("%d X %d = %d\n",num,i,produto);
		
		}

	}

}
