package Nivel1;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

Entrada:12 1 5.30
16 2 5.10
Saida: VALOR A PAGAR: R$ 15.50
-------------------
Entrada: 13 2 15.30
161 4 5.20
Saida: VALOR A PAGAR: R$ 51.40
-------------------
Entrada:1 1 15.10
2 1 15.10
Saida: VALOR A PAGAR: R$ 30.20
 */
public class ExercicioValorPagar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int quantdade1 = sc.nextInt();
        double preco1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double total = (preco1 * quantdade1) + (preco2 * quantidade2);
        System.out.printf("VALOR A PAGAR = R$ %.2f%n" , total);
        sc.close();




    }
}
