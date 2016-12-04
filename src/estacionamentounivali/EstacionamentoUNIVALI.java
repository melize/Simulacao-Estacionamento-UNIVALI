/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamentounivali;

/**
 *
 * @author lokux
 */
public class EstacionamentoUNIVALI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulação simulação = new Simulação();
        simulação.simularmatutino();
        simulação.simularnoturno();
    }
    
}
