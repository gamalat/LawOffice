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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author { H e l p e r }
 */
public class addIssue  extends Application{
    Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gp = new GridPane();
         gp.setHgap(5);
       gp.setVgap(5);
         gp.setPadding(new Insets(20, 20, 20, 20));
        Label iss_num = new Label("issues Number");
        TextField iss_num1 = new TextField();
        Label iss_name = new Label("issues Name");
        TextField iss_name1 = new TextField();
        Label type = new Label("type");
        TextField type1 = new TextField();
        Label date = new Label("date of judgement");
        TextField date1 = new TextField();

        gp.add(iss_num, 0, 0);
        gp.add(iss_num1, 1, 0);
        gp.add(iss_name, 0, 1);
        gp.add(iss_name1, 1, 1);
        gp.add(type, 0, 2);
        gp.add(type1, 1, 2);
        gp.add(date, 0, 3);
        gp.add(date1, 1, 3);
       gp.setAlignment(Pos.CENTER);

       
      primaryStage.setTitle("  add issues  ");
        Scene scene = new Scene(gp, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
}
