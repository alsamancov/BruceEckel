package repetition.second.polymorphism;


import repetition.second.polymorphism.newshape.Circle;
import repetition.second.polymorphism.newshape.Shape;
import repetition.second.polymorphism.newshape.Square;
import repetition.second.polymorphism.newshape.Triangle;

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
