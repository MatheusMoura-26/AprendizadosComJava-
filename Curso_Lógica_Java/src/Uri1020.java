import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, periodo, resto, quociente;
		
		n = sc.nextInt();
		
		resto = n;
		periodo = 365;
		quociente = resto / periodo;
		System.out.println(quociente + " ano(s)");
		resto = resto % periodo ;
		
		periodo = 30;
		quociente = resto /periodo;
		System.out.println(quociente + " mes(es)");
		resto = resto % periodo;
		
		System.out.println(resto + " dia(s)");
		
		
		
		sc.close();

	}

}
