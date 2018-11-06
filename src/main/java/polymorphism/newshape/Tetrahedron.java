//: polymorphism/newshape/Tetrahedron.java
package polymorphism.newshape;

public class Tetrahedron extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void msg() {
        System.out.println("Circle.msg()");
    }
} ///:~
