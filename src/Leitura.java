import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Avalie seu filme de 0 a 10");
        double  avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        if(filme.equals("Boyz in the hood") || filme.equals("O Show de Truman")){
            System.out.println("eu endureço");

        }else{
            System.out.println("Flacido");
        }
    }
}
