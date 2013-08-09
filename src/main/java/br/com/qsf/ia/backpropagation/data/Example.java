package br.com.qsf.ia.backpropagation.data;

/**
 *
 * @author vinicius
 */
public class Example {
    private double[] input;
    private double[] output;
    
    public Example(double[] input, double[] output) {
        this.input = input;
        this.output = output;
    }
    
    //getters and setters
    public double[] getInput() {
        return input;
    }

    public double[] getOutput() {
        return output;
    }
    
}
