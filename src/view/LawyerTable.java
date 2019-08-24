/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.lawyer;

/**
 *
 * @author { H e l p e r }
 */
public class LawyerTable extends Pane {

    TableView<lawyer> table;

    public LawyerTable() {
        Pane pane = new Pane();
        table = new TableView<>();
        table.setLayoutX(0);
        table.setLayoutY(40);
        ///////////////////////////
        TextField search = new TextField();
        search.setLayoutX(345);
        search.setLayoutY(5);
        //////////////////////////
        Button btnsearch = new Button("     Search        ");
        btnsearch.setLayoutX(500);
        btnsearch.setLayoutY(5);
        // h.setPadding(10);
        ////////////////////////////////////////
        //("     Search        ");
        Button add = new Button("      Add          ");
        add.setLayoutX(600);
        add.setLayoutY(5);
       
           

      
        ////////////////////////  ("     Search         ");
        Button update = new Button("     update         ");
        update.setLayoutX(695);
        update.setLayoutY(5);
       
            
           

     
        ///////////////////////////("     Search         ");
        Button delete = new Button("     delete         ");
        delete.setLayoutX(800);
        delete.setLayoutY(5);
        
            
           

        })
        /////////////////////////////////////////////////
        TableColumn<lawyer, String> idcolum = new TableColumn<>("lawyer_id");
        idcolum.setMinWidth(200);
        idcolum.setCellValueFactory(new PropertyValueFactory<>("lawyer_id"));
        ////////////////////////////////////////
        TableColumn<lawyer, String> fnamecolum = new TableColumn<>("first_name");
        fnamecolum.setMinWidth(100);
        fnamecolum.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        ///////////////////////////////////////
        TableColumn<lawyer, String> lnamecolum = new TableColumn<>("last_name");
        lnamecolum.setMinWidth(100);
        lnamecolum.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        ////////////////////////////////////////
        TableColumn<lawyer, String> phonecolum = new TableColumn<>("phone");
        phonecolum.setMinWidth(100);
        phonecolum.setCellValueFactory(new PropertyValueFactory<>("phone"));
        ////////////////////////////////////////
        TableColumn<lawyer, String> addresscolum = new TableColumn<>("address");
        addresscolum.setMinWidth(100);
        addresscolum.setCellValueFactory(new PropertyValueFactory<>("address"));
        ////////////////////////////////////////
        TableColumn<lawyer, String> emailcolum = new TableColumn<>("email");
        emailcolum.setMinWidth(100);
        emailcolum.setCellValueFactory(new PropertyValueFactory<>("email"));
        ////////////////////////////////////////
        TableColumn<lawyer, Integer> agecolum = new TableColumn<>("age");
        agecolum.setMinWidth(100);
        agecolum.setCellValueFactory(new PropertyValueFactory<>("age"));
        ////////////////////////////////////////

        // table.setItems(getResult());
        table.getColumns().addAll(idcolum, fnamecolum, lnamecolum, phonecolum, addresscolum, emailcolum, agecolum);
        pane.getChildren().addAll(table, add, update, delete, search, btnsearch);
        this.getChildren().add(pane);

    }

}
