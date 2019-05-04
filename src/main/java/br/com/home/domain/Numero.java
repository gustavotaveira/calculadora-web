package br.com.home.domain;

import java.math.BigDecimal;

public class Numero {

    private BigDecimal valor;

    private Numero(BigDecimal valor) {
        this.valor = valor;
    }

    Numero(String valor) {
        this.valor = new BigDecimal(valor);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    Numero some(String numero2) {
        return new Numero(this.valor.add(new BigDecimal(numero2)));
    }

    public Numero subtraia(String numero2) {
        return new Numero(this.valor.subtract(new BigDecimal(numero2)));
    }
}
