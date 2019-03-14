package onJava8.repetition.first.interfaces;

// interfaces/ImplementingAnInterface.java

interface Concept {
    void idea1();
    void idea2();
}

public class ImplementingAnInterface implements Concept {
    @Override
    public void idea1() {
        System.out.println("idea1");
    }

    @Override
    public void idea2() {
        System.out.println("idea2");
    }
}
