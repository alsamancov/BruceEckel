package repetition.second.polymorphism;

import repetition.second.polymorphism.cycle.Bicycle;
import repetition.second.polymorphism.cycle.Cycle;
import repetition.second.polymorphism.cycle.Tricycle;
import repetition.second.polymorphism.cycle.Unicycle;

public class E01_Upcasting {
    public static void ride(Cycle c){}

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
