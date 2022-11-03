 import java.util.Arrays;
import java.util.Scanner;

    public class exercicio02 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            int n = 10;
            int v[] = new int[n];
            int i;
            int par = 0;
            int impar = 0;

            for (i = 0; i < n; i++) {
                System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
                v[i] = leia.nextInt();
                if (v[i] % 2 == 0) {
                    par = par + 1;
                } else {
                    impar = impar + 1;
                }
            }
            System.out.println("Você digitou os seguintes números: " + Arrays.toString(v));
            System.out.println("Total de números pares: " + par);
            System.out.println("Total de números ímpares: " + impar);
        }
}
