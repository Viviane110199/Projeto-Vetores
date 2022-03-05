//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

package exercicio.vetor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int []vetor;
		int maior = 0;
		
		vetor = new int[5];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i+1) + "º valor: ");
			vetor[i] = new Scanner(System.in).nextInt();
			
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		
		System.out.println("O maior valor é: " + maior);
		System.out.println(" ");
	}

}

