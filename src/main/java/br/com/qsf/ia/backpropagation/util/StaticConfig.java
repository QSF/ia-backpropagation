package br.com.qsf.ia.backpropagation.util;

import br.com.qsf.ia.backpropagation.data.Example;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinicius
 */
public class StaticConfig implements Config {

    public StaticConfig() {
    }

    @Override
    public Object getProperty(String propertyName) {
        switch (propertyName) {
            case "examples":
                return this.getExamples();
            default: return null;
        }
    }

    private List<Example> getExamples() {
        List<Example> list= new ArrayList<>();
        //0 e 0
        Example example = new Example(new double[] {0,0}, new double[] {0});
        list.add(example);
        //0 e 1
        example = new Example(new double[] {0,1}, new double[] {1});
        list.add(example);
        //1 e 0
        example = new Example(new double[] {1,0}, new double[] {1});
        list.add(example);
        //1 e 1
        example = new Example(new double[] {1,1}, new double[] {0});
        list.add(example);
        return list;
    }
    
}
