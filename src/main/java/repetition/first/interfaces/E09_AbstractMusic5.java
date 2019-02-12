//: interfaces/E09_AbstractMusic5.java
/****************** Exercise 9 ******************
 * Refactor Music5.java by moving the common
 * methods in Wind, Percussion and Stringed into
 * an abstract class.
 ***********************************************/
package repetition.first.interfaces;

import polymorphism.music.Note;

abstract class Instrument {
    public void play(Note n){
        System.out.println(this +".play() " + n);
    }

    public void adjust(){
        System.out.println(this + ".adjust()");
    }

    public abstract String toString();
}

class Wind extends Instrument {
    public String toString(){
        return "Wind";
    }
}

class Percussion extends Instrument {
    public String toString(){
        return "Percussion";
    }
}

class Stringed extends Instrument {
    public String toString(){
        return "Stringed";
    }
}

class Brass extends Wind {
    public String toString(){
        return "Brass";
    }
}

class Woodwind extends Wind{
    public String toString(){
        return "Woodwind";
    }
}

public class E09_AbstractMusic5 {
    static void tune(Instrument i){
        i.adjust();
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e){
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
/**
 * We eliminate code duplication, moving common functionality into the abstract base class.
 * toString() is now an abstract method, so all classes that implement Instrument provide a definition for it.
 * Without the redefinition of toString(), all Instrument would otherwise use the original, non-abstract toString() from the root class Object.
 */