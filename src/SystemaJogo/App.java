package SystemaJogo;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Digite quantos lados tem o dado:");
        int lado = ler.nextInt();

        System.out.println("Digite qunatas vezes voce quer jogar:");
        int vezes = ler.nextInt();

        int soma = 0;
            for (int i = 0; i < vezes; i++) {
                int numero = rd.nextInt(lado) + 1;

                soma += numero;
                System.out.println(numero);
            }

        System.out.println("a quantidade da soma é: " + soma);

    }
}

