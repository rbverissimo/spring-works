package br.com.dio.inversaoDeControle;

public class Pedido {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.gravarInformacoes();


    }

    final private EnviarEmails enviar = EnviarEmails.obterDadosEmails();

    public void gravarInformacoes(){
        this.enviar.retornar("Pedido criado!!");
    }
}
