package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (a < 1) {
			System.out.println("Digite o valor de a");
			a = sc.nextInt();
		} 
		System.out.println("Digite o valor de b");
		int b = sc.nextInt();
		System.out.println("Digite o valor de c");
		int c = sc.nextInt();
		int soma = divisores(a,b,c);
		System.out.println(soma);
	}
	
	public static int divisores(int a,int b, int c) {
		int soma = 0;
		for (int i = b; i <= c; i++) {
			if (i%a == 0) {
				soma = soma + i;
			} 
		}
		return soma;
		
	}

}
