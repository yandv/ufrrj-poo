package test.exercicio.tecnico;

import java.util.List;

/**
 * ?? como é o campeonato kkkkkkkkkkkkkk
 */

public abstract class Campeonato {

    private List<Time> timesInscritos;

    public void finalizarCampeonato() {
        timesInscritos.forEach(time -> time.finalizarCampeonato(this));
    }
}
