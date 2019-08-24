/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author { H e l p e r }
 */
public class addlawyerframe extends Application {

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setPadding(new Insets(20, 20, 20, 20));

        Label first_name = new Label("first Name :");
        TextField firstname = new TextField();

        Label mid_name = new Label("Mid Name :");
        TextField midname = new TextField();

        Label last_name = new Label("Last Name :");
        TextField lastname = new TextField();

        Label phone_num = new Label("phone number :");
        TextField phonenum = new TextField();

        Label national_id = new Label("National ID :");
        TextField nationalID = new TextField();

        Label age = new Label("Age :");
        TextField tfage = new TextField();

        Label email = new Label("email :");
        TextField e_mail = new TextField();

        Label password = new Label("Password :");
        PasswordField Password = new PasswordField();

        Button submit = new Button("submit");
        VBox Vsubmit = new VBox(20);
        Vsubmit.setAlignment(Pos.BOTTOM_LEFT);
        Vsubmit.getChildren().add(submit);
        pane.add(Vsubmit, 2, 8);

        //add label on pane
        pane.add(first_name, 0, 0);
        pane.add(mid_name, 0, 1);
        pane.add(last_name, 0, 2);
        pane.add(phone_num, 0, 3);
        pane.add(national_id, 0, 4);
        pane.add(age, 0, 5);
        pane.add(email, 0, 6);
        pane.add(password, 0, 7);

        /////////////////add text  field
        pane.add(firstname, 2, 0);
        pane.add(midname, 2, 1);
        pane.add(lastname, 2, 2);
        pane.add(phonenum, 2, 3);
        pane.add(nationalID, 2, 4);
        pane.add(tfage, 2, 5);
        pane.add(e_mail, 2, 6);
        pane.add(Password, 2, 7);
        Scene scene = new Scene(pane, 400, 400);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
