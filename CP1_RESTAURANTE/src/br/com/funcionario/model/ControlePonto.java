package br.com.funcionario.model;

import java.time.*;
import java.util.*;

import br.com.funcionario.exception.HorarioInvalidoException;

public class ControlePonto extends InformacaoFuncionario{
	
	LocalDateTime horaEntrada;
	LocalDateTime horaSaida;
	List <Duration> registrosDeJornada = new ArrayList<>();
	
	public ControlePonto(String nome, LocalDateTime horaEntrada, LocalDateTime horaSaida, List<Duration> registrosDeJornada) {
		super(nome);
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.registrosDeJornada = registrosDeJornada;
	}

	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalDateTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalDateTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	public List<Duration> getRegistrosDeJornada() {
		return registrosDeJornada;
	}

	public void setRegistrosDeJornada(List<Duration> registrosDeJornada) {
		this.registrosDeJornada = registrosDeJornada;
	}

	public void baterPontoEntrada() {
        System.out.println(nome + " bateu o ponto de entrada.");
    }

    public void baterPontoSaida() {
        System.out.println(nome + " bateu o ponto de saída.");
    }
	
    public void jornada(List <Duration> registrosDeJornada) {
    	Period tempo = Period.between(data_admissao, LocalDate.now());
    	System.out.println(nome + " está na empresa há " + tempo.getYears() + " anos, " +
                tempo.getMonths() + " meses e " + tempo.getDays() + " dias.");
    }
    
    public void registrarEntrada(LocalTime hora) throws HorarioInvalidoException {
        if (hora.isBefore(LocalTime.of(6, 0)) || hora.isAfter(LocalTime.of(22, 0))) {
            throw new HorarioInvalidoException("Horário inválido para entrada: " + hora);
        }
    }
    
}
