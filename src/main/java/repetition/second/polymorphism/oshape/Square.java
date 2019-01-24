package repetition.second.polymorphism.oshape;

import repetition.second.polymorphism.shape.Shape;

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
