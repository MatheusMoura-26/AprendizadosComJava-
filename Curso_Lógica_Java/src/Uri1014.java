import java.util.Locale;
import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		int x;
		double y, resut;
		
		x = sc.nextInt();
		y = sc.nextDouble();
		
		resut = x / y;
		
		System.out.printf("%.3f km/l%n",resut);
		
		sc.close();

	}

}
