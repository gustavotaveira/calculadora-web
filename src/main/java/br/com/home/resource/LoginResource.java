package br.com.home.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginResource {

    @ResponseBody // <-- indica que queremos retornar um valor(nesse caso uma string) e nao uma pagina
    @RequestMapping("login")
    public String login() {
        return "login";
    }
}
