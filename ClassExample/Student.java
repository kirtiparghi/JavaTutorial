package hellojava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Student {
    
    int studentId;
    String name;
    int[] marks;
    int total;
    
    Student() {
        studentId = 1;
        name = "";
        marks = new int[]{};
        total = 0;
    }
    
    Student(int studentId, String name, int[] marks, int total) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        this.total = total;               
    }
    
    void printStudentDetails() {
        System.out.println("Student id is " + studentId);
        System.out.println("Student name is " + name);
        
        for (int index = 0 ; index < marks.length; index++) {
                    System.out.println(marks[index]);
        }
        
        System.out.println("Student total is " + total);
    }
}