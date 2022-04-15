package com.hoja;

public class CarFactory {
    public static Car geCar (int c){
        switch (c)
        {
            case 1:
                return new Dodge ();
            case 2:
                return new Ford ();
            case 3:
                return new Corvette();
            case 4:
                return new GMC ();
        }
        return null ;
    }
}
