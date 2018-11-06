//: polymorphism/newshape/Triangle.java
package polymorphism.newshape;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void msg() {
        System.out.println("Triangle.msg()");
    }
} ///:~