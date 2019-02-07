//: operators/E13_BinaryChar.java
/****************** Exercise 13 *****************
 * Write a method to display char values in
 * binary form. Demonstrate it using several
 * different characters.
 ************************************************/
package operators;

public class E13_BinaryChar {
    public static void main(String[] args) {
        System.out.println("A: " + Integer.toBinaryString('A'));
        System.out.println("!: " + Integer.toBinaryString('!'));
        System.out.println("x: " + Integer.toBinaryString('x'));
        System.out.println("7: " + Integer.toBinaryString('7'));
    }
} /* Output:
A: 1000001
!: 100001
x: 1111000
7: 110111
*///:~ 