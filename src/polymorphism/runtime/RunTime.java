package polymorphism.runtime;

import polymorphism.runtime.child.Child1;
import polymorphism.runtime.parent.Parent;

public class RunTime {

    public static void main(String[] args) {
        // Run Time Polymorphism:
        Parent pt = new Parent();
        Child1 c1 = new Child1();
        Child1 c2 = new Child1();

        pt.print();
        c1.print();
        c2.print();

    }
}
