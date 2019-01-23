//: interfaces/filters/LowPass.java
package interfaces.filters;

import interfaces.filters.Filter;
import interfaces.filters.Waveform;

public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input; // Dummy processing
    }
} ///:~