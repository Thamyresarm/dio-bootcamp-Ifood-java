package br.com.dio.desafio.dominio;
import java.util.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private String nomeBootCamp;
    private String descricaoBootCamp;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNomeBootCamp() {
        return nomeBootCamp;
    }

    public void setNomeBootCamp(String nomeBootCamp) {
        this.nomeBootCamp = nomeBootCamp;
    }

    public String getDescricaoBootCamp() {
        return descricaoBootCamp;
    }

    public void setDescricaoBootCamp(String descricaoBootCamp) {
        this.descricaoBootCamp = descricaoBootCamp;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsIncritos() {
        return devsInscritos;
    }

    public void setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsInscritos = devsIncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public String toString() {
        return "BootCamp{" +
                "Nome BootCamp = '" + nomeBootCamp + '\'' +
                ",\nDescrição BootCamp = '" + descricaoBootCamp + '\'' +
                ",\nData Inicial = " + dataInicial +
                ",\nData Final = " + dataFinal +
                ",\nDevs Inscritos = " + devsInscritos +
                ",\nConteúdos = " + conteudos +
                '}';
    }
}
