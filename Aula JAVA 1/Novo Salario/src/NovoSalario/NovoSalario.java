package NovoSalario;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 Scanner leia = new Scanner(System.in);
     
     int salario,abono,Novosalario;
     
     System.out.println("Digite o valor do salario: ");
     salario = leia.nextInt();
     
     System.out.println("Digite o valor do abono: "); 
     abono = leia.nextInt();
     
     System.out.println("\n" + salario + "+" + abono + "=" + (salario + abono));
     
    
	}

}
