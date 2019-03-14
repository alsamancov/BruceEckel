package onJava8.interfaces.interfaceprocessor;

// interfaces/interfaceprocessor/Applicator.java

public class Applicator {
    public static void apply(Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
