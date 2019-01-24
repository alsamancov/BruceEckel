package repetition.first.polymorphism;

import repetition.first.polymorphism.cycle.Bicycle;
import repetition.first.polymorphism.cycle.Cycle;
import repetition.first.polymorphism.cycle.Tricycle;
import repetition.first.polymorphism.cycle.Unicycle;

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
