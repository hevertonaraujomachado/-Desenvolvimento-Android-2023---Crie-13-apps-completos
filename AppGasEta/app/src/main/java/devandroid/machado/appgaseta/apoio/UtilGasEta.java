package devandroid.machado.appgaseta.apoio;

public class UtilGasEta {

    public void metodoEstatico(){}
    public static void metodoNaoEstatico(){}

    public static String mensagem(){
        return "Qualquer mensagem...";
    }

    public static double preço(){
        return 9.99;
    }

    public static String calculadorarMelhorOpcao(double gasolina, double etanol) {
        // preço da gasolina: R$ 5,79
        // preço do etanol: R$ 4,14

        // preco ideal = gasolina * 0,70 = R$ 3,548

        double precoIdeal = gasolina * 0.70;
        String mensagemDeRetorno;

        if (etanol <= precoIdeal) {
            mensagemDeRetorno = "Abastecer com Etanol";
        } else {
            mensagemDeRetorno = "Abastecer com Gasolina";


        }

        return mensagemDeRetorno;
    }
}
