package com.dojo.sandbox.CodingExercises.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int[] numbers = {34,22,10,60,30,22};


        //! HASHSET
        Set<Integer> set = new HashSet<>();
        for(int num : numbers) {
            set.add(num);
        }
        System.out.println(set);


        //! TREESET
        TreeSet treeSet = new TreeSet<Integer>();
        for(int num : numbers) {
            treeSet.add(num);
        }
        System.out.println(treeSet);


        System.out.println("First element " + treeSet.first());
    }
}