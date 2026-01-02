package com.dojo.sandbox.CodingExercises.List.ToDoList;

import java.util.*;

public class ToDo{
    protected static List<String> todoList = new ArrayList<>();

    public void addTask(String task) {
        todoList.add(task);
    }

    public void deleteTask(String task) {
        todoList.remove(task);
    }

    public void changeTaskPosition(String task, int index) {
        todoList.set(index, task);
    }

    public void editTask(String oldTask, String newTask) {
        // get indexOf a task
        int index = todoList.indexOf(oldTask);

        changeTaskPosition(newTask, index);
    }

    public void reverseTask(String task) {
        // get indexOf a task
        int index = todoList.indexOf(task);

        StringBuilder sb = new StringBuilder(task);
        sb.reverse();
        System.out.println("String reversed to: " + sb.toString());
    
        changeTaskPosition(sb.toString(), index);
    }

    public void displayTasks() {
        System.out.println(todoList);
    }
}