//: interfaces/music5/Music5.java
// Interfaces.
/***********************************************************************
 * The interface keyword produces a
 * completely abstract class, one that provides no
 * implementation at all. It allows the creator to determine
 * method names, argument lists, and return types, but no
 * method bodies. An interface provides only a form, but no
 * implementation.
 *
 * An interface says, "All classes that implement this particular
 * interface will look like this." This, any code that uses a
 * particular interface knows that methods might be called
 * for that interface, and that's all. So the interface is used to
 * establish a "protocol" between classes. (Some object-
 * oriented programming languages have a keyword called
 * protocol to do the same thing.)
 *
 * However, an interface is more than just an abstract class
 * taken to the extreme, since it allows you to perform a
 * variation of "multiple inheritance" by creating a class that
 * can be upcast to more than one base type.
 *
 * To create an interface, use the interface keyword instead
 * of the class keyword. As with a class, you can add the
 * public keyword before the interface keyword (but only if
 * that interface is defined in a file of the same name). If you
 * leave off the public keyword, you get package access, so the
 * interface is only usable within the same package. An
 * interface can also contain fields, but these are implicitly
 * static and final.
 *
 * To make a class that conforms to a particular interface (or
 * group of interfaces), use the implements keyword, which
 * says, "The interface is what it looks like, but now I'm going
 * to say how it works." Other than that, it looks like
 * inheritance.
 *
 * You can see from the Woodwind and Brass classes that
 * once you've implemented an interface, that implementation
 * becomes an ordinary class that can be extended in the
 * regular way.
 *
 * You can choose to explicitly declare the methods in an
 * interface as public, but they are public even if you don't
 * say it. So when you implement an interface, the methods
 * from the interface must be defined as public. Otherwise,
 * they would default to package access, and you'd be reducing
 * the accessibility of a method during inheritance, which is
 * not allowed by the Java compiler.
 *
 * You can see this in the modified version of the Instrument
 * example. Note that every method in the interface is strictly
 * a declaration, which is the only thing the compiler allows.
 * In addition, none of the methods in Instrument are
 * declared as public, but they're automatically public
 * anyway:
 ********************************************************************/
package repetition.third.interfaces.music5;

import polymorphism.music.Note;

interface Instrument {
    // Compile-time constant:
    int VALUE = 5; // static & final

    // Cannot have method definition:
    void play(Note n); //Automatically public

    void adjust();
}

class Wind implements Instrument {
    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }

    public String toString(){
        return Wind.class.getSimpleName();
    }

    public void adjust(){
        System.out.println(this + ".adjust()");
    }
}

class Percussion implements Instrument {
    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }

    public String toString(){
        return Percussion.class.getSimpleName();
    }

    public void adjust(){
        System.out.println(this + ".adjust()");
    }
}

class Stringed implements Instrument {
    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }

    public String toString(){
        return Stringed.class.getSimpleName();
    }

    public void adjust(){
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind {
    public String toString(){
        return Brass.class.getSimpleName();
    }
}

class Woodwind extends Wind {
    public String toString(){
        return Woodwind.class.getSimpleName();
    }
}

public class Music5 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i){
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e){
        for(Instrument i : e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
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

/***********************************************************************
 * One other change has been made to this version of the
 * example: The what() method has been changed to
 * toString(), since that was how the method was being
 * used. Since toString() is part of the root class Object, it
 * doesn't need to appear in the interface.
 *
 * The rest of the works the same. Notice that it doesn't
 * matter if you are upcasting to a "regular" class called
 * Instrument, an abstract class called Instrument, or to
 * an interface called Instrument. The behavior is the same.
 * In fact, you can see in the tune() method that there isn't
 * any evidence about whether Instrument is a "regular"
 * class, an abstract class, or an interface.
 */
