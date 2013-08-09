/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qsf.ia.backpropagation.util;

import br.com.qsf.ia.backpropagation.data.NeuralNetwork;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinicius
 */
public class SimpleNeuralCreatorTest {
    
    public SimpleNeuralCreatorTest() {
    }
    
    
    /**
     * Test of create method, of class SimpleNeuralCreator.
     */
    @org.junit.Test
    public void testCreate() {
        System.out.println("create");
        NeuralNetwork neural = AppFactory.createNeuralNetworkCreator().create();
        System.out.println("pesos");
        double[][] matrix = neural.getPerceptonMatrix();
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}