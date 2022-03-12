package com.hoja;

public class Test {
    public void nameTest(String a,String b) throws WrongFields {
        if (!(a.equals(b)))
            throw new WrongFields();
    }
    public void userNameTest(String a,String b) throws WrongFields {
        if (!(a.equals(b)))
            throw new WrongFields();
    }
    public void passWorldTest(String a,String b) throws WrongFields{
        if (!(a.equals(b)))
            throw new WrongFields();
    }
}

