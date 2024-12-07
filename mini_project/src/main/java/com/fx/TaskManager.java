package com.fx;

import java.util.ArrayList;

public class TaskManager extends Task {
        private ArrayList<Task> tasks;

    TaskManager(String name, boolean isDone) {
        super(name, isDone);
        tasks = new ArrayList<>();

    }

    // Im Abdullah I will do add task
    @Override
    public void addTask(Task task){

    }
    // I'm Saleh ill do remove task
    @Override
    public void removeTask(Task task) {

    }

    //Im Manaf Hamadi i wiil do update task
    @Override
    public void updateTask(int index, String newName) {
        
    }
}
