package test.prova_1.personagens.tipos;

import test.prova_1.personagens.Personagem;
import test.prova_1.personagens.Sexo;

public class Guerreiro extends Personagem {

    private int estamina;

    public Guerreiro(Sexo sexo) {
        super("Guerreiro", sexo);
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    @Override
    public int habilidadeEspecial() {
        if (estamina > 0) {
            return estamina * getForca();
        }

        return 0;
    }

}
