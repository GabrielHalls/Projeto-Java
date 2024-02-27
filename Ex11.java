package exercicios;
import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Queremos descobrir a area de um TRÁPEZIO");
		
		System.out.println("Digite base MAIOR para descobrir a area do trapezio");
		float maior = sc.nextFloat();
		
		
		System.out.println("Digite base MENOR para descobrir a area do trapezio");
		float menor = sc.nextFloat();
		
		System.out.println("Digite base altura para descobrir a area do trapezio");
		float altura = sc.nextFloat();
		
		float resultado = (maior+menor)*altura/2;
		
		System.out.println("A area dp TRAPÉZIO é: " +resultado);
		
		sc.close();
		
	}

}
