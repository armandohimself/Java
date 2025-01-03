package com.armando.sandbox.CodingExercises.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// 2
class ToStringTest {
    public static void main(String[] args) {
        System.out.println(ToString.toString("Hans"));
    }
}

// 1
class ToString {
    static String toString(Object o) {
        if (o == null) return "null"; // Handle null input
        
        // return the name of the class object instance that was passed
        Class<?> classObject = o.getClass();
        StringBuilder sb = new StringBuilder(classObject.getSimpleName() + "{");

        // 3
        System.out.println("------- FIELDS -------");
        Field[] allFields = classObject.getDeclaredFields();
        boolean firstField = true; // Track the first non-static field
        
        for (Field field : allFields) {
            // 5) Skip static fields
            if (Modifier.isStatic(field.getModifiers())) {
                continue;
            }

            // Access private fields
            //field.setAccessible(true);

            // Add a comma for all fields except the first
            if (!firstField) {
                sb.append(", ");
            }
            firstField = false;

            // Append the field name + 4) Append field type
            // 6) Append the "fieldName: fieldType = value"
            sb.append(field.getName() + ": " + field.getType().getSimpleName() + " = " + field.toString());
        }

        // return string format: "classname{fieldName1, fieldName2,....,fieldNameN}"
        sb.append("}");
        System.out.println(sb.toString());


        System.out.println("------- CLASS NAME -------");
        return classObject.toString();
    }
}




/*
 * Exercises (Optional)
Normally it is up to the programmer to write a toString() method for each class one creates. This exercise is about writing a general toString() method once and for all. As part of the Reflection API for Java, it is possible to find out which fields exist for a given object, and to get their values. The purpose of this exercise is to make a toString() method that gives a printed representation of any object, in such a manner that all fields are printed, and references to other objects are handled as well.

To solve the exercises, you will need to examine the java.lang.reflect API.

1) [] Write a class ToString with one static method "String toString(Object o)". The first version should just return the name of the class the object is an instance of. 

2) [] Write another class, ToStringTest, which prints the result of calling "ToString.toString("Hans")".

3) [] Extend the toString method. This time it should find out which fields exist in the object, and return a string of the format "classname{fieldName1, fieldName2,....,fieldNameN}". When this works, make sure you do not print out a superfluous comma just before the closing brace.

4) [] Extend the toString method, so that each field is printed in the form "fieldName: fieldType".

5) [] We do not want static fields to be included in the printout. Make sure no static fields are printed. Keep testing the method using the ToStringTest method.

6) [] Extend the method to print out the values of each field using Java's built in toString method. The format for each field should now be "fieldName: fieldType = value". 

7) [] Note, the value of a private field can be read after you use the "setAccessible(true)" method that fields inherit from AccessibleObject.

A field might be an Array. If it is, write each value in the array as "[val1, val2, val3,..., valN]". Optional extra. If the array has more than 15 elements, only the first 15 should be printed, and the rest should be printed as "...". Hint on retrieving values from an Array: Try looking at the documentation of the Array class in the API.
 */