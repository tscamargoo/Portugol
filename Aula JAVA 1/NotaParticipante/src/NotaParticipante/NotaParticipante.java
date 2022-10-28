package NotaParticipante;

import java.util.Scanner;

public class NotaParticipante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 Scanner leia = new Scanner(System.in);
	     
	     float n1, n2, n3, n4,nfinal;
	     
	     System.out.println("Digite a n1: ");
	     n1 = leia.nextInt();
	     
	     System.out.println("Digite a n2: ");
	     n2 = leia.nextInt();
	     
	     System.out.println("Digite a n3: ");
	     n3 = leia.nextInt();
	     
	     System.out.println("Digite a n4: ");
	     n4 = leia.nextInt();
	     
	  nfinal = ((n1+n2+n3+n4)/4);
	  
	  System.out.println("Media Final: " + nfinal);
	} 

}
