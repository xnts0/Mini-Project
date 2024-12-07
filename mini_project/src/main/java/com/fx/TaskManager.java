package com.fx;

import java.util.ArrayList;
//Faisal Hassan Ahmed Sumayli
//create constructor and get task method
public class TaskManager extends Task {
        private ArrayList<Task> tasks;

    TaskManager(String name, boolean isDone) {
        super(name, isDone);
        tasks = new ArrayList<>();

    }

    // Im Abdullah I will do add task
    @Override
    public void addTask(Task task){
        tasks.add(task); 

    }
    // I'm Saleh ill do remove task
    @Override
    public void removeTask(Task task) {
        tasks.remove(task); 
    }

    //Im Manaf Hamadi i wiil do update task
    @Override
    public void updateTask(int index, String newName) {
        if (index >= 0 && index < tasks.size()) {
            Task t= tasks.get(index); t.setName(newName);
        }


    }
    
    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
