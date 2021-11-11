import java.util.Scanner;

public class Uri1013 {

	//Não esquecer de trocar o nome da çlasse para Main
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, k, t;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		k = (x + y + Math.abs(x - y)) / 2;
		t = (x + z + Math.abs(x - z)) / 2;
		
		System.out.println(t + " eh o maior");
		
		
		
		sc.close();
	}

}
