package OOP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
        // Student kunal;
        // kunal = new Student();

        Student kunal = new Student();
        Student random = new Student(kunal);

        // System.out.println(random.name);

        // kunal.rno = 34;
        // kunal.name = "Ankit";
        // kunal.marks = 91;

        // kunal.changeName("Shoe lover");
        // kunal.greeting();

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
    }
}

// create a class
class Student {
    int rno;
    String name;
    float marks = 98.9f;

    // we need a way to add the values of the above prop object by object
    // we need one word to access every object

    void greeting() {
        System.out.println("Hello, my name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }

    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student() {
        // this is how you call a constructor from another constructor
        // Internally: new Student(13, "Ankit", 100.8f);
        this (13, "Ankit", 100.8f);
    }

    // Student arpit = new Student(17, arpit, 89.7f);
    // here, this will be replaced with arpit
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
