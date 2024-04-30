package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int num;
	    System.out.println("Digite um número de 1 a 9: ");
	    num = sc.nextInt();
	    if(num <1 || num>9){
	    System.out.println("Número inválido");
	    } else if (num >= 1 && num <= 9){
	      multiplicacao(num);
	   }
	  }
	  public static void multiplicacao(int num){
	    int i, j;
	    for(i = 1; i <= num; i++){
	      for(j = 1; j <= i; j++){
	        System.out.print(i * j + " ");
	      }
		System.out.println("");
	    }

	}

}
