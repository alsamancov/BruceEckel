package repetition.first.polymorphism.newshape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void msg() {
        System.out.println("Square.msg");
    }
}
