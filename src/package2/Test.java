// Java Program to Illustrate
// Accessing Protected Members
// In Another Class in a
// Different Package

// Package 1
package package2;
// Importing above package
import package1.Sample;

// Main class
public class Test extends Sample {

    // Main driver method
    public static void main(String[] args) {

       Test test = new Test();
        System.out.println(test.year);
        System.out.println(test.title);
    }
}