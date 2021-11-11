package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeir nota");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota:");
		double nota2 = sc.nextDouble();
		
		double notaf = nota1 + nota2;
		
		if (notaf >= 60) {
			System.out.printf("NOTA FINAL = %.1f%n", notaf);
		}
		else {
			System.out.printf("NOTA FINAL = %.1f%n", notaf);
			System.out.println("REPROVADO");
		}
		
	
		
	}

}
