package Aula4;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        boolean validador = false;
        int[] vetorNumero = new int[] {2,5,1,3,4,9,7,8,10,6};
        System.out.println("Digite um número para pesquisar: ");
        numero = leia.nextInt();

        for (int index =0 ; index < vetorNumero.length ; index ++)
        {
            if (vetorNumero[index]== numero)
            {
                System.out.println("O número "+numero+" está localizado na posição: "+index);
                validador = true;

            }

        }
        if ( validador == false)
            System.out.println("O número "+numero+" não foi encontrado!");
    }
}