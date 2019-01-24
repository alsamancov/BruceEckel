package repetition.second.polymorphism.oshape;

import repetition.second.polymorphism.shape.Shape;

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
