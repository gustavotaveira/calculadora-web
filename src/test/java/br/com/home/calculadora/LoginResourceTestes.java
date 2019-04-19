package br.com.home.calculadora;

import br.com.home.resource.LoginResource;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class LoginResourceTestes {

    @Test
    public void testaLogin() {
        RestAssuredMockMvc.given()
                .standaloneSetup(new LoginResource())
                .when()
                .get("/login")
                .then()
                .body(equalTo("login"));
    }
}
