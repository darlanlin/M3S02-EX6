package br.com.futurodev.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Olá " + name + ", estamos iniciando nosso trabalho com Spring Boot!";
    }

    @RequestMapping(value = "/media/{valor1}+{valor2}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String resposta(@PathVariable double valor1, @PathVariable double valor2) {
        return "Valor 1 informado:  " + valor1 + " Valor 2 informado: " + valor2 + " Média aritmética: " + ((valor1+valor2)/2);
    }
}
