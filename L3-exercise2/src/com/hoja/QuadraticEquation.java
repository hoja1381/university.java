package com.hoja;

import java.util.Scanner;

public class QuadraticEquation {
    Scanner scanner = new Scanner(System.in);
    public double a;
    public double b;
    public double c;
    public double delta;

    public double getA(){
        a =scanner.nextDouble();
        return a;
    }
    public double getB(){
        b=scanner.nextDouble();
        return b;
    }
    public double getC(){
        c=scanner.nextDouble();
        return c;
    }
    public double getDelta(double a, double b, double c){
        double delta= ((Math.pow(b,2)) - (4*a*c));
        return delta;
    }
    public void deltaTest(double delta) throws DeltaLessThanZero {
        if (delta<0)
            throw new DeltaLessThanZero();
    }
    public double x1Founder (double a,double b,double delta){
        double x1 = ((-b+Math.sqrt(delta))/(2*a));
        return x1;
    }
    public double x2Founder (double a,double b,double delta){
        double x2 = ((-b-Math.sqrt(delta))/(2*a));
        return x2;
    }
}
