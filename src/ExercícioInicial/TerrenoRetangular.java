// Fazer um programa para ler as medidas da largura e comprimento de um terrreno retangular com uma casa ddecimal. Em seguida, o programa deve mostrar o valor da area do rerreno bem como o valor do preço do terreno, amnos com duas casas decimais conforme exemplo
// entrada: 10.0 | 30.0 | 200.0 -> saida: AREA = 300.0 | PRECO = 600000.00


package ExercícioInicial;


import java.util.Locale;
import java.util.Scanner;

public class TerrenoRetangular {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
        System.out.println("QUAL A LARGURA?");
        double largura =   sc.nextDouble();
        System.out.println("QUAL COMPRIMENTO?");
        double comprimento =   sc.nextDouble();
        System.out.println("QUAL VALOR DO METRO QUADRADO?");
        double valorMetroQuadrado= sc.nextDouble();
        double area = largura * comprimento;
        double preco = area * valorMetroQuadrado;

        System.out.printf("AREA: %.2f%n", area);
        System.out.printf("PRECO: %.2f%n", preco);

        sc.close();

    }

}
