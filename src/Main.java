import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");


        int ano = 2022;
        System.out.println("Filme: Top Gun: Maverick: "+ (ano));
        boolean incluidoNoPlano = true;
        // media calculada atravês das 3 notas de alunos
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);
        String previa;
        previa = """
                Ola essa apresentação é sobre o filme
                A previa é uma parte inicial ou de um todo porem resumida
                a data de lançamento da previa foi """ + ano;
        System.out.println(previa);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);



    }
}