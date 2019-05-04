package br.com.home.calculadora;

import br.com.home.domain.Calculadora;
import br.com.home.domain.Numero;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTestes {

    private static Calculadora calculadora;

    @BeforeClass
    public static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void testaSomarDecimais() {
        String numero = "3.5";
        String numero2 = "0.5";

        Numero soma = calculadora.somar(numero, numero2);

        Assert.assertEquals(4.0, soma.getValor().doubleValue(), 0);
    }

    @Test
    public void testaSomarInteiros() {
        String numero = "326";
        String numero2 = "4";

        Numero soma = calculadora.somar(numero, numero2);

        Assert.assertEquals(330, soma.getValor().intValue());
    }

    @Test
    public void testaSubtairInteiros() {
        String numero = "326";
        String numero2 = "4";

        Numero soma = calculadora.subtrair(numero, numero2);

        Assert.assertEquals(322, soma.getValor().intValue());
    }

    @Test
    public void testaSubtrairDecimais() {
        String numero = "3.5";
        String numero2 = "0.5";

        Numero soma = calculadora.subtrair(numero, numero2);

        Assert.assertEquals(3.0, soma.getValor().doubleValue(), 0);
    }
}
