//: interfaces/E08_FastFood.java
/****************** Exercise 8 ******************
 * Create an interface called FastFood (with
 * appropriate methods) in
 * polymorphism.Sandwich.java, and change Sandwich
 * so it also implements FastFood.
 ***********************************************/
package interfaces;

import polymorphism.Sandwich;

interface FastFood {
    void rushOrder();

    void gobble();
}

class FastSandwich extends Sandwich implements FastFood {
    public void rushOrder() {
        System.out.println("Rushing your sandwich order");
    }

    public void gobble() {
        System.out.println("Chomp! Snort! Gobble!");
    }
}

public class E08_FastFood {
    public static void main(String args[]) {
        FastSandwich burger = new FastSandwich();
        System.out.println("Fries with that?");
        System.out.println("Super Size?");
        burger.rushOrder();
        burger.gobble();
    }
}/* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
Fries with that?
Super Size?
Rushing your sandwich order
Chomp! Snort! Gobble!
*///:~