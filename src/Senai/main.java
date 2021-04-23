package Senai;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		System.out.println("--- Sistema de Eventos---");
		Usuario usuario1 = new Usuario("joão");
		Usuario usuario2 = new Usuario("Maria");
		
		System.out.println("---Evento 1---");
		Evento evento1 = new EventoPresencial("Java para Iniciantes", LocalDate.of(2020, 11, 16), usuario1, "evento para iniciantes", "fpols", 20);
		evento1.addParticipante(usuario2);
		
		System.out.println("---Evento 2---");
		EventoVirtual evento2 = new EventoVirtual("Corte e custura", LocalDate.of(2020, 12, 14), usuario2,"Evento virtual para iniciantes", "http//: www.xttudo.com");
		evento2.addParticipante(usuario2);
		
		System.out.println("---Fim---" + evento2.getDescricaoEvento());

	}

}
