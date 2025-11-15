package ex1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.print.attribute.TextSyntax;
import javax.swing.text.html.ImageView;
import java.awt.*;

public class Exercise1 extends Application {

    public void start(Stage stage) {

        Label titleLeft = new Label("Java Programming");
        titleLeft.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Label titleRight = new Label("COMP_228");
        titleRight.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        BorderPane titlePane = new BorderPane();
        titlePane.setPadding(new Insets(10));
        titlePane.setLeft(titleLeft);
        titlePane.setRight(titleRight);


        ImageView logo = new javax.swing.text.html.ImageView(new Image("https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/656px-Java_programming_language_logo.svg.png"));
        logo.setFitWidth(60);
        logo.setFitHeight(60);

        TextField nameField = new TextField();
        TextField addressField = new TextField();
        TextField provinceField = new TextField();
        TextField cityField = new TextField();
        TextField postalField = new TextField();
        TextField phoneField = new TextField();
        TextField emailField = new TextField();

        GridPain formGrid = new GridPane();
        formGrid.setPadding(new java.awt.Insets(20));
        formGrid.setVgap(10);
        formGrid.setHgap(10);

        formGrid.add(logo, 0, 0);
            formGrid.add(new Label("Name:"), 0, 1);
        formGrid.add(nameField, 1, 1);

            formGrid.add(new Label("Address:"), 0, 2);
                formGrid.add(nameField, 1, 2);

        formGrid.add(new Label("Province:"), 0, 3);
        formGrid.add(nameField, 1, 3);

        formGrid.add(new Label("City:"), 0, 4);
        formGrid.add(nameField, 1, 4);

         formGrid.add(new Label("Postal Code:"), 0, 5);
          formGrid.add(postalField, 1, 5);

        formGrid.add(new Label("Phone Number:"), 0, 6);
           formGrid.add(phoneField, 1, 6);

        formGrid.add(new Label("Email:"), 0, 7);
        formGrid.add(emailField, 1, 7);
        CheckBox councilCheck = new CheckBox("Student Council");
         CheckBox volunteerCheck = new CheckBox("Volunteer Work");

          VBox activityBox = new VBox(15, councilCheck, volunteerCheck);
        activityBox.setPadding(new Insets(20, 20, 20, 20));

        RadioButton csButton = new RadioButton("Computer Science");
        RadioButton businessButton = new RadioButton("Business");

        ToggleGroup majorGroup = new ToggleGroup();
          csButton.setToggleGroup(majorGroup);
        businessButton.setToggleGroup(majorGroup);

        HBox majorBox = new HBox(20, csButton, businessButton);
         majorBox.setPadding(new Insets(10));
        majorBox.setAlignment(Pos.CENTER_LEFT);
        ComboBox<String> courseCombo = new ComboBox<>();

        ObservableList<String> csCourses = FXCollections.observableArrayList(
                "Java", "Python", "C#", "Data Structures"
        );
        ObservableList<String> businessCourses = FXCollections.observableArrayList(
                "Marketing", "Accounting", "Business Law", "Finance"
        );

        ListView<String> courseList = new ListView<>();
        ObservableList<String> selectedCourses = FXCollections.observableArrayList();
          courseList.setItems(selectedCourses);

         majorGroup.selectedToggleProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal == csButton) courseCombo.setItems(csCourses);
            else if (newVal == businessButton) courseCombo.setItems(businessCourses);
        });

        courseCombo.setOnAction(e -> {
              String course = courseCombo.getValue();
            if (course != null && !selectedCourses.contains(course)) {
                selectedCourses.add(course);
            }
        });

        VBox rightBox = new VBox(10, majorBox, courseCombo, courseList);
        rightBox.setPadding(new Insets(10));

        Button displayButton = new Button("Display");

        TextArea outputArea = new TextArea();
        outputArea.setPrefHeight(120);

        displayButton.setOnAction(e -> {

            StringBuilder sb = new StringBuilder();

            sb.append(nameField.getText()).append(", ")
                    .append(addressField.getText()).append(", ")
                    .append(cityField.getText()).append(" ")
                    .append(provinceField.getText()).append(" ")
                    .append(postalField.getText()).append(", ")
                    .append(phoneField.getText()).append(", ")
                    .append(emailField.getText()).append("\n\n");

            sb.append("Courses:\n");
            for (String c : selectedCourses) sb.append("* ").append(c).append("\n");

            sb.append("\nActivities:\n");
            if (councilCheck.isSelected()) sb.append("* Student Council\n");
            if (volunteerCheck.isSelected()) sb.append("* Volunteer Work\n");

            outputArea.setText(sb.toString());
        });

        VBox bottomBox = new VBox(10, displayButton, outputArea);
        bottomBox.setPadding(new Insets(10));

        BorderPane root = new BorderPane();
        root.setTop(titlePane);
        root.setLeft(formGrid);
        root.setRight(activityBox);
        root.setCenter(rightBox);
        root.setBottom(bottomBox);

        Scene scene = new Scene(root, 1150, 600);
        stage.setTitle("Student Information");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}