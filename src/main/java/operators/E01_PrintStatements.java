//: operators/E01_PrintStatements.java
/****************** Exercise 1 *****************
 * Write a program that uses the "short" and
 * normal form of print statement.
 ***********************************************/
package operators;
import java.util.Date;
public class E01_PrintStatements {
    public static void main(String[] args) {
        Date currDate = new Date();
        System.out.println("Hello, it's: " + currDate);
        System.out.println("Hello, it's: " + currDate);
    }
} /* Output: (Sample)
Hello, it's: Wed Mar 30 17:39:26 CEST 2005
Hello, it's: Wed Mar 30 17:39:26 CEST 2005
*///:~ 