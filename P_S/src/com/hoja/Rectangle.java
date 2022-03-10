package com.hoja;

import java.text.Format;
import java.text.NumberFormat;

public class Rectangle {
    public double lenth;
    public double width;

    public double enviroment(){
        double P = (width+lenth);
        return (2*P);
    }
    public double area(){
        double S = (lenth*width);
        return S;
    }
}
