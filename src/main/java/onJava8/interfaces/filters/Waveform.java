package onJava8.interfaces.filters;

// interfaces/filters/Waveform.java

public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
