//: typeinfo/pets2/Mouse.java
package solutions.typeinfo.pets2;
import typeinfo.pets.Rodent;

public class Mouse extends Rodent {
  public static class Factory
  implements typeinfo.factory.Factory<Mouse> {
    public Mouse create() { return new Mouse(); }
  }
} ///:~
