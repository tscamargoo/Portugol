package snippet;

public class Snippet {
	 Scanner leia = new Scanner(System.in);
	     
	     int nota1, nota2, nota3, nota4;
	     
	     System.out.println("Digite a nota1: ");
	     nota1 = leia.nextInt();
	     
	     System.out.println("Digite a nota2: ");
	     nota2 = leia.nextInt();
	     
	     System.out.println("Digite a nota3: ");
	     nota3 = leia.nextInt();
	     
	     System.out.println("Digite a nota4: ");
	     nota4 = leia.nextInt();
	     
	     System.out.println("\n" + nota1 + "+" + nota2 + "+" + nota3 + "+" + nota4 + "=" + (nota1 + nota2 + nota3 + nota4));
	     
	}
}

