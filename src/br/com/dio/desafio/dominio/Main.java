package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Curso JavaSript");
		curso2.setCargaHoraria(10);

//-------------------------------------------------------------------------------------------		

		Mentoria mentoria = new Mentoria();

		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Desc Mentoria Java");
		mentoria.setData(LocalDate.now()); // Vai atribuir a data de quando o objeto for criado

		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devAdriano = new Dev();
		devAdriano.inscreverBootcamp(bootcamp);
		devAdriano.setNome("Adriano");
		System.out.println("Conteudos Inscritos - Adriano: " + devAdriano.getConteudoInscritos());
		devAdriano.progredir();
		System.out.println("Conteudos Concluidos - Adriano: " + devAdriano.getConteudosConcluidos());
		System.out.println("XP: " + devAdriano.calcularTotalXp());

//----------------------------------------------------------------------------------------------------------

		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos - João: " + devJoao.getConteudoInscritos());
		devJoao.progredir();
		System.out.println("Conteudos Concluidos - João: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());

	}

}
