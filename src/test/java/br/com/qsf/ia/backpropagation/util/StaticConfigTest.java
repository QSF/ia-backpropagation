/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qsf.ia.backpropagation.util;

import br.com.qsf.ia.backpropagation.data.Example;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinicius
 */
public class StaticConfigTest {
    
    public StaticConfigTest() {
    }

    /**
     * Test of getProperty method, of class StaticConfig.
     */
    @Test
    public void testGetExamples() {
        System.out.println("getProperty");
        StaticConfig config = new StaticConfig();
        List<Example> list = (List<Example>) config.getProperty("examples");
        for (Example e: list) {
            System.out.println("Exemplo ");
            double[] input = e.getInput();
            for (int i = 0; i < input.length; i++) {
                System.out.print(input[i] + " ");
            }
            
            double[] output = e.getOutput();
            for (int i = 0; i < output.length; i++) {
                System.out.println("= " + output[i]);
            }
        }
    }
}