import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // exercicio 1
        System.out.println("Digite um numero");
        int numero = leitor.nextInt();
        if (numero > 0){
            System.out.println("numero positivo");
        }else {
            System.out.println("numero negativo");
        }

        //exercicio 2
        System.out.println("Digite um numero inteiro");
        int numero1 = leitor.nextInt();
        System.out.println("Digite outro numero inteiro");
        int numero2 = leitor.nextInt();

        if (numero1 == numero2){
            System.out.println("os numeros são iguais");
        } else if (numero1 > numero2) {
            System.out.println("o primeiro é maior");
        } else if (numero1 < numero2) {
            System.out.println("o segundo é maior");

        }

        //exercicio 3
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = leitor.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = leitor.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = leitor.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        //exercicio 4
        System.out.print("Digite um número: ");
        int tabuada = leitor.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(tabuada+ " x " + i + " = " + (tabuada * i));
        }

    }
}
