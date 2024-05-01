package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double[]temp=new double[12];
        String[]meses= {"JANEIRO","FEVEREIRO","MARÇO","ABRIL","MAIO","JUNHO","JULHO","AGOSTO","SETEMBRO","OUTUBRO","NOVEMBRO"
,"DEZEMBRO"};
        double maior=0,menor=0;
        int maiormes=0,menormes=0;

        for(int i=0;i<temp.length;i++) {
                System.out.println("Digite a temperatura media do mês "+meses[i]+":");
                temp[i]=sc.nextDouble();

                if(i==0) {
                        maior = temp[i];
                        menor = temp[i];
                        maiormes = i;
                        maiormes = i;
                }else {
                        if(temp[i]>maior) {
                          maior = temp[i];
                          maiormes = i;
                        }
                if(temp[i]<menor) {
                  menor = temp[i];
                  menormes = i;
                }
                }
        }
        System.out.println("A maior temperatura do ano foi "+maior+" em "+ meses[maiormes]);
        
        System.out.println("A menor temperatura do ano foi "+menor+" em "+ meses[menormes]);;
        
    


}
	
}