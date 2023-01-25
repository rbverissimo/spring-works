package br.com.dio.estudobeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro(){
        return new Livro();
    }
    //A interpretação da annotation se fosse em XML seria tal qual a abaixo:
    // <bean id="livro" class="br.com.dio.estudobeans.Livro"/>

    @Bean
    public AutorLivro getAutorLivro(){
        return new Autor();
    }
}
