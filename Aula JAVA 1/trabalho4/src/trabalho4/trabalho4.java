package trabalho4;

import java.util.Scanner;

public class trabalho4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int numero1, numero2, numero3, numero4, diferenca;
   
   Scanner leia = new Scanner(System.in);
   
   System.out.print("Diite o primeiro valor: ");
   numero1 = leia.nextInt();
   
   System.out.print("Diite o segundo valor: ");
   numero2 = leia.nextInt();
   
   System.out.print("Diite o terceiro valor: ");
   numero3 = leia.nextInt();
   
   System.out.print("Diite o quarto valor: ");
   numero4 = leia.nextInt();
   
   diferenca = (numero1*numero2)-(numero3*numero4);
   
   System.out.println("O valor da diferenca é: " + diferenca);
   
	}

}
