package br.com.qsf.ia.backpropagation.util;

import br.com.qsf.ia.backpropagation.data.NeuralNetwork;

/**
 *
 * @author vinicius
 */
class SimpleNeuralCreator implements NeuralNetworkCreator {

    public NeuralNetwork create() {
        //faz de maneira estática a rede utilizada na tarefa.
        double[][] perceptonMatrix = {
            {0,0,1,1,0},
            {0,0,1,1,0},
            {0,0,0,0,1},
            {0,0,0,0,1},
            {0,0,0,0,0}
        };
        int[] layers = {0,2,4};
        
        return new NeuralNetwork(perceptonMatrix, layers);
    }
    
}
