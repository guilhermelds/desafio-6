package Senai;

import java.time.LocalDate;

public class Evento {
	
	private String nome;
	private LocalDate data;
	private Usuario organizador;
	private Usuario[] participantes;
	private String descricaoEvento;
	private int posicaoParticipantes = 0;
	
	public Evento(String nome, LocalDate data, Usuario organizador, String descricaoEvento) {
		this.nome = nome;
		this.data = data;
		this.organizador = organizador;
		this.descricaoEvento = descricaoEvento;
		this.participantes = new Usuario[10];
	}

	public String getNome() {
		return nome;
	}

	public String getDescricaoEvento() {
		return descricaoEvento;
	}

	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
	
	public void addParticipante(Usuario participante) {
		this.participantes[this.posicaoParticipantes] = participante;
		this.posicaoParticipantes++;
	}
	
	

}
