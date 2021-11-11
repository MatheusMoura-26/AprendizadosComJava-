import java.util.Locale;
import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double  n = 3.14159;
		double a =  n * Math.pow(raio, 2.0);
		
		System.out.printf("A=%.4f%n",a);
				
		sc.close();
	}

}
