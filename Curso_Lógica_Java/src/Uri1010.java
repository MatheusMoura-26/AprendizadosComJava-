import java.util.Locale;
import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, quant1, quant2;
		double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		quant1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = quant1 * preco1 + quant2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
		
		sc.close();
	}

}
