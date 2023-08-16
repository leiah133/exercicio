/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
Entrada: 25, 100, 5.50
Saida:NUMBER = 25
SALARY = U$ 550.00
-------------------
Entrada: 1, 200, 20.50
Saida: NUMBER = 1
SALARY = U$ 4100.00
-------------------
Entrada:6, 145, 15.55
Saida:NUMBER = 6
SALARY = U$ 2254.75
 */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioHorasTrabalhadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeros = sc.nextInt();
        int horas = sc.nextInt();
        double  valorHora = sc.nextDouble();
        double salario = valorHora * horas;

        System.out.println("NUMBER = " + numeros);
        System.out.printf("SALARY = U$ %.2f%n" , salario);
sc.close();


    }
}
