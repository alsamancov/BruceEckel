//: interface/E06_InterfacePublicMethods.java
/****************** Exercise 6 ******************
 * Prove that all the methods in an interface are
 * automatically public.
 ***********************************************/
package repetition.second.interfaces;

import repetition.second.interfaces.ownpackage.AnInterface;

public class E06_InterfacePublicMethods implements AnInterface {
    //Each of these produces a compile-time error message,
    // starting that you cannot reduce the access of the
    // base class public method in a derived class.
    // ! void f(){}
    // ! void g(){}
    // ! void h(){}
    // Compile OK:
    public void f(){

    }
    public void g(){

    }
    public void h(){

    }
} ///:~
