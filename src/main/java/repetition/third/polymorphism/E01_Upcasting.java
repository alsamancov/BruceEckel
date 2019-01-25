package repetition.third.polymorphism;

import repetition.third.polymorphism.cycle.Bicycle;
import repetition.third.polymorphism.cycle.Cycle;
import repetition.third.polymorphism.cycle.Tricycle;
import repetition.third.polymorphism.cycle.Unicycle;

public class E01_Upcasting {
    public static void ride(Cycle c) {
    }

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
