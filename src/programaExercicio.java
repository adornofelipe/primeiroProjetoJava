public class programaExercicio {

    public static void main(String[] args) {
        // exercicio 1
        double nota1;
        nota1 = 7.5;

        double nota2;
        nota2 = 7.5;

        double media;
        media = (nota1 + nota2) /2;
        System.out.println("Sua media é " +media);

        //exercicio 2 exercicio teve correção o correto seria converter ja direto o double para int sem necessidade de criar outro
        double var1;
        var1= 1.0;
        int var2;
        var2 = 3;
        int var3;
        var3 = (int) (var1 + var2);
        System.out.println(var3);


        //exercicio 3
        char letra;
        letra ='f';
        String  palavra;
        palavra ="elipe";
        System.out.println(letra+palavra);

        //exercicio 4
        double precoProduto;
        int quantidade;
        precoProduto = 10.85;
        quantidade = 7;
        int valorTotal;
        valorTotal = (int) precoProduto * quantidade;
        System.out.println("O valor total em produtos é " + valorTotal);

        //exercicio 5 aqui eu errei era fazer a conversão direta
        double valorEmDolares;
        valorEmDolares = 100.50;
        double taxaDeConversao = 4.95;


        double reais;
        reais = valorEmDolares * taxaDeConversao;
        System.out.println("O valor em reais é " + reais) ;

        // exercicio 6
        double precoOriginal;
        precoOriginal = 80.75;
        double percentualDesconto;
        percentualDesconto = 10;
        double precoComDesconto;
        precoComDesconto = precoOriginal - percentualDesconto;
        System.out.println("Sua peça saiu com desconto no valor de " + precoComDesconto);

        double descontoCorreto = (percentualDesconto/100) * precoOriginal;
        double precoCorreto = precoOriginal - descontoCorreto;
        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + descontoCorreto);
        System.out.println("Novo preço com desconto: R$" + precoCorreto);



    }
}
