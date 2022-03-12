package com.hoja;

public class Main {

    public static void main(String[] args) {
        QuadraticEquation equation =new QuadraticEquation();

        System.out.println("enter this numbers in the equation: \n aX^2+bX+c=0");
        System.out.print("enter a:");
        equation.a = equation.getA();
        System.out.print("enter b:");
        equation.b = equation.getB();
        System.out.print("enter c:");
        equation.c = equation.getC();

        equation.delta = equation.getDelta(equation.a, equation.b, equation.c);
        System.out.println("Delta = " + equation.delta);
        try {
            equation.deltaTest(equation.delta);
        } catch (DeltaLessThanZero e) {
            e.deltaZeroError();
        }
        if (!(equation.delta < 0)){
            System.out.print("x1 =");
            System.out.println(String.format("%.2f",equation.x1Founder(equation.a, equation.b, equation.delta)));
            System.out.print("x2 =");
            System.out.println(String.format("%.2f",equation.x2Founder(equation.a, equation.b, equation.delta)));
        }

    }
}
