package br.com.dio.desafio.dominio;
import java.util.*;

public class Curso extends Conteudo{

    double cargaHoraria;


    @Override
    protected double calculoXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso{" +
                "\nNome Curso = " + nomeConteudo +
                ",\nDescrição Curso = '" + descricaoConteudo + '\'' +
                ",\nCarga Horaria Curso = '" + cargaHoraria + '\'' +
                '}';
    }
}
