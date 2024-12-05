package com.fx;
//Faisal Hassan Ahmed Sumayli
//Create parent class and GUI
public abstract class Task {
    private String name;
    private boolean isDone;

    public Task(String name, boolean isDone) {
        this.name = name;
        this.isDone = isDone;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return isDone;
    }
    abstract public void addTask(Task task);
    abstract public void removeTask(Task task);
    abstract public void updateTask(int index, String newName);
}
