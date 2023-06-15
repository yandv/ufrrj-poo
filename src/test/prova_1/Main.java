package test.prova_1;

import test.prova_1.personagens.Personagem;
import test.prova_1.personagens.Sexo;
import test.prova_1.personagens.tipos.Guerreiro;

public class Main {

    public static void main(String[] args) {
        Personagem guerreiro = new Guerreiro(Sexo.FEMININO);

        guerreiro.habilidadeEspecial();

    }

}
