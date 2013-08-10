package br.com.qsf.ia.backpropagation;

import br.com.qsf.ia.backpropagation.data.Example;
import br.com.qsf.ia.backpropagation.data.NeuralNetwork;
import br.com.qsf.ia.backpropagation.util.Config;
import java.util.List;

/**
 *
 * @author vinicius
 */
public abstract class BackPropagation {
    protected NeuralNetwork network;
    protected Config config;
    
    /**Cria um BackPropagation setando a rede neural e as configurações. */
    public BackPropagation(NeuralNetwork network, Config config) {
        if (network == null || config == null) {
            throw new IllegalArgumentException(
                    "Nenhum argumento pode ser nulo");
        }
    }
    
    /**Método que decido a condição de parada de um treino. */
    protected abstract boolean hasError(double[] expected, double[] output);

    private void adjustWeight(double[] output) {
        //calcula o gradiente da ultima camada e ajusta os pesos.
        //para cada camada da rede
            //para cada percpeton da camada
                //calcula gradiente
                //ajusta pesos
    }
    
    /***/
    public void calculate() {
        List<Example> examples = 
                (List<Example>) this.config.getProperty("examples");
        //roda até não dar mais erros
        boolean isTraining =true;
        
        while (isTraining) {
            for (Example e: examples) {
                double[] output = this.network.processOutput(e.getInput());
                //se houver erro.
                if (this.hasError(e.getOutput(), output)) {
                    this.adjustWeight(output);
                }
            }
        }
    }
}
