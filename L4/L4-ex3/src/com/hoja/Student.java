package com.hoja;

public class Student<Number,Name>{
    private Name studentName;
    public void setStudentName(Name studentName){this.studentName = studentName;}
    public Name getStudentName(){return studentName;}

    private Name studentFatherName;
    public void setStudentFatherName(Name studentFatherName){this.studentFatherName = studentFatherName ;}
    public Name getStudentFatherName(){return studentFatherName;}

    private Number studentNumber;
    public void setStudentNumber(Number studentNumber){this.studentNumber = studentNumber;}
    public Number getStudentNumber(){return studentNumber;}
}
