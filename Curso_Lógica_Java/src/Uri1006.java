import java.util.Locale;
import java.util.Scanner;

//N�o esquecer de trocar o nome da �lasse para Main
public class Uri1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double media = (a * 2 + b * 3 + c *5) / 10;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();

	}

}
