//: polymorphism/oshape/Square.java
package polymorphism.oshape;

import polymorphism.shape.Shape;

public class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
} ///:~
