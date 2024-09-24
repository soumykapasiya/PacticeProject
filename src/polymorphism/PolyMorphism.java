package polymorphism;

import polymorphism.compiletime.CompileTime;


public class PolyMorphism {

    public static void main(String[] args) {

        // Compile Time Polymorphism:
        CompileTime ct = new CompileTime();

        System.out.println("Sum of num1 and num2: "+ ct.add(1,2));
        System.out.println("Sum of num1 and num2 in double: "+ct.add(2.3,2.3));
        System.out.println("Sum of num1,num2 and num3: "+ ct.add(1,2,3));
    }
}

