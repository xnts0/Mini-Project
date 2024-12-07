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


    } 
    
    // I'm Saleh ill do this method
    @FXML
    public void onRemoveTaskClick() {
    
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

