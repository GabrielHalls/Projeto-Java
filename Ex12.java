package exercicios;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Vamos decobrir a area de um CIRCULO");
		
		System.out.println("Digite o tamanho do RAIO");
		float raio = sc.nextFloat();
		
		double PI = Math.PI;
		
		double resultado = PI * Math.pow(raio, 2);
		
		
		System.out.println("A área do círculo  " + resultado + "m²" );
		
		sc.close();
		
	}

}
