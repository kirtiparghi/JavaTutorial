/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

/**
 *
 * @author macstudent
 */
public class StudentManagement {
    
    public static void main(String[] args) {
        Student s = new Student();
        s.studentId = 1;
        s.name = "Kirti";
        s.marks = new int[]{1,2,3};
        
        int total = 0;
        for (int index = 0 ; index < s.marks.length; index++) {
            total += s.marks[index];
        }
        
        s.total = total;

        s.printStudentDetails();
    }
    
}
