/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author lokux
 */
public class Bloco {
    int ID;
    char nomenclatura;
    int vagas;
    int carrosEstacionados = 0;

    public Bloco(int ID, char nomenclatura, int vagas) {
        this.ID = ID;
        this.nomenclatura = nomenclatura;
        this.vagas = vagas;
    }

    
    public boolean havagas() {
        if (carrosEstacionados < vagas) {
            return true;
        } else {
            return false;
        }
    }
    
    public void estacionar(){
        carrosEstacionados++;
    }
    
    public void sair(){
        carrosEstacionados--;
    }
}
