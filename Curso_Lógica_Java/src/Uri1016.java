import java.util.Locale;
import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, resultado;
		
		n = sc.nextInt();
		
		resultado = n * 2;
		
		System.out.println(resultado + " minutos");
		
		sc.close();

	}

}
