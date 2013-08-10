package br.com.qsf.ia.backpropagation.data;

/**
 *
 * @author vinicius
 */
public class NeuralNetwork {
    /**Matrix que representa os perceptons da rede. */
    private double[][] perceptonMatrix;
    /**
     * Array que indica o percepton inicial de cada camada.
     * 
     * Por exemplo, se o valor for {0,2,4} quer dizer que a camada um tem 
     * como seu primeiro neurônio o de número 0. A camada dois tem como 
     * primeiro o de número 2 e assim por diante.
     */
    private int[] layers;
    
    /**
     * 
     */
    public NeuralNetwork(double[][] matrix, int[] layers) {
        if (matrix == null || layers == null) {
            throw new IllegalArgumentException("Nenhum argumento pode ser "
                    + "nulo.");
        }
        this.perceptonMatrix = matrix;
        this.layers = layers;
    }
    
    /** Processa a saída da rede para uma dada entrada. */
    public double[] processOutput(double[] input) {
        
        return null;
    }
    
    //getters e setters
    public double[][] getPerceptonMatrix() {
        return perceptonMatrix;
    }

    public int[] getLayers() {
        return layers;
    }
    
}
