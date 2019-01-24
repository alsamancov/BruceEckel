package repetition.first.polymorphism;

import repetition.first.polymorphism.newshape.*;

public class E04_NewShapeType {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square(), new Triangle(), new Tetrahedron()};
        for(Shape shape : shapes){
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}
