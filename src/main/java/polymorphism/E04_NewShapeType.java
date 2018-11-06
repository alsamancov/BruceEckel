//: polymorphism/E04_NewShapeType.java 
/****************** Exercise 4 *****************  
 * Add a new type of Shape to Shapes.java and
 * verify in main() that polymorphism works for
 * your new type as it does in the old types.
 ***********************************************/
package polymorphism;
import polymorphism.newshape.*;

import java.util.List;

public class E04_NewShapeType {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square(), new Triangle(), new Tetrahedron()};
        List<Shape> shapeList = List.of(new Circle(), new Square(), new Triangle(), new Tetrahedron());
        for(Shape shape : shapes){
            shape.draw();
            shape.erase();
            shape.msg();
        }

        for(Shape shape : shapeList){
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}
