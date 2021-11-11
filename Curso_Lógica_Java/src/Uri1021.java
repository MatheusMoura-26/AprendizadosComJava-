import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N;
		int quociente, resto, nota, moeda;
		
		N = sc.nextDouble();
		
		resto =(int) N;
		
		nota = 100;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$" + nota + ",00");
		resto = resto % nota;
		
		nota = 50;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$" + nota + ",00");
		resto = resto % nota;
		
		nota = 20;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$" + nota + ",00");
		resto =  resto % nota;
		
		nota = 10;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$" + nota + ",00");
		resto = resto % nota;
		
		nota = 5;
		quociente =resto / nota;
		System.out.println(quociente + " nota(s) de R$" + nota + ",00");
		resto = resto  % nota;
		
		nota = 2;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$" + nota + ",00");
		resto = resto % nota;
		
		//resto = (double) resto; 
		
		
		
		sc.close();

	}

}
