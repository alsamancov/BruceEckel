package repetition.second.polymorphism.newshape;

public class Circle extends Shape {
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
}
