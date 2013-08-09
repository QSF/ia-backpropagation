package br.com.qsf.ia.backpropagation.util;

/**
 *
 * @author vinicius
 */
public class AppFactory {
    public static NeuralNetworkCreator createNeuralNetworkCreator() {
        return new SimpleNeuralCreator();
    }
    
    public static Config createConfig() {
        return new StaticConfig();
    }
}
