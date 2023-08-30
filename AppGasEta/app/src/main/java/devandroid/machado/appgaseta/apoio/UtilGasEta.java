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
