package br.com.home.resource;

import br.com.home.domain.Numero;
import br.com.home.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculadoraResource {

    private final CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraResource(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @RequestMapping("/home")
    public String calculadora() {
        return "calculadora";
    }

    @ResponseBody
    @RequestMapping(value = "somar", method = RequestMethod.POST)
    public String somar(String numero1, String numero2) {
        Numero soma = calculadoraService.somar(numero1, numero2);
        return soma.getValor().toString();
    }

    @ResponseBody
    @RequestMapping(value = "subtrair", method = RequestMethod.POST)
    public String subtrair(String numero1, String numero2) {
        Numero subtracao = calculadoraService.subtrair(numero1, numero2);
        return subtracao.getValor().toString();
    }
}
