package repetition.second.polymorphism;


import repetition.second.polymorphism.oshape.RandomShapeGenerator;
import repetition.second.polymorphism.shape.Shape;

public class E02_Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = gen.next();
        }

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
