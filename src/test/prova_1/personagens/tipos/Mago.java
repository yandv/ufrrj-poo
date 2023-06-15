package test.prova_1.personagens.tipos;

import test.prova_1.personagens.Personagem;
import test.prova_1.personagens.Sexo;

public class Mago extends Personagem {

    private int mana;

    public Mago(Sexo sexo) {
        super("Mago", sexo);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int habilidadeEspecial() {
        if (mana > 0) {
            return mana * getInteligencia();
        }

        return 0;
    }
}
