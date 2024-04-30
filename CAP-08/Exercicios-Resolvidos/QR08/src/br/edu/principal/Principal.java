package br.edu.principal;

import java.util.Scanner;

import br.edu.subrotina.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial:");
        int h_i = sc.nextInt();

        System.out.println("Digite o minuto inicial:");
        int m_i = sc.nextInt();

        System.out.println("Digite a hora final:");
        int h_f = sc.nextInt();

        System.out.println("Digite o minuto final:");
        int m_f = sc.nextInt();

        int total = Rotina.calculo(h_i, m_i, h_f, m_f);
        System.out.println("O total de minutos é: " + total);

	}

}
