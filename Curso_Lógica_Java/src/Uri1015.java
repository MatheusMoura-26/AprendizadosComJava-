import java.util.Locale;
import java.util.Scanner;

//N�o esquecer de trocar o nome da �lasse para Main
public class Uri1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, distancia;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("%.4f%/n",distancia);
		
		
		sc.close();
	}

}
