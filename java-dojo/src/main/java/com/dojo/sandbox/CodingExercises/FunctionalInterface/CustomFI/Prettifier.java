package com.dojo.sandbox.CodingExercises.FunctionalInterface.CustomFI;

public interface Prettifier {
    /**
     * This method should take in an Object, translate it to a pretty String, and return the String.
     * 
     * @param obj - the Object to prettify
     * @return - A pretty String
     */
    public abstract String prettify(Object obj);
}