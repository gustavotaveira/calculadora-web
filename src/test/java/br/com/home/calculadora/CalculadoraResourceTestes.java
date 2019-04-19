package br.com.home.calculadora;

import br.com.home.domain.Calculadora;
import br.com.home.resource.CalculadoraResource;
import br.com.home.service.CalculadoraService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class CalculadoraResourceTestes {

    @Test
    public void testaSoma() {
        RestAssuredMockMvc.given()
                .standaloneSetup(new CalculadoraResource(new CalculadoraService(new Calculadora())))
                .param("numero1", "1")
                .param("numero2", "2")
                .when()
                .post("/somar")
                .then()
                .statusCode(200)
                .body(equalTo("3"));
    }
}
