/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.ParDeNumeros;

/**
 *
 * @author Thiago
 */
public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros par) {

        System.out.println("VALORES\nNúmero 1: " + par.getNum1() + "\nNúmero 2: " + par.getNum2());
    }

    public double devolverMayor(ParDeNumeros par) {
        return Math.max(par.getNum1(), par.getNum2());
    }

    public double calcularPotencia(ParDeNumeros par) {

        double numMayor = devolverMayor(par);
        double numMenor = Math.min(par.getNum1(), par.getNum2());
        numMayor = Math.round(numMayor);
        numMenor = Math.round(numMenor);
        return Math.pow(numMayor, numMenor);
    }

    public double calculaRaiz(ParDeNumeros par) {

        double numMenor = Math.min(par.getNum1(), par.getNum2());
        numMenor = Math.abs(numMenor);
        return Math.sqrt(numMenor);
    }
}
