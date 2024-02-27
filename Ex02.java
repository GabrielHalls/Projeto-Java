package exercicios;
import java.util.Scanner;
public class Ex02 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos descobrir qual é o antecessor do numero digitado");
		
		System.out.println("Digite um valor de entrada");
		int valor = sc.nextInt();
		
		int resultado = valor-1;
		
		System.out.println("O número antecessor do valor digitado é : " +resultado);
		
		
		sc.close();
	}

}
