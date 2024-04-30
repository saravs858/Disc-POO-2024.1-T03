package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = sc.nextInt();
		int x = verificar(num);
		if (x == 1) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
	}
	
	public static int verificar(int num) {
		if (num >= 0) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
}
