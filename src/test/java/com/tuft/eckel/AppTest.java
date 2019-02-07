package com.tuft.eckel;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import polymorphism.newshape.Circle;
import polymorphism.newshape.Shape;
import polymorphism.newshape.Triangle;

import java.util.ArrayList;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    void doSomething(Shape shape) {

        shape.erase();
        // ...
        shape.draw();


        System.out.println("A String of things");


    }

    public static void main(String[] args) {
        System.out.println(new Date());


        ArrayList<Shape> shapes = new ArrayList<Shape>();

    }


    Circle circle = new Circle();
    Triangle triangle = new Triangle();
    Line line = new Line();
//    doSomething(circle);
//    doSomething(triangle);
//    doSomething(line);




    //String s;


    //String s = "asdf";


    String s = new String("asdf");

//    char c = 'x';
//    Character ch = new Character(c);

//    Character ch = new Character('x');


    Character ch = 'x';

    char c = ch;

    {
        int x = 12;
        // Only x available
        {
            int q = 96;
            // Both x & q available
        }
        // Only x available
        // q is "out of scope"
    }


    {
        int x = 12;
        {
//            int x = 96; // Illegal
        }
    }

    {
        String s = new String("a string");
    } // End of scope

    ATypeName a = new ATypeName();

    DataOnly data = new DataOnly();

    //objectReference.member


//    data.i = 47;
//    data.d = 1.1;
//    data.b = false;
//
//
//    myPlane.leftTank.capacity = 100;
//
//
//    int x;
//
//    ReturnType methodName( /* Argument list */ ) {
//        /* Method body */
//    }
//
//    objectName.methodName(arg1, arg2, arg3);
//
//    int x = a.f();


    int storage(String s) {
        return s.length() * 2;
    }



    boolean flag() { return true; }
    double naturalLogBase() { return 2.718; }
    void nothing() { return; }
    void nothing2() {}


}


class ATypeName { /* Class body goes here */ }


class DataOnly {
    int i;
    double d;
    boolean b;
}


class StaticTest {
    static int i = 47;
}



//    StaticTest st1 = new StaticTest();
//    StaticTest st2 = new StaticTest();


//    StaticTest.i++;


class Incrementable {
    static void increment() { StaticTest.i++; }
}

//
//            Incrementable sf = new Incrementable();
//            sf.increment();
//
//
//            Incrementable.increment();


/* This is a comment
 * that continues
 * across lines
 */


/* This is a comment that
continues across lines */

// This is a one-line comment

//@see classname
//@see fully-qualified-classname
//@see fully-qualified-classname#method-name
//
//
//@version version-information
//
//@author author-information
//
//@param parameter-name description
//
//
//        @return description
//
//        @throws fully-qualified-class-name description

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        // ...

        System.out.println("Rather a lot to type");


        // ...
    }
}
