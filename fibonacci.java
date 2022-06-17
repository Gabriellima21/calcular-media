package sequencia;

import java.util.Scanner;


public class fibonacci {

	public static void main(String[] args) {
	int n1;
	int n2 = 0;
	int soma;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe um número: ");
	
	n1 = input.nextInt();

	
	for (int i=0; i<19; i++) {
		System.out.println(n1);
		soma = n1;
		n1 = n1 + n2;
		n2 = soma;
		
	}
	
	
	
	
	
	}

}
