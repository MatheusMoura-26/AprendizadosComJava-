package vetores;

import java.util.Scanner;

public class Exercicioprp07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos foram cadastrados");
		int alunos= sc.nextInt();
		String nomes[]= new String[alunos];
		double nota1[]= new double[alunos];
		double nota2[]= new double[alunos];
		double media[]= new double[alunos];
		
		for(int i=0;i<alunos;i++) {
			System.out.println("Digite o nome do aluno:");
			nomes[i]= sc.next();
			System.out.println("Digite a primeira nota:");
			nota1[i]= sc.nextDouble();
			while(nota1[i]< 0 || nota1[i]> 10 ) {
				System.out.println("nota inválida");
				System.out.println("Digite a primeira nota:");
				nota1[i]= sc.nextDouble();
			}
			System.out.println("Digite a segunda nota");
			nota2[i]= sc.nextDouble();
			while(nota2[i]< 0 || nota2[i]> 10 ) {
				System.out.println("nota inválida");
				System.out.println("Digite a segunda nota:");
				nota2[i]= sc.nextDouble();
			}
			media[i]= (nota1[i]+nota2[i])/2;
			
		}
		for(int i =0;i<alunos;i++) {
			if(media[i]>=6) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
