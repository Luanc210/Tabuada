package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha entre 0 e 10 da tabuada: ");
		int x = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int soma = x * i;
			
			System.out.println(x + " x " + i + " = " + soma);
		}
		
		sc.close();
	}

}
