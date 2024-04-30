package br.edu.subrotina;

public class Rotina {

	public static double calcula_media(double n1, double n2, double n3, String l) {
        double media;
        if (l.equals("A")) {
            media = (n1 + n2 + n3) / 3;
        } else {
            media = (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
        }
        return media;        
	}
}
