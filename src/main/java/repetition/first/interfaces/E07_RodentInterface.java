//: interfaces/E07_RodentInterface.java
/****************** Exercise 7 ******************
 * Change Rodent to an interface in Exercise 9 of
 * the Polymorphism chapter.
 ***********************************************/
package repetition.first.interfaces;

interface Rodent2 {
    void hop();

    void scurry();

    void reproduce();
}

class Mouse2 implements Rodent2 {
    public void hop(){
        System.out.println("Mouse hopping");
    }

    public void scurry(){
        System.out.println("Mouse scurrying");
    }

    public void reproduce(){
        System.out.println("Making more Mice");
    }

    public String toString(){
        return "Mouse";
    }
}

class Gerbil2 implements Rodent2 {
    public void hop(){
        System.out.println("Gerbil hopping");
    }

    public void scurry(){
        System.out.println("Gerbil scurrying");
    }

    public void reproduce(){
        System.out.println("Making more Gerbil");
    }

    public String toString(){
        return "Gerbil";
    }
}

class Hamster2 implements Rodent2 {
    public void hop(){
        System.out.println("Hamster hopping");
    }

    public void scurry(){
        System.out.println("Hamster scurrying");
    }

    public void reproduce(){
        System.out.println("Making more Hamsters");
    }

    public String toString(){
        return "Hamster";
    }
}

public class E07_RodentInterface {
    public static void main(String[] args) {
        Rodent2[] rodents = {new Mouse2(), new Gerbil2(), new Hamster2()};
        for (Rodent2 r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }

    }
}
