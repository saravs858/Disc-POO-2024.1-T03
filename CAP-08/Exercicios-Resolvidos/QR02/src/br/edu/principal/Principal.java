package br.edu.principal;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int soma = somarentre(num1, num2);
		
		System.out.println(soma);
		
	}
	public static int somarentre(int a, int b) {
		int soma = 0;
		for (int i = a+1; i <= b-1; i++ ) {
			soma = soma + i;
		}
		return soma;
	}

}
