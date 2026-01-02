package com.dojo.sandbox.RevatureStudyGuide.Package.mypack;
import com.dojo.sandbox.RevatureStudyGuide.Package.pack.A;  // Correct import for using class A

class B {
    public static void main(String args[]) {
        A obj = new A();  // Correct usage of A from the imported package
        obj.msg();        // This will print "Hello"
    }
}