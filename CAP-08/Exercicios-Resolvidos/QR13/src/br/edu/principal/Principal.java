package br.edu.principal;

import java.util.Scanner;

import subrotina.Rotina;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vet1[] = new int [10]; int vet2[] = new int [10];
		int x;
		
		System.out.println("Digite os números do primeiro vetor: ");
		for (x = 0; x < 10; x++) {
			vet1[x] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("Os fatoriais dos números digitados são: ");
		Rotina.fatoriais(vet1, vet2);
		for (x = 0; x < 10; x++) {
			System.out.println("vet2[" + x + "] = " + vet2[x]);
		}

	}

}
