package com.KirutasuJava.SpringEjercicios01Palindromo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para verificar palindromos
 */
@RestController
public class PalindromoController {

    /**
     * Endpoint para comprobar si una palabra es un palindromo
     * @param palabra la palabra a verificar
     * @return mensaje indicando si la palabra es un palindromo o no
     */
    @GetMapping ("/validar-palindromo/{palabra}") // TODO Controlador solo comunica peticiones http y devuelve respuesta, no debe llevar la logica
    public String Palindromo(@PathVariable String palabra) {
        if (esPalindromo(palabra)) {
            return "La palabra " + palabra + " es un palíndromo";
        }
        else {
            return "La palabra " + palabra + " NO es un palíndromo";
        }
    }

    /**
     * Metodo para comprobar si una palabra es un palindromo
     * @param palabra la palabra a comprobar
     * @return true si la palabra es un palindromo; false si no lo es.
     */
    private boolean esPalindromo(String palabra) { //todo este metodo iria en su clase independiente, y NO en el controlador, pero es solo para probar el funcionamiento de Spring Boot
        int lenght = palabra.length();
        for (int i = 0; i < lenght / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(lenght - i - 1)) {
                return false;
            }
        }
        return true;
    }


}
