//: polymorphism/E06_MusicToString.java
/****************** Exercise 6 *****************
 * Change Music3.java so what() becomes the root
 * Object method toString(). Print the Instrument
 * objects using System.out.println() (without
 * any casting).
 ***********************************************/
package polymorphism;
import polymorphism.music.Note;

class Instrument {
    void play(Note n){
        System.out.println("Instrument.play() " + n);
    }

    @Override
    public String toString() {
        return "Instrument";
    }

    void adjust(){
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
    public String toString () {
        return "Wind";
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }
    public String toString () {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
    public String toString () {
        return "Stringed";
    }
}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
    void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }
    public String toString () {
        return "Woodwind"; }
}

public class E06_MusicToString {
    static Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
    };
    public static void printAll(Instrument[] orch) {
        for(Instrument i : orch)
            System.out.println(i);
    }
    public static void main(String args[]) {
        printAll(orchestra);
    }
} /* Output:
Wind
Percussion
Stringed
Wind
Woodwind
*///:~
