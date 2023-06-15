package test.exercicio.tecnico;

import test.exercicio.tecnico.estadio.Estadio;
import test.exercicio.tecnico.funcionario.tipos.Jogador;
import test.exercicio.tecnico.funcionario.tipos.PreparadorFisico;
import test.exercicio.tecnico.funcionario.tipos.Tecnico;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * https://www.dcc.ufrrj.br/moodle/pluginfile.php/17035/mod_resource/content/1/Exercicio-1.pdf
 * EXERCICIO MANEIRO
 */

public class Time {

    private Tecnico tecnico;
    private PreparadorFisico preparadorFisico;

    private List<Jogador> jogadores;

    private Estadio estadio;

    private List<Jogo> jogosJogados;

    private String estiloDeJogo;

    private Caixa caixa;

    public Time(Tecnico tecnico, PreparadorFisico preparadorFisico, List<Jogador> jogadores, Estadio estadio, List<Jogo> jogosJogados, String estiloDeJogo) {
        this.tecnico = tecnico;
        this.preparadorFisico = preparadorFisico;
        this.jogadores = jogadores;
        this.estadio = estadio;
        this.jogosJogados = jogosJogados;
        this.estiloDeJogo = estiloDeJogo;
        this.caixa = new Caixa();
    }

    public Time(Tecnico tecnico, PreparadorFisico preparadorFisico, List<Jogador> jogadores, Estadio estadio) {
        this(tecnico, preparadorFisico, jogadores, estadio, new ArrayList<>(), "4-3-3");
    }

    public void setEstiloDeJogo(String estiloDeJogo) {
        this.estiloDeJogo = estiloDeJogo;
    }


    public void finalizarCampeonato(Campeonato campeonato) {
        this.jogadores.forEach(jogador -> {

        });
    }
}
