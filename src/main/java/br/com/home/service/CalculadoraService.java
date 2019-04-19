package br.com.home.service;

import br.com.home.domain.Calculadora;
import br.com.home.domain.Numero;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    private final Calculadora calculadora;

    @Autowired
    public CalculadoraService(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public Numero somar(String numero1, String numero2) {
        if (StringUtils.isNumeric(numero1) &&
                StringUtils.isNumeric(numero2)) {
            return calculadora.somar(numero1, numero2);
        } else {
            throw new RuntimeException("Voce deve informar apenas numeros!");
        }

    }
}
