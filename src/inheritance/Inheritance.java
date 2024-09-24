package inheritance;

import inheritance.child.ChildClass;
import inheritance.parent.ParentClass;

public class Inheritance {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();

        obj.test();
        obj.patentMethod();
        obj.childMethod();
    }
}
