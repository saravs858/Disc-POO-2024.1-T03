package br.edu.principal;

import java.util.Scanner;

public class Principal {

		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Insira os segundos:");
		    int seg = sc.nextInt();
		    transfor(seg); // vai fazer oq tem dentro de "transfor" com o valor dado pelo usuário
		  }
		public static void transfor(int seg){
		  int h, m, s, r;
		  h = seg / 3600;
		  r = seg % 3600;
		  m = r / 60;
		  s = r % 60;
		  System.out.println("horas:"+ h + ",minutos:"+ m + " e segundos: "+ s);
	}
}

