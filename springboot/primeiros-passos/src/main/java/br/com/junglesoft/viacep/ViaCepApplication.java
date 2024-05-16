package br.com.junglesoft.viacep;

import br.com.junglesoft.primeirospassos.PrimeirosPassosApplication;
import br.com.junglesoft.viacep.app.ConversorJson;
import br.com.junglesoft.viacep.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class ViaCepApplication {
    public static void main(String[] args) {
        SpringApplication.run(ViaCepApplication.class, args);
        public CommandLineRunner (ConversorJson conversor) throws {
            return args -> {
                String json = "{\"cep\": \"01001-00\", \"logradouro\": \"Praca da Sé\", \"localidade\": \" Sao Paulo \"}";
                ViaCepResponse response = conversor.converter(json);
                System.out.println("Dados do CEP: " + response);
            }
        }
    }
}
