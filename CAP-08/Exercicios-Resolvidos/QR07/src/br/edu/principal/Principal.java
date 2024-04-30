package br.edu.principal;

import java.util.Scanner;
import br.edu.subrotina.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3;
		
        System.out.println("Digite a 1ª nota:");
        n1 = sc.nextDouble();

        System.out.println("Digite a 2ª nota:");
        n2 = sc.nextDouble();

        System.out.println("Digite a 3ª nota:");
        n3 = sc.nextDouble();

        System.out.println("Digite 'A' para média aritmética ou 'P' para média ponderada:");
        String l = sc.next();

        double media = Rotina.calcula_media(n1, n2, n3, l);
        System.out.printf("A média é %.2f %n ", media);
    }
}


