import java.util.Scanner;

public class Exercicio04 {
    public static Scanner Leia = new Scanner(System.in);

    public static void main(String[] args) {
        int idade, sexo, categoria, backend = 0, frontend = 0, mobile = 0, fullstack = 0;
        String continua = "S";

        while (continua.equals("S")) {

            System.out.println("Digite a sua idade: ");
            idade = Leia.nextInt();
            do {
                System.out.println("Digite o sexo (1-M/2-F/3-Outros: ");
                sexo = Leia.nextInt();
                if(sexo < 1 || sexo > 3)
                    System.out.println("Digite um número entre 1 e 3");
            }while(sexo < 1 || sexo > 3);
            System.out.println("Digite a sua categoria (1-backend/2-frontend/3-mobile/4-fullstack: ");
            categoria = Leia.nextInt();

            if (categoria == 1)
                backend++;

            if (categoria == 2 && sexo == 2)
                frontend++;

            if (categoria == 3 && sexo == 1 && idade > 40)
                mobile++;

            if ((categoria == 4 || sexo == 2) && idade < 30)
                fullstack++;

            System.out.println("Deseja continuar(S/N): ");
            Leia.skip("\\R?");
            continua = Leia.nextLine().toUpperCase();
        }

        System.out.println("\nTOtal de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("\nTOtal de mulheres desenvolvedoras frontend: " + frontend);
        System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
        System.out.println("\nTOtal de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstack);

    }

}
