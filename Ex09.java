package exercicios;
import java.util.Scanner;
public class Ex09 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Queremos descobrir area do QUADRADO");
		
		System.out.println("Digite o tamanho do lado para descobrir a area do quadrado");
		
		double lado = sc.nextDouble();
		
		double resultado = Math.pow(lado, 2);
		
		System.out.println("A area do QUADRADO " + resultado);
		
		
		sc.close();
		
	}
}
