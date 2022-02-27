package com.diogocapela.pl02;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Data {

    private int ano;
    private int mes;
    private int dia;
        
    private static final int ANO_POR_OMISSAO = 1;
    private static final int MES_POR_OMISSAO = 1;
    private static final int DIA_POR_OMISSAO = 1;
    
    private static String[] nomeDiaDaSemana = {
        "Domingo",
        "Segunda-feira",
        "Terça-feira",
        "Quarta-feira",
        "Quinta-feira",
        "Sexta-feira",
        "Sábado"
    };
    
    private static int[] diasPorMes = {
        0,
        31,
        28,
        31,
        30,
        31,
        30,
        31,
        31,
        30, 
        31,
        30,
        31
    };
    
    private static String[] nomeMes = {
        "Inválido",
        "Janeiro",
        "Fevereiro",
        "Março",
        "Abril",
        "Maio",
        "Junho",
        "Julho",
        "Agosto",
        "Setembro",
        "Outubro",
        "Novembro",
        "Dezembro"
    };
   
    public Data() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String hoje = dateFormat.format(date);
        String[] dados = hoje.split("-");
        this.ano = Integer.parseInt(dados[0]);
        this.mes = Integer.parseInt(dados[1]);
        this.dia = Integer.parseInt(dados[2]);
    }
    
    public Data(String dataString) {
        String[] dados = dataString.split("-");
        this.ano = Integer.parseInt(dados[0]);
        this.mes = Integer.parseInt(dados[1]);
        this.dia = Integer.parseInt(dados[2]);
    }

    public Data(int ano, int mes, int dia) {        
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;              
    }
    
    public int getAno() {
        return ano;
    }
    
    public int getMes() {
        return mes;
    }
   
    public int getDia() {
        return dia;
    }
  
    public void setData(int ano, int mes, int dia) {
        this.ano = ano;         
        this.mes = mes;       
        this.dia = dia;          
    }
    
    public String toString() {
        return determinarDiaDaSemana() + ", " + dia + " de " + nomeMes[mes] + " de " + ano;
    }
   
    /**
     * Devolve a data no formato:%04d/%02d/%02d.
     * 
     * @return caraterísticas da data
     */
    public String toAnoMesDiaString() {
        return String.format("%04d/%02d/%02d", ano, mes, dia);
    }
    
    /**
     * Devolve o dia da semana da data. 
     * 
     * @return dia da semana da data
     */
    public String determinarDiaDaSemana() {
        int totalDias = contarDias();
        totalDias = totalDias % 7;
        return nomeDiaDaSemana[totalDias];
    }
   
    /**
     * Devolve true se a data for maior do que a data recebida por parâmetro.  
     * Se a data for menor ou igual à data recebida por parâmetro, devolve
     * false.
     * 
     * @param outraData a outra data com a qual se compara a data
     * @return true se a data for maior do que a data recebida por parâmetro,
     *         caso contrário devolve false
     */
    public boolean isMaior(Data outraData) {
        int totalDias = contarDias();
        int totalDias1 = outraData.contarDias();
        return totalDias > totalDias1;
    }

    /**
     * Devolve a diferença em número de dias entre a data e a data recebida por
     * parâmetro.     
     * 
     * @param outraData a outra data com a qual se compara a data para calcular
     *        a diferença do número de dias
     * @return diferença em número de dias entre a data e a data recebida por
     *         parâmetro
     */
    public int calcularDiferenca(Data outraData) {
        int totalDias = contarDias();
        int totalDias1 = outraData.contarDias();
        return Math.abs(totalDias - totalDias1);
    }
    
    /**    
     * Devolve a diferença em número de dias entre a data e a data recebida por
     * parâmetro com ano, mês e dia    
     * 
     * @param ano o ano da data com a qual se compara a data para calcular a
     *        diferença do número de dias
     * @param mes o mês da data com a qual se compara a data para calcular a
     *        diferença do número de dias
     * @param dia o dia da data com a qual se compara a data para calcular a
     *        diferença do número de dias
     * @return diferença em número de dias entre a data e a data recebida por
     *         parâmetro com ano, mês e dia  
     */
    public int calcularDiferenca(int ano, int mes, int dia) {
        int totalDias = contarDias();
        Data outraData = new Data(ano, mes, dia);
        int totalDias1 = outraData.contarDias();
        return Math.abs(totalDias - totalDias1);
    }
    
    /**
     * Devolve o número de dias desde o dia 1/1/1 até à data.
     * 
     * @return número de dias desde o dia 1/1/1 até à data
     */
    private int contarDias() {
        int totalDias = 0;
        for (int i = 1; i < ano; i++) {
            totalDias += isAnoBissexto(i) ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            totalDias += diasPorMes[i];
        }
        totalDias += (isAnoBissexto(ano) && mes > 2) ? 1 : 0;
        totalDias += dia;
        return totalDias;
    }
    
    private void avancarUmDia() {
        int[] diasPorMesArranged = diasPorMes;
        if(isAnoBissexto(this.ano)) {
            diasPorMesArranged[2]++;
        }
        if(this.dia >= diasPorMesArranged[this.mes] && this.mes == 12) {
            this.dia = 1;
            this.mes = 1;
            this.ano++;
        } else if(this.dia >= diasPorMesArranged[this.mes]) {
            this.dia = 1;
            this.mes++;
        } else {
            this.dia++;
        }
    }
    
    /**
     * Devolve true se o ano passado por parâmetro for bissexto.
     * Se o ano passado por parâmetro não for bissexto, devolve false.
     * 
     * @param ano o ano a validar
     * @return true se o ano passado por parâmetro for bissexto, caso contrário
     *         devolve false
     */        
    public static boolean isAnoBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

}