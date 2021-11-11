package estruturacondicional;

import java.util.Scanner;

public class ApredendoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		
		System.out.println("Bom dia!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas?");
		int hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		
		else {
			if(hora < 18) {
				System.out.println("Boa tarde!");
			}
			else {
				System.out.println("Boa Noite!");
			}
		}
		
				
		sc.close();
	}

	}
