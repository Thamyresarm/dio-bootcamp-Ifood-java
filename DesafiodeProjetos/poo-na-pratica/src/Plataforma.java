import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.*;

public class Plataforma {
    public static void main(String[] args) {

        int i = 1;
        String respostaString;
        int respostaInt;

        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Scanner scan = new Scanner(System.in);
        BootCamp bootCamp1 = new BootCamp();
        Dev dev1 = new Dev();

        System.out.println("\n Bem vindo a Plataforma de Bootcamp! ");
        System.out.println("------------------------------------");
        System.out.println(" ");

        //Adicionando Bootcamp

        System.out.println("Digite um Nome para o BootCamp: ");
        bootCamp1.setNomeBootCamp(scan.next());
        System.out.println("Digite a descrição do BootCamp: ");
        bootCamp1.setDescricaoBootCamp(scan.next());

        System.out.println(bootCamp1.getNomeBootCamp() + " cadastrado com Sucesso!");

        System.out.println("\nAgora adicione os cursos deste Bootcamp");

        // tentando implementar o loop para adicionar mais de um curso e mais de uma mentoria

        //Cadastro Curso

        //    do {
        System.out.println("\nDigite o nome do curso: ");
        respostaString = scan.next(); // teclado não grava informação com espaço
        if (respostaString.equals("0")) {
            //   break;
        } else curso1.setNomeConteudo(respostaString);

        System.out.println("Digite a descrição do curso: ");
        respostaString = scan.next();
        if (respostaString.equals("0")) {
            //   break;
        } else curso1.setDescricaoConteudo((respostaString));

        System.out.println("Digite a Carga horaria do curso: ");
        respostaInt = scan.nextInt();
        if (respostaInt == 0) {
            //  break;
        } else curso1.setCargaHoraria(respostaInt);

        System.out.println("------------------------------------");
        System.out.println(" ");

        bootCamp1.getConteudos().add(curso1);
        System.out.println("Cadastrado: " + curso1.toString());
        System.out.println("------------------------------------");

        //      } while (i > 0);

        //Cadastro Mentoria

        //      do {
        System.out.println("Digite o nome do Mentoria: ");
        respostaString = scan.next();
        if (respostaString.equals("0")) {
            //  break;
        } else mentoria1.setNomeConteudo(respostaString);

        System.out.println("Digite a descrição da Mentoria: ");
        respostaString = scan.next();
        if (respostaString.equals("0")) {
            //  break;
        } else mentoria1.setDescricaoConteudo(respostaString);

        mentoria1.setData(LocalDate.now());

        System.out.println("------------------------------------");
        System.out.println(" ");

        bootCamp1.getConteudos().add(mentoria1);
        System.out.println("Cadastrado: " + mentoria1.toString());
        System.out.println("------------------------------------");

        //       } while (i > 0);

        System.out.println(bootCamp1.toString());

        System.out.println("------------------------------------");

        //adicionaDevs;


        System.out.println("Qual o nome do Dev que vai se cadastrar nesse BootCamp? ");
        dev1.setNome(scan.next());

        dev1.inscreverBootcamp(bootCamp1);
        System.out.println("  ");
        System.out.println("Conteudos Inscritos: " + dev1.getConteudosIncritos());
        System.out.println("\nConteudos Concluídos: " + dev1.getConteudosConcluidos());

       // System.out.println(bootCamp1.getDevsIncritos());

        do {
            System.out.println("\n Progredir?  ");
            if (scan.next().equalsIgnoreCase("Sim"))
                dev1.progredir();
            else {
                System.out.println("Você não progrediu!");
                break;
            }
            System.out.println("Conteudos Inscritos: " + dev1.getConteudosIncritos());
            System.out.println("\nConteudos Concluídos: " + dev1.getConteudosConcluidos());

        } while (i > 0);

    }
}
