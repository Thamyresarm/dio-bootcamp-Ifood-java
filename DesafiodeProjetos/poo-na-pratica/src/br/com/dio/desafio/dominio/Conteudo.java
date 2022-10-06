package br.com.dio.desafio.dominio;
import java.util.*;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    protected String nomeConteudo;
    protected String descricaoConteudo;

    protected abstract double calculoXp();

    public String getNomeConteudo() {
        return nomeConteudo;
    }

    public void setNomeConteudo(String nomeConteudo) {
        this.nomeConteudo = nomeConteudo;
    }

    public String getDescricaoConteudo() {
        return descricaoConteudo;
    }

    public void setDescricaoConteudo(String descricaoConteudo) {
        this.descricaoConteudo = descricaoConteudo;
    }
}

