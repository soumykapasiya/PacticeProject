package polymorphism.runtime.child;

import polymorphism.runtime.parent.Parent;

public class Child1 extends Parent {

    @Override
    public void print() {
        System.out.println("Child 1");
    }
}
