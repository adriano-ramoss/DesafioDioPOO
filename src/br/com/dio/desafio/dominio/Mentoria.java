package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;
	
	

	public Mentoria() {
		
	}

		public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}

	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d; //Quando criar Mentoria e chamar o metódo calcularXp, O xp referente a mentoria será a XP_PADRAO+20
		
		
		
		
	}

}