/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.javafx.tk.FontMetrics;
import com.sun.javafx.tk.Toolkit;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.IssueClass;

public class LawOfficePro extends Application {

    IssueClass issues = new IssueClass();

    LawyerTable lawyer = new LawyerTable();
    issueframe issuesframe = new issueframe();
    LawyerTable lawyerframe = new LawyerTable();

    @Override
    public void start(Stage primaryStage) throws Exception {
        TabPane tabPane = new TabPane();
        Tab tabissue = new Tab();
        tabissue.setText("                                                           issues                                                                 ");
        Tab tablawyer = new Tab();
        tablawyer.setText("                                                          lawyers                                                                ");
        Pane panelawyer = new Pane();

        tabissue.setContent(issuesframe);
        tablawyer.setContent(lawyerframe);
        tabPane.getTabs().add(tabissue);
        tabPane.getTabs().add(tablawyer);
        Scene scene = new Scene(tabPane, 900, 600);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

}
