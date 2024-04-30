package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int[] x = new int[10]; 
		int[] y = new int[10];
		int[] u = new int[20];
		int[] d = new int[10];
		int[] s = new int[10];
		int[] p = new int[10];
		int[] it = new int[10];
		int i, j, k, contu = 0, contd = 0, conti = 0;
		
		for (i = 0; i < 10; i++) {
			System.out.println("Digite um número para a lista X:");
			x[i] = sc.nextInt();
			System.out.println("Digite um número para a lista Y:");
			y[i] = sc.nextInt();
		}
		
		for (i = 0; i < 10; i++) {
			j = 0;
			while (j < contu && x[i] != u[j]) {
				j++;
			}
			if (j >= contu) {
				u[contu] = x[i];
				contu++;
			}
		}
		
		for (i = 0; i < 10; i++) {
			j = 0;
			while (j < contu && y[i] != u[j]) {
				j++;
			}
			if (j >= contu) {
				u[contu] = y[i];
				contu++;
			}
		}
		
		System.out.println();
		
		System.out.println("A união das listas é: ");
		for (i = 0; i < contu; i++) {
			System.out.println(u[i]);
		}
		
		for (i = 0; i < 10; i++) {
			j = 0;
			while (j < 10 && x[i] != y[j]) {
				j++;
			}
			if (j >= 10) {
				k = 0;
				while (k < contd && x[i] != d[k]) {
					k++;
				}
				if (k >= contd) {
					d[contd] = x[i];
					contd++;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("A diferença das listas é: ");
		for (i = 0; i < contd; i++) {
			System.out.println(d[i]);
		}
		for (i = 0; i < 10; i++) {
			s[i] = x[i] + y[i];
			p[i] = x[i] * y[i];
		}
		System.out.println();
		
		System.out.println("A soma das listas é: ");
		for (i = 0; i < 10; i++) {
			System.out.println(s[i]);
		}
		System.out.println();
		
		System.out.println("O produto das listas é:");
		for (i = 0; i < 10; i++) {
			System.out.println(p[i]);
		}
		for (i = 0; i < 10; i++) {
			j = 0;
			while (j < 10 && x[i] != y[j]) {
				j++;
			}
			if (j < 10) {
				k = 0;
				while (k < conti && it[k] != x[i]) {
					k++;
				}
				if (k >= conti) {
					it[conti] = x[i];
					conti++;
				}
			}
		} System.out.println();
		
		System.out.println("A intersecção entre as listas é:");
		for (i = 0; i < conti; i++) {
			System.out.println(it[i]);
		}
	}

}