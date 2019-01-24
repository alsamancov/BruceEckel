package repetition.first.polymorphism;

import repetition.first.polymorphism.shape.RandomShapeGenerator;
import repetition.first.polymorphism.shape.Shape;

public class E02_Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for(int i = 0; i < shapes.length; i++){
            shapes[i] = gen.next();
        }

        for (Shape shape : shapes){
            shape.draw();
        }
    }
}
