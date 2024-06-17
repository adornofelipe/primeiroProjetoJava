import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // declarando variaveis aqui
        String nome = "Felipe Oliveira Adorno";
        String tipoConta = "Corrente";
        double saldoConta= 2500.00;

        int escolha = 0;

        String quebraLinha = """
                 \s
                """;
        Scanner leitor = new Scanner(System.in);
        String dadosInicias = """
               ********************************************
                Dados inicias do cliente:
               \s
               Nome:         \s """+ nome+ """
                \s
               Tipo conta:   \s """+ tipoConta+ """
                \s
               Saldo inicial: R$"""+ saldoConta+"""
                 \s
               ********************************************
               """;
            System.out.println(dadosInicias);


        while (escolha != 4) {
            System.out.println("-----Operações-----");
            System.out.println("1. Consultar saldos");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir Valor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = leitor.nextInt();

            if (escolha == 1) {
                System.out.print("Saldo em conta: "+saldoConta + quebraLinha+ quebraLinha
                        );
            } else if (escolha == 2) {
                System.out.println("Digite o valor recebido");
                double valorRecebido = leitor.nextDouble();
                saldoConta+=valorRecebido;
                System.out.println("Seu saldo atualizado:  "+ saldoConta+ quebraLinha);
            } else if (escolha == 3) {
                System.out.println("Digite o valor a transferir");
                double valorEnviado = leitor.nextDouble();
                if(valorEnviado>saldoConta){
                    System.out.println("Não ha saldo na conta");

                } else{
                    saldoConta-=valorEnviado;
                System.out.println("Seu saldo atualizado:  "+saldoConta+quebraLinha);}
            } else if (escolha == 4){
                System.out.println("Sistema encerrado.");
                break;
            }
            else if (escolha !=1 ||escolha !=2 ||escolha !=3 || escolha !=4) {
                System.out.println("Opção digitada não é valida.");

            }
        }

    }
}
