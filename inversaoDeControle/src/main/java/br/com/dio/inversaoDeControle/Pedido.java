package br.com.dio.inversaoDeControle;

public class Pedido {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.gravarInformacoes();


    }

    private EnviarEmails enviar;

    public void gravarInformacoes(){
        this.enviar = new EnviarEmails("stmp", "contato@dio.com.br", "123456");
        this.enviar.retornar("Pedido criado!!");
    }
}
