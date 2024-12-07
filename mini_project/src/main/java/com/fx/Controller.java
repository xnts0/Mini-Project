package com.fx;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;

import java.util.Optional;

public class Controller {
    @FXML
    private Button addTaskButton;
    @FXML
    private Button updateTaskButton;
    @FXML
    private Button removeTaskButton;
    @FXML
    private VBox taskList;

    private TaskManager rootManager;

    @FXML
    public void initialize() {
        rootManager = new TaskManager("Root", false);
    }
    // I'm Abdullah I will do this method
    @FXML
    public void onAddTaskClick() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Add Task");
        dialog.setHeaderText("Enter the task name:");
        dialog.setContentText("Name:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            String taskName = result.get();
            // Create a new TaskManager representing a single (leaf) task
            TaskManager newTask = new TaskManager(taskName, false);
            rootManager.addTask(newTask);

            CheckBox cb = new CheckBox(taskName);
            cb.setUserData(newTask);
            // Update isDone when checkbox toggled
            cb.selectedProperty().addListener((obs, oldVal, newVal) -> {
                ((TaskManager)cb.getUserData()).setDone(newVal);
            });

            taskList.getChildren().add(cb);
        }


    } 
    
    // I'm Saleh ill do this method
    @FXML
    public void onRemoveTaskClick() {
        for (int i = taskList.getChildren().size() - 1; i >= 0; i--) {
            CheckBox cb = (CheckBox) taskList.getChildren().get(i);
            if (cb.isSelected()) {
                Task taskToRemove = rootManager.getTasks().get(i);
                rootManager.removeTask(taskToRemove);
                taskList.getChildren().remove(i);
            }
        }
    }

    // I am Manaf I will do This Method
    @FXML
    public void onUpdateTaskClick() {
     TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Update Task");
        dialog.setHeaderText("Enter the new task name:");
        dialog.setContentText("New Name:");

        Optional<String> newNameResult = dialog.showAndWait();
        if (newNameResult.isPresent()) {
            String newName = newNameResult.get();

            for (int i = 0; i < taskList.getChildren().size(); i++) {
                CheckBox cb = (CheckBox) taskList.getChildren().get(i);
                if (cb.isSelected()) {
                    rootManager.updateTask(i, newName);
                    cb.setText(newName);
                    cb.setSelected(false);
                }
            }
        }

    }

