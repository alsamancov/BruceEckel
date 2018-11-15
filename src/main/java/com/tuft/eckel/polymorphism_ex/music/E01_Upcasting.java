package com.tuft.eckel.polymorphism_ex.music;

public class E01_Upcasting {
    public static void ride(Cycle c){}

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}

class Cycle{

}

class Unicycle extends Cycle{}

class Bicycle extends Cycle{}

class Tricycle extends Cycle{}


