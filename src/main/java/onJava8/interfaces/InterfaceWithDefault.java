package onJava8.interfaces;

// interfaces/InterfaceWithDefault.java

interface InterfaceWithDefault {
    void firstMethod();
    void secondMethod();
    default void newMethod(){
        System.out.println("newMethod");
    }
}
