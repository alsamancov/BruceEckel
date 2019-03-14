package onJava8.interfaces;

// interfaces/Machine.java

import onjava.Operations;

class Bing implements Operations{
    @Override
    public void execute() {
        Operations.show("Bing");
    }
}

class Crack implements Operations {
    @Override
    public void execute() {
        Operations.show("Crack");
    }
}

class Twist implements Operations {
    @Override
    public void execute() {
        Operations.show("Twist");
    }
}

public class Machine {
    public static void main(String[] args) {
        Operations.runOps(
                new Bing(), new Crack(), new Twist()
        );
    }
}
/* Output:
Bing
Crack
Twist
*/
