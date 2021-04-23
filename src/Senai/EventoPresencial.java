package Senai;

import java.time.LocalDate;

public class EventoPresencial extends Evento {
	
	private String localiza�ao;
	private int capacidadeMaxima;
	public EventoPresencial(String nome, LocalDate data, Usuario organizador, String descricaoEvento,
			String localiza�ao, int capacidadeMaxima) {
		super(nome, data, organizador, descricaoEvento);
		this.localiza�ao = localiza�ao;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public String getLocaliza�ao() {
		return localiza�ao;
	}
	public void setLocaliza�ao(String localiza�ao) {
		this.localiza�ao = localiza�ao;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	
	
	

}
