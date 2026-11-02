package testesJava1;
import java.util.Scanner;
public class impares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int TAM = 10;
        int a[], b[], j=0;
        a = new int[TAM];
        b = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o valor do elemento " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            }
        }

        for (int i = 0; i < TAM; i++) {
            if (a[i] % 2 != 0) {
                b[j] = a[i];
                j++;
            }
        }

        System.out.println("");
        System.out.println("b[");
        for (int i = 0; i < TAM; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("]");
    }
}
