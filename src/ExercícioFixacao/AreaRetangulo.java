package ExercícioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;

        System.out.println("A área do retângulo é: " + area);


    }
}
