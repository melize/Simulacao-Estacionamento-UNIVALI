/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamentounivali;

import estacionamento.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lokux
 */
public class Simulação {

    public static Estacionamento estacionamento;

    public Simulação() {
        List<Bloco> blocos = new ArrayList(6);
        Bloco bloco = new Bloco(0, 'A', 11);
        blocos.add(bloco);
        bloco = new Bloco(0, 'B', 161);
        blocos.add(bloco);
        bloco = new Bloco(0, 'C', 150);
        blocos.add(bloco);
        bloco = new Bloco(0, 'D', 173);
        blocos.add(bloco);
        bloco = new Bloco(0, 'E', 230);
        blocos.add(bloco);
        bloco = new Bloco(0, 'F', 426);
        blocos.add(bloco);
        estacionamento = new Estacionamento(1152, blocos);
    }

    public void simularmatutino() {
        List<Estacionando> estacionando = new ArrayList<>(6);
        Estacionando estacionandor = new Estacionando(0, 40);
        estacionando.add(estacionandor);
        estacionandor = new Estacionando(1, 319);
        estacionando.add(estacionandor);
        estacionandor = new Estacionando(2, 279);
        estacionando.add(estacionandor);
        estacionandor = new Estacionando(3, 319);
        estacionando.add(estacionandor);
        estacionandor = new Estacionando(4, 133);
        estacionando.add(estacionandor);
        estacionandor = new Estacionando(5, 253);
        estacionando.add(estacionandor);

        for (int i = 0; i < estacionando.size(); i++) {
            estacionando.get(i).run();
        }
        for (int i = 0; i < estacionando.size(); i++) {
            try {
                estacionando.get(i).join();
            } catch (InterruptedException ex) {
            }
        }

        List<Saindo> saido = new ArrayList<>(6);
        Saindo saidor = new Saindo(0, 34);
        saido.add(saidor);
        saidor = new Saindo(1, 274);
        saido.add(saidor);
        saidor = new Saindo(2, 240);
        saido.add(saidor);
        saidor = new Saindo(3, 274);
        saido.add(saidor);
        saidor = new Saindo(4, 114);
        saido.add(saidor);
        saidor = new Saindo(5, 217);
        saido.add(saidor);

        for (int i = 0; i < saido.size(); i++) {
            saido.get(i).run();
        }
        for (int i = 0; i < saido.size(); i++) {
            try {
                saido.get(i).join();
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("Simulação Matutina Finalizada");
    }

    public void simularnoturno() {
        List<Estacionando> estacionando = new ArrayList<>(6);
        Estacionando estacionandor = new Estacionando(0, 49);
        estacionando.add(estacionandor);
        estacionandor = new Estacionando(1, 396);
        estacionando.add(estacionandor);
        estacionandor = new Estacionando(2, 346);
        estacionando.add(estacionandor);
        estacionandor = new Estacionando(3, 396);
        estacionando.add(estacionandor);
        estacionandor = new Estacionando(4, 165);
        estacionando.add(estacionandor);
        estacionandor = new Estacionando(5, 313);
        estacionando.add(estacionandor);

        for (int i = 0; i < estacionando.size(); i++) {
            estacionando.get(i).run();
        }
        for (int i = 0; i < estacionando.size(); i++) {
            try {
                estacionando.get(i).join();
            } catch (InterruptedException ex) {
            }
        }

        List<Saindo> saido = new ArrayList<>(6);
        Saindo saidor = new Saindo(0, 49);
        saido.add(saidor);
        saidor = new Saindo(1, 396);
        saido.add(saidor);
        saidor = new Saindo(2, 346);
        saido.add(saidor);
        saidor = new Saindo(3, 396);
        saido.add(saidor);
        saidor = new Saindo(4, 165);
        saido.add(saidor);
        saidor = new Saindo(5, 313);
        saido.add(saidor);

        for (int i = 0; i < saido.size(); i++) {
            saido.get(i).run();
        }
        for (int i = 0; i < saido.size(); i++) {
            try {
                saido.get(i).join();
            } catch (InterruptedException ex) {
            }
        }

        System.out.println("Simulação Noturna Finalizada");
    }
}
