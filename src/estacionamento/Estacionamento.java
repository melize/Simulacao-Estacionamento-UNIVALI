/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.util.List;

/**
 *
 * @author lokux
 */
public class Estacionamento {

    int vagas;
    int carrosEstacionados = 0;
    List<Bloco> blocos;

    public boolean havagas(Carro carro) {
        if (carrosEstacionados < vagas) {
            if (blocos.get(carro.bloco).havagas()) {
                return true;
            } else if (blocos.get(5).havagas()) {
                return true;
            }
        }
        return false;

    }

    public void estacionar(Carro carro) {
        carrosEstacionados++;
        if (blocos.get(carro.bloco).havagas()) {
            blocos.get(carro.bloco).estacionar();
        } else {
            blocos.get(5).estacionar();
        }
    }

    public void sair(int bloco) {
        carrosEstacionados--;
        blocos.get(bloco).sair();
    }

    public Estacionamento(int vagas, List<Bloco> blocos) {
        this.vagas = vagas;
        this.blocos = blocos;
    }

}
