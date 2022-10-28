package inteiros;

import java.util.Scanner;

public class Inteiros {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner (System.in);
		int valor[] = new int[3];
		int maior = 0, menor = 0; 
		
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = leia.nextInt();
			if(valor[i] > maior){ 
				maior = valor[i];
			}
		}
		for (int j = 1; j < valor.length; j++) {
			if(valor[j] < menor){
				menor = valor[j];
			}
		}
		System.out.println("Maior valor = "+ maior);
		
}

}