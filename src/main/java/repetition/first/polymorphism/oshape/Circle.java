package repetition.first.polymorphism.oshape;

import repetition.first.polymorphism.shape.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
