package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    protected double calculoXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nMentoria{" +
                "\nNome Mentoria='" + nomeConteudo + '\'' +
                ",\nDescrição Mentoria='" + descricaoConteudo + '\'' +
                ",\ndata=" + data +
                '}';
    }
}
