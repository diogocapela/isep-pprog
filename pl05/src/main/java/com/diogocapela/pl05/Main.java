package com.diogocapela.pl05;

public class Main {
    
    public static void main(String[] args) {
       
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 53, 62);
        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 650, 2731.5f, 4.25f);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel",  168, 4.5f);
        
        Trabalhador[] container = new Trabalhador[10];
        
        container[0] = tp;
        container[1] = tc;
        container[2] = th;
        
        for(int i = 0; i < container.length; i++) {
            if(container[i] != null) {
                System.out.println(container[i]);
            }
        }
        
        for(int i = 0; i < container.length; i++) {
            if(container[i] != null && container[i] instanceof TrabalhadorHora) {
                System.out.println(container[i]);
            }
        }
                
        for(int i = 0; i < container.length; i++) {
            if(container[i] != null) {
                String nome = container[i].getNome();
                float vencimento = container[i].calcularVencimento();
                System.out.println("Nome: " + nome + "\nVencimento: " + vencimento + "\n");
            }
        }
        
    }
    
}
