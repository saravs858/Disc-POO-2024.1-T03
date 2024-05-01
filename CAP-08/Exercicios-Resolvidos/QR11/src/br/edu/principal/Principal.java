package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String sexo[]=new String[5];
        String olhos[]=new String[5];
        String cabelos[]=new String[5];
        int idade[]=new int[5];
        double m;
        int i,q;
        leitura(sexo,olhos,cabelos,idade);
        m=mediaIdade(olhos,cabelos,idade);
        System.out.println("A média de idade das pessoas que possuem olhos castanhos e cabelos pretos é "+ m);
        i=maiorIdade(idade);
        System.out.println("A maior idade dentre os 5 habitantes é "+i);
        q=qtIndividuos(sexo,olhos,cabelos,idade);
        System.out.println("A quantidade de pessoas do sexo feminino que tem entre 18 e 35 anos e possuem olhos azuis e cabelo louros é "+q+" pessoas");
}
public static void leitura(String[] sexo, String[] olhos, String[] cabelos, int[] idade) {
           Scanner sc = new Scanner(System.in);
           for(int x = 0;x<5;x++) {
                  System.out.println("Qual o seu gênero? (M-MASCULINO e F-FEMININO) habitante "+(x+1));
                  sexo[x]=sc.next();

                  while((sexo[x]=="M")||(sexo[x]=="F"));{
                         do {
                                 System.out.println("Qual a cor dos seus olhos?(A=azuis e C=castanhos)habitante "+(x+1));
                                 olhos[x]=sc.next();
                         }
                         while((olhos[x]=="A")||(olhos[x]=="C"));{
                                     do {
                                            System.out.println("Qual a cor do  seu cabelo?(L=LOURO; P=PRETO e C=CASTANHOS) habitante "+(x+1));
                                        cabelos[x]=sc.next();
                                     }
                                     while((cabelos[x]=="L")||(cabelos[x]=="C")||(cabelos[x]=="P"));{
                                                    System.out.println("Qual sua idade? habitante "+(x+1));
                                                    idade[x]= sc.nextInt();
                                     }
                         }
                  }
                  
           }
}
                public static double mediaIdade(String olhos[],String cabelos[],int idade[]) {
                        int i,cont=0,soma=0;
                        double media=0.0;
                        for(i=0;i<5;i++) {
                                if((olhos[i].equals("C"))&&(cabelos[i].equals("P"))){
                                        soma+=idade[i];
                                        cont+=1;
                                }
                        }
                        if(cont==0) {
                                media=0;
                        }else {
                                media=soma/cont;
                        }
                        return media;
                }
                public static int maiorIdade(int[] idade) {
                        int i, maior = 0;
                        for(i=0;i<5;i++) {
                                if(i==1) {
                                        maior=idade[i];
                                }else {
                                        if(idade[i]>maior) {
                                                maior=idade[i];
                                        }        
                                }
                        }
                        return maior;
                }
                public static int qtIndividuos(String[] sexo,String[] olhos, String[]cabelos,int[]idade) {
                        int qtd=0,i;
                        for(i=0;i<5;i++) {
                                if((sexo[i].equals("F"))&&(idade[i]>=18 && idade[i]<=35)&&(olhos[i].equals("A"))&&(cabelos[i].equals("L"))) {
                                        qtd+=1;
                                }

                        }
                        return qtd;
   
	}

}
