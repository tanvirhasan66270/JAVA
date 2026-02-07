package com.mycompany.objectclass;

public class calculetorClass {

    public static void main(String[] args) {
        
        Calculetor cal=new Calculetor();
      
        System.out.println(  cal.calculate(80, 70, "+"));
        System.out.println(  cal.calculate(80, 70, "-"));
        System.out.println(  cal.calculate(80, 70, "*"));
        System.out.println(  cal.calculate(80, 70, "/"));
        
        
        
//        Calculetor calculetor = new Calculetor(70, 20);
//
//        System.out.println(calculetor.sum());
//        System.out.println(calculetor.subtraction());
//        System.out.println(calculetor.multiplication());
//        System.out.println(calculetor.division());

    }
}
