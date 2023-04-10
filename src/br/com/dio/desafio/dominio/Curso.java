package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria; //Ao Concluir o curso o XP_Padrao será multiplicado pela cargaHoraria
	}
	

	public Curso() {
		
	}

	

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}



	
	
	

}
