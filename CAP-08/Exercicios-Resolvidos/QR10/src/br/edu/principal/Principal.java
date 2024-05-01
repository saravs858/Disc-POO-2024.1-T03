package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num;
        double s;
        System.out.println("Digite um numero inteiro positivo: ");
        num=sc.nextInt();
        if(num<=0) {
                System.err.println("O número digitado nao é positivo.");
        }else {
        s=sequencia(num);
        System.out.println("A sequencia é "+s);
        }
}
    public static double sequencia(int n) {
        double seq;
        int a,b,f;
        seq=1;

                for (a =1;a<=n;a++) {
                          f=1;
                        for(b=1;b<=a;b++) {
                                f*=b;
                        }
                        seq+=1.0/f;
                }
                return seq;


	}

}
