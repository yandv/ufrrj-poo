package test.prova_1;

import test.prova_1.personagens.Sexo;
import test.prova_1.personagens.tipos.Guerreiro;

public class Main {

    public static void main(String[] args) {
        Guerreiro guerreiro1 = new Guerreiro(Sexo.FEMININO);
        Guerreiro guerreiro2 = new Guerreiro(Sexo.MASCULINO);

        System.out.println("Guerreiro 1 - Força x Inteligencia: " + guerreiro1.getForca() + " x " + guerreiro1.getInteligencia());
        System.out.println("Guerreiro 2 - Força x Inteligencia: " + guerreiro2.getForca() + " x " + guerreiro2.getInteligencia());
    }

}
