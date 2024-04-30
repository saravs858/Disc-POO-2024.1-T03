package br.edu.principal;

import java.util.Scanner;

import subrotina.Rotina;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vet1[] = new int [10]; int vet2[] = new int [10]; int vet3[] = new int [20];
		int x, cont;
		
		for (x = 0; x < 10; x++) {
			do {
				System.out.println("Digite um número positivo para vet1[" + x + "]: ");
				vet1[x] = sc.nextInt();
			} while(vet1[x] < 0);
		}
		System.out.println();
		
		System.out.println("Caso digite algum número repetido o valor será retirado da união dos vetores.");
		for (x = 0; x < 10; x++) {
			do {
				System.out.println("Digite um número positivo para vet2[" + x + "]: ");
				vet2[x] = sc.nextInt();
			} while(vet2[x] < 0);
		}
		System.out.println();
		
		cont = Rotina.uniao(vet1, vet2, vet3);
		x = 0;
		
		System.out.println("A união dos 2 vetores é: ");
		while (x < 20) {
			System.out.println("vet3[" + x + "] = " + vet3[x]);
			x++;
		}

	}

}
