import models.GerenciadorElementos;
import models.Circulo;
import models.Quadrilatero;
import models.Triangulo;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GerenciadorElementos gerenciador = new GerenciadorElementos();

        System.out.println("Digite os 3 lados do Triangulo: ");
        Triangulo t1 = new Triangulo(input.nextDouble(), input.nextDouble(), input.nextDouble());
        gerenciador.ObterInformacoes(t1);

        System.out.println("Digite o raio do Circulo: ");
        Circulo c1 = new Circulo(input.nextDouble());
        gerenciador.ObterInformacoes(c1);

        System.out.println("Digite os 2 lados do Quadrilátero: ");
        Quadrilatero q1 = new Quadrilatero(input.nextDouble(), input.nextDouble());
        gerenciador.ObterInformacoes(q1);





    }
}
