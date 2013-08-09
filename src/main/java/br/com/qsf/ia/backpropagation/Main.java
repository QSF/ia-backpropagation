package br.com.qsf.ia.backpropagation;

import br.com.qsf.ia.backpropagation.data.NeuralNetwork;
import br.com.qsf.ia.backpropagation.util.AppFactory;
import br.com.qsf.ia.backpropagation.util.Config;

/**
 *
 * @author vinicius
 */
public class Main {
    public static void main(String [ ] args) {
        //constroi a rede neural
        NeuralNetwork neural = AppFactory.createNeuralNetworkCreator().create();
        //pega os dados de configuração
        Config config = AppFactory.createConfig();
    }
}
