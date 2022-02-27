package com.diogocapela.pl03;

public class Tempo {
    
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    
    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public String getTempo24() {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }
    
    public String getTempo12() {
        if(this.hora >= 12) {
            int novaHora = this.hora - 12;
            return novaHora + ":" + this.minuto + ":" + this.segundo + " PM";
        }
        return this.hora + ":" + this.minuto + ":" + this.segundo + " AM";
    }
    
    @Override
    public String toString() {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }
    
    public void addExtraSecond() {
        this.segundo++;
    }
    
    public boolean isGreaterThan(Tempo tempo) {
        
        return false;
    }
    
    
    
    
}
