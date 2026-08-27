package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;
public class ExercicioValorPagar5  {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int  codPeca1, numPeca1, codPeca2, numPeca2;
        double valorPeca1, valorPeca2, total;
        codPeca1 =sc.nextInt();
        numPeca1 =sc.nextInt();
        valorPeca1 =sc.nextDouble();

        codPeca2 =sc.nextInt();
        numPeca2 =sc.nextInt();
        valorPeca2 =sc.nextDouble();

        total = valorPeca1 * numPeca1 + valorPeca2 * numPeca2;
        System.out.printf("VALOR A PAGAR = R$%.2f%n", total);
        sc.close();
    }
}
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