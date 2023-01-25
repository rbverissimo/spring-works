package br.com.dio.inversaoDeControle;

public class EnviarEmails {

    public EnviarEmails(String tipo, String endereco, String senha){
    }

    public static EnviarEmails obterDadosEmails(){
        return new EnviarEmails("stmp", "contato@email.com", "123456");
    }

    public void retornar(String mensagem){
        System.out.println("Email enviado com sucesso!");
    }
}
