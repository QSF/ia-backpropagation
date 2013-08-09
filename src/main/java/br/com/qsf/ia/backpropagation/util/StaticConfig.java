package br.com.qsf.ia.backpropagation.util;

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
            default: return null;
        }
    }
    
}
