package estacionamentounivali;

import estacionamento.Carro;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estacionando extends Thread {

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
            Thread.sleep(10);
        } catch (InterruptedException ex) {
        }
        Carro carro = new Carro(bloco);
        for (int i = 0; i < qtdEntradas; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Estacionando.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (Simulação.estacionamento.havagas(carro)) {
                Simulação.estacionamento.estacionar(carro);
                Simulação.gravarArq.println(bloco+" ");
            } else {
                fila++;
            }
        }
        System.out.println(bloco + " = " + fila + " ~~~~ Vagas/ocupadas = " + Simulação.estacionamento.getBlocos().get(bloco).vagas + " / " + Simulação.estacionamento.getBlocos().get(bloco).carrosEstacionados);
    }

}
