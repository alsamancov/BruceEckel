//: interfaces/E10_PlayableMusic5.java
/****************** Exercise 10 *************************
 * Add a Playable to Modify Music5.java, and move the play() declaration from Instrument to Playable.
 * Include Playable in the implements list to add it to the derived classes.
 * Change tune() so it takes a Playable instead of an Instrument.
 *************************************************************************/
package repetition.second.interfaces;

import polymorphism.music.Note;

interface Instrument2 {
    void adjust();
}

interface Playable {
    void play(Note n);
}

class Wind2 implements Instrument2, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion2 implements Instrument2, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed2 implements Instrument2, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass2 extends Wind2 {
    public String toString() {
        return "Brass";
    }
}

class Woodwind2 extends Wind2 {
    public String toString() {
        return "Woodwind";
    }
}

public class E10_PlayableMusic5 {
    static void tune(Playable p) {
        p.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e) {
        for (Playable p : e) {
            tune(p);
        }
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind2(),
                new Percussion2(),
                new Stringed2(),
                new Brass2(),
                new Woodwind2()
        };
        tuneAll(orchestra);
    }
}
