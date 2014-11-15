package com.aug.oop;

public class Main {

    public static void main(String[] args) {

//        com.aug.oop.Person person = new com.aug.oop.Person("a", "m");
//        System.out.println(person);

        Student student = new Student();
        student.setFirstName("I am a student");
        student.setLastName(" xxxxx");

        System.out.println("student first name is : " + student.getFirstName());
        System.out.println("student last name is : " + student.getLastName());

        student.walk();
        System.out.println(student.aa());
    }
}
