package repetition.first.polymorphism;

import repetition.first.polymorphism.cycle2.Bicycle;
import repetition.first.polymorphism.cycle2.Cycle;
import repetition.first.polymorphism.cycle2.Tricycle;
import repetition.first.polymorphism.cycle2.Unicycle;

public class E05_Wheels {
    public static void ride(Cycle c){
        System.out.println("Num. of wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
