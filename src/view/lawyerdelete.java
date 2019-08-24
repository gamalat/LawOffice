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
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author { H e l p e r }
 */
public class lawyerdelete  extends Application{
    Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
          GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setPadding(new Insets(20, 20, 20, 20));
        Scene scene = new Scene(pane, 300, 300);
        HBox Hsearch = new HBox(10);
        TextField search = new TextField();
       search.setTooltip(new Tooltip("Enter ssn of lawyer"));
        Button btnsearch = new Button("delete");
        Hsearch.setAlignment(Pos.BOTTOM_LEFT);
        Hsearch.getChildren().addAll(btnsearch, search);
      
        pane.add(Hsearch, 0, 0);
          primaryStage.setTitle("Delete lawyer");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
