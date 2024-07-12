package br.comp.anderson.fibonacci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.comp.anderson.fibonacci.model.Fibonacci;

@RestController
@RequestMapping(value="/calculo")
public class Calculo {

    @GetMapping(value="/{n}")
    public String calculoFibonacci(@PathVariable String n){
        int valorCalculado = (new Fibonacci()).calculo(Integer.parseInt(n));
        String resposta = "O valor do termo de ordem ";
        resposta += n;
        resposta += " da série de Fibonacci vale ";
        resposta += String.valueOf(valorCalculado);
        return resposta;
    }
}