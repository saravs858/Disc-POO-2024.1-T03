package br.edu.principal;

import java.util.Scanner;

import subrotina.Rotina;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int [5]; int x;
		
		System.out.println("Digite 5 números reais: ");
		for (x = 0; x < 5; x++) {
			vet[x] = sc.nextInt();
		}
		System.out.println();
		
		Rotina.ordena(vet);
		System.out.println("Os números ordenados de forma crescente são: ");
		for (x = 0; x < 5; x++) {
			System.out.println(vet[x]);
		}

	}

}
