//: polymorphism/E09_Rodents.java
/****************** Exercise 9 *****************
 * Create an inheritance hierarchy of Rodent:
 * Mouse, Gerbil, Hamster, etc. In the base
 * class, provide methods that are common to all
 * Rodents, and override these in the derived
 * classes to perform different behaviors
 * depending on the specific type of Rodent.
 * Create an array of Rodent, fill it with
 * different specific types of Rodents, and call
 * your base-class methods to see what happens.
 ***********************************************/
package polymorphism;

class Rodent {
    public void hop() {
        System.out.println("Rodent hopping");
    }
    public void scurry() {
        System.out.println("Rodent scurrying");
    }
    public void reproduce() {
        System.out.println("Making more Rodents");
    }
    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent {
    public void hop() {
        System.out.println("Mouse hopping");
    }
    public void scurry() {
        System.out.println("Mouse scurrying");
    }
    public void reproduce() {
        System.out.println("Making more Mice");
    }
    public String toString() {
        return "Mouse";
    }
}

class Gerbil extends Rodent {
    public void hop() {
        System.out.println("Gerbil hopping");
    }
    public void scurry() {
        System.out.println("Gerbil scurrying");
    }
    public void reproduce() {
        System.out.println("Making more Gerbils");
    }
    public String toString() {
        return "Gerbil";
    }
}

class Hamster extends Rodent {
    public void hop() {
        System.out.println("Hamster hopping");
    }
    public void scurry() {
        System.out.println("Hamster scurrying");
    }
    public void reproduce() { 
        System.out.println("Making more Hamsters"); 
    }   
    public String toString() { 
        return "Hamster"; 
    } 
}

public class E09_Rodents {   
    public static void main(String args[]) {     
        Rodent[] rodents = {       
                new Mouse(),       
                new Gerbil(),       
                new Hamster(),     
        };
        for(Rodent r : rodents) {       
            r.hop();       
            r.scurry();       
            r.reproduce();       
            System.out.println(r); 
        } 
    
    }
}/* Output:
Mouse hopping
Mouse scurrying
Making more Mice
Mouse
Gerbil hopping
Gerbil scurrying
Making more Gerbils
Gerbil
Hamster hopping
Hamster scurrying
Making more Hamsters
Hamster
*///:~