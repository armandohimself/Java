package com.dojo.sandbox.CodingExercises.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class ReflectionAPIBasics {
    public static void main(String[] args) {

        //! OBTAIN CLASS OBJECT

        // 1. Use .class
        Class<?> clazz = String.class;
        System.out.println(clazz);

        // 2. Use .getClass()
        Class<?> clazzGetClass = "String Class".getClass();
        System.out.println(clazzGetClass);

        // 3. use Class.forName()
        try {
            Class<?> clazzClassForName = Class.forName("java.lang.String");
            System.out.println(clazzClassForName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //? NOTES
        /*
         * The ? means an unknown type which means you can't/won't be able perform operations that depend on the specific type
        EXAMPLE
        List<?> list = new ArrayList<>();
        list.add("String"); // Error: You can't add to a List<?> because its type is unknown.
         */

        //! OBTAIN CLASS MEMBERS
        // step 1
        Class<?> classObj = Object.class;
        System.out.println(classObj + "\n");

        // step 2
        Method[] members = classObj.getDeclaredMethods(); // .getDeclaredMethods returns an array of objects of the type Member
        for (Member member : members) {
        System.out.println(member);
        }
        // * Method is the supertype of the class Field, Method, & Constructor

        // step 3
        try {
            Method method = (Method) classObj.getDeclaredMethod("getClass");
            System.out.println(method);
            System.out.println(method.invoke("hello world"));
        } catch (NoSuchMethodException e) {
                e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}