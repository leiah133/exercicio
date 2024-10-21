package Nivel1;/*
Descrição do exercicio:
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Exemplos:
Entrada: 10, 30
Saida: SOMA = 40
---------------------
Entrada: -30, 10
 Saída: SOMA = -20
 ------------------
Entrada: 0, 0
SOMA =  0
 */

import java.util.Scanner;

public class ExercicioSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1= sc.nextInt();
        int numero2 =  sc.nextInt();

         int soma = numero1 + numero2;

         System.out.println("Soma = " + soma);
    sc.close();
    }
}
