package com.hoja;

public class DuplicatePerson {
    public void Sameperson(String a , String b) throws SamePersonEror {
        if (a.equals(b))
            throw new SamePersonEror();
    }

}
