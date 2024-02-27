package exercicios;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor para saber o sucessor: ");
		int valor1 = sc.nextInt();
		
		int resultado = valor1+1;
		
		System.out.println(" o sucessor do valor digitado é:  " +resultado);
		
		sc.close();
		
	}

}
