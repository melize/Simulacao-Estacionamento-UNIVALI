package estacionamentounivali;

import estacionamento.Carro;

public class Saindo extends Thread {

    int bloco;
    int qtdEntradas;

    public Saindo(int bloco, int qtdEntradas) {
        this.bloco = bloco;
        this.qtdEntradas = qtdEntradas;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
        }
        Carro carro = new Carro(bloco);
        for (int i = 0; i < qtdEntradas; i++) {
            Simulação.estacionamento.sair(bloco);

        }
    }

}
