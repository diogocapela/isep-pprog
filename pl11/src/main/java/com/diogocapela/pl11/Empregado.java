package com.diogocapela.pl11;

import pt.ipp.isep.dei.utilitarios.Data;
import pt.ipp.isep.dei.utilitarios.Tempo;

public class Empregado {
    
    private String primeiroNome;
    private String ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;
    
    static final private int DIAS_TRABALHO_POR_SEMANA = 5;
    
    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(dataContrato);
        this.horaEntrada = new Tempo(horaEntrada);
        this.horaSaida = new Tempo(horaSaida);
    }
    
    public Empregado(Empregado empregado) {
        this(
                empregado.primeiroNome,
                empregado.ultimoNome,
                new Data(empregado.dataContrato),
                new Tempo(empregado.horaEntrada),
                new Tempo(empregado.horaSaida)
        );
    }

    public int calcularTempoContrato() {
        Data dataAntiga = new Data(this.dataContrato);
        Data dataNova = Data.dataAtual();
        return dataAntiga.diferenca(dataNova);
    }
    
    public int calcularHorasTrabalhoSemanal() {
        return (this.horaEntrada.diferencaEmSegundos(this.horaSaida) * DIAS_TRABALHO_POR_SEMANA) / 3600;
    }
    
}
