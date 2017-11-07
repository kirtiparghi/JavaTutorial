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
public class HelloJava {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Test - Welcome to JAVA Programming...");
        
        int a, b;
        a = 14;
        b = 2;
        int c = a + b;
        
        System.out.println(c);
        
        HelloJava obj = new HelloJava();
        obj.greet("Kirti");   
        obj.greet();
    }

    void greet() {
        System.out.println("Welcome to programming world");
    }
    
    void greet(String name) {
        System.out.println(name);
    }
}
