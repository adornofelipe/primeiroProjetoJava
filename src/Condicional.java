public class Condicional {
    public static void main(String[] args) {
        int ano = 2020;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";
        if(ano >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else  {
            System.out.println("Filme antigo");
        }
        // uitlizando o ou com || fica la na barra com shift pra usar rs
        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve alterar assinatura");
        }
        // aqui usando o && para que fique igual
        if(incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme liberado 1");
        }else{
            System.out.println("Deve alterar assinatura 2");
        }



    }
}
