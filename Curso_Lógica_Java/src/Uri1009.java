import java.util.Locale;
import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		double total = salario +  vendas *0.15;
		
		System.out.printf("TOTAL = %.2f%n", total);
		
		sc.close();

	}

}
