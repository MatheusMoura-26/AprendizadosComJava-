import java.util.Scanner;

//Não esquecer de trocar o nome da çlasse para Main
public class Uri1007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int dif = (a * b) - (c * d);
		
		System.out.println("DIFERENCA = " + dif);
		
		sc.close();

	}

}
