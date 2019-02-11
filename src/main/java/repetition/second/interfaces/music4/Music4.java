package repetition.second.interfaces.music4;
/****************************************************************
 * Instrument is to create a common interface for all the
 * classes derived from it.
 *
 * It establishes a basic form, so
 * that you can say what's common for all the derived classes.
 * Another what of saying this is to call Instrument an
 * abstract base class, or simply an abstract class.
 *
 * You create an abstract class when you want to manipulate a set
 * of classes through its common interface. Thus,
 * Instrument is meant to express only the interface, and not
 * a particular implementation, so creating an Instrument
 * object makes no sense, and you'll probably want to prevent
 * the user from doing it. This can be accomplished by making
 * all methods in Instrument generate errors, but that delays
 * the information until run time and requires reliable
 * exhaustive testing on the user's part. It's usually better to
 * catch problems at compile time.
 * Java provides a mechanism for doing this called the
 * abstract method. This is method that is incomplete; it
 * has only a declaration and no method body.
 *
 * A class containing abstract methods is called an abstract
 * class. If a class contains one or more abstract methods, the
 * class itself must be qualified as abstract. (Otherwise, the
 * compiler gives you an error message.)
 * If an abstract class is incomplete, what is the compiler
 * supposed to do when someone tries to make an object of
 * that class? It cannot safety create an object of an abstract
 * class, so you get an error message from the compiler. This
 * way, the compiler ensures the purity of the abstract class,
 * and you don't need to worry about misusing it.
 * If you inherit from an abstract class you want to make
 * objects of the new type, you must provide method
 * definitions for all the abstract methods in the base class. If
 * you don't (and you may choose not to), then the derived
 * class is also abstract, and the compiler will force you to
 * qualify that class with the abstract keyword.
 * It's possible to make a class abstract without including any
 * abstract methods. This is useful when you've got a class in
 * which it doesn't make sense to have any abstract methods,
 * and yet you want to prevent any instances of that class.
 *
 * Only some of the methods will be abstract, since making a class
 * abstract doesn't force you to make all the methods abstract.
 ************************************************************************/

import polymorphism.music.Note;

abstract class Instrument {
    private int i; // Storage allocated for each

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {

    }
}

class Percussion extends Instrument {
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {

    }
}

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {

    }
}

class Brass extends Wind {
    public void play(Note n) {
        System.out.println("Bras.play");
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String what() {
        return "Woodwind";
    }
}

public class Music4 {
    //Doesn't care about type, so new types
    //added to the system still work right:
    static void tune(Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        //Upcasting during addition to the array:
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
