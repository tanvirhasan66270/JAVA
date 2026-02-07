package com.mycompany.objectclass;

public class Calculetor {

//    public double a;
//    public double b;
//
//    public Calculetor(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public double sum() {
//
//        return (a + b);
//    }
//
//    public double subtraction() {
//        return (a - b);
//    }
//
//    public double multiplication() {
//        return (a * b);
//    }
//
//    public double division() {
//        return (a / b);
//    }
//    
    public double calculate(int a, int b, String sing) {

        if (sing.equals("+")) {
            return a + b;
        } else if (sing.equals("-")) {
            return a - b;
        } else if (sing.equals("*")) {
            return a * b;
        } else if (sing.equals("/")) {
            return a / b;
        }
        return 0;

    }

}
