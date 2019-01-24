package repetition.first.polymorphism;


import repetition.first.polymorphism.newshape.Circle;
import repetition.first.polymorphism.newshape.Shape;
import repetition.first.polymorphism.newshape.Square;
import repetition.first.polymorphism.newshape.Triangle;

public class E03_NewShapeMethod {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square(), new Triangle()};
        for(Shape shape : shapes){
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}
