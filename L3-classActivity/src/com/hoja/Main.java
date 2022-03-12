package com.hoja;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        System.out.print("enter your first name:");
        person1.name = person1.getName();
        System.out.print("enter your last name:");
        person1.family = person1.getFamily();
        System.out.print("please enter your age: ");
        person1.age = person1.getAge();

        System.out.print("enter your first name:");
        person2.name = person2.getName();
        System.out.print("enter your last name:");
        person2.family = person2.getFamily();
        System.out.print("please enter your age: ");
        person2.age = person2.getAge();


        String per1 = person1.name + person1.family + person1.age;
        String per2 = person2.name + person2.family + person2.age;

        System.out.println(per1);
        System.out.println(per2);



         DuplicatePerson test = new DuplicatePerson();
        try {
            test.Sameperson(per1,per2);

        }catch (SamePersonEror e){
            e.SamePerson("same person eror");
        }


    }
}
