/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamentounivali;

import estacionamento.Carro;

/**
 *
 * @author lokux
 */
public class Estacionando extends Thread{
    int bloco;
    int qtdEntradas;
        int fila = 0;

    public Estacionando(int bloco, int qtdEntradas) {
        this.bloco = bloco;
        this.qtdEntradas = qtdEntradas;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        Carro carro = new Carro(bloco);
                for (int i = 0; i < qtdEntradas; i++) {
            if (Simulação.estacionamento.havagas(carro)) {
                Simulação.estacionamento.estacionar(carro);
            } else {
                fila++;
            }
        }
        System.out.println(bloco + " = " + fila);
    }
    
    
}
