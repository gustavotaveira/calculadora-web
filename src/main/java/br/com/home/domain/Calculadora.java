package br.com.home.domain;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public Numero somar(String numero1, String numero2) {
        return new Numero(numero1).some(numero2);
    }

    public Numero subtrair(String numero1, String numero2) {
        return new Numero(numero1).subtraia(numero2);
    }
}
