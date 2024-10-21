/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.


Entrada: 3.0 4.0 5.2
Saida: TRIANGULO: 7.800
CIRCULO: 84.949
TRAPEZIO: 18.200
QUADRADO: 16.000
RETANGULO: 12.000
-------------------------------
Entrada: 12.7 10.4 15.2
Saida: TRIANGULO: 96.520
CIRCULO: 725.833
TRAPEZIO: 175.560
QUADRADO: 108.160
RETANGULO: 132.080
 */


import java.util.Locale;
import java.util.Scanner;

public class ExercicioArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangulo = A * C / 2.0;
        double circulo= 3.14159 * C * C;
        double trepazio = (A + B) / 2.0 * C;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n ", circulo);
        System.out.printf("TREPAZIO: %.3f%n", trepazio);
        System.out.printf("QUADRADO: %.3f%n ", quadrado);
        System.out.printf("RETÂNGULO: %.3f%n", retangulo);
    }
}
