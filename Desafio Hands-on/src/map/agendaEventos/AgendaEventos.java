package map.agendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

	
	private Map<LocalDate, Evento> mapAgendaEventos;

	public AgendaEventos() {
		this.mapAgendaEventos = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome,
			String atracao) {
		mapAgendaEventos.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(mapAgendaEventos);
		System.out.println(eventosTreeMap);
	}
	
	
	public void obterProximoEvento() {
		/*Set<LocalDate> dateSet = mapAgendaEventos.keySet();
		Collection<Evento> values = mapAgendaEventos.values();*/
		/*mapAgendaEventos.get();*/
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(mapAgendaEventos);
		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O próximo evento: " +  proximoEvento + 
						" acontecerá na data " + proximaData);
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
		agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
		agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 2");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 23), "Evento 4", "Atração 4");
		
		agendaEventos.exibirAgenda();
		agendaEventos.obterProximoEvento();
		
	}
	
	
}
