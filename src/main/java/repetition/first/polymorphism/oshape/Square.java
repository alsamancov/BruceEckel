package repetition.first.polymorphism.oshape;

import repetition.first.polymorphism.shape.Shape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}
