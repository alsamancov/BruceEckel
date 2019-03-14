package onJava8.interfaces.interfaceprocessor;

// interfaces/interfaceprocessor/Processor.java

public interface Processor {
    default String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input);
}
