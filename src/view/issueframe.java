package view;

import com.sun.javafx.tk.FontMetrics;
import com.sun.javafx.tk.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.IssueClass;

public class issueframe extends Pane {

    TableView<IssueClass> table;

    public issueframe() {
        Pane paneissues = new Pane();
        javafx.scene.control.TableColumn ColNUM = new javafx.scene.control.TableColumn("      Issue Num      ");
        ColNUM.setCellValueFactory(new PropertyValueFactory<>("Issue Num"));

       // ColNUM.prefWidthProperty().bind(table.widthProperty().multiply(0.3));
        // ColNUM.setResizable(false);
        javafx.scene.control.TableColumn ColName = new javafx.scene.control.TableColumn("     Issue Name      ");
        ColName.setCellValueFactory(new PropertyValueFactory<>("Issue Name"));
        javafx.scene.control.TableColumn ColType = new javafx.scene.control.TableColumn("     Issue Type      ");
        ColType.setCellValueFactory(new PropertyValueFactory<>("Issue Type"));
        javafx.scene.control.TableColumn ColDate = new javafx.scene.control.TableColumn("     Issue Date       ");
        ColDate.setCellValueFactory(new PropertyValueFactory<>("Issue Date"));
        javafx.scene.control.TableColumn Coldesc = new javafx.scene.control.TableColumn("Issue Description");
        Coldesc.setCellValueFactory(new PropertyValueFactory<>("DUMMY"));
        FontMetrics fontMetrics = Toolkit.getToolkit().getFontLoader().getFontMetrics(new Font("Arial", 10));
        Callback<TableColumn<IssueClass, String>, TableCell<IssueClass, String>> cellFactory
                = new Callback<TableColumn<IssueClass, String>, TableCell<IssueClass, String>>() {
            final Button btn = new Button("Description");

            @Override
            public TableCell call(final TableColumn<IssueClass, String> param) {
                final TableCell<IssueClass, String> cell = new TableCell<IssueClass, String>() {

                    @Override
                    public void updateItem(String item, boolean empty) {

                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                            setText(null);

                        } else {
                            setGraphic(btn);
                            setText(null);

                       }

                    }

                };

                return cell;
            }

        };

        Coldesc.setCellFactory(cellFactory);  
        table = new TableView<>();
        table.setLayoutX(0);
        table.setLayoutY(40);
        //table.setItems(data);
        table.minWidth(500);
        table.getColumns().addAll(ColNUM, ColName, ColType, ColDate, Coldesc);
        ///////////////////////////
        Button btnviewall = new Button("ViewAll");
        btnviewall.setLayoutX(10);
        btnviewall.setLayoutY(5);
        ///////////////////////
        Button btnbooked = new Button("Finished");
        btnbooked.setLayoutX(75);
        btnbooked.setLayoutY(5);
        ///////////////////////////////
        TextField search = new TextField();
        search.setLayoutX(345);
        search.setLayoutY(5);
        //////////////////////////
        Button btnavialable = new Button("Not finished");
        btnavialable.setLayoutX(140);
        btnavialable.setLayoutY(5);
        ////////////////////////////////
        Button btnsearch = new Button("     Search        ");
        btnsearch.setLayoutX(500);
        btnsearch.setLayoutY(5);
       /////////////////
        Button btnADD = new Button    ("     Add           ");
        btnADD.setLayoutX(600);
        btnADD.setLayoutY(5);
        btnADD.setMaxWidth(100.0);
       
//        ////////////////////
        Button btnEdite = new Button   ("     Update        ");
        btnEdite .setLayoutX(700 );
        btnEdite.setLayoutY(5);
       
            
      
    }

}
