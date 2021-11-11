import java.util.Locale;
import java.util.Scanner;

public class ExercicioU04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.next(); 
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		// como as idades foram colocadas como numeros inteiros, fazer casting ou tranformar o número divisor em decimal.
		double media =(double) (idade1 + idade2) / 2;
		
		System.out.printf("A idade média entre  %s e %s É %.1f ", nome1, nome2, media);
		
		
		
		sc.close();
	}

}
