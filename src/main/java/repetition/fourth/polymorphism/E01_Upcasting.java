package repetition.fourth.polymorphism;

import repetition.fourth.polymorphism.cycle.Cycle;

public class E01_Upcasting {
    public static void ride(Cycle c) {
    }

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Cycle());
        ride(new Cycle());
        ride(new Cycle());
    }
}
