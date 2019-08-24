package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author { H e l p e r }
 */
public class login extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gp = new GridPane();
        gp.setHgap(20);
        gp.setVgap(10);
        gp.setAlignment(Pos.CENTER);
        gp.setScaleX(0.9);

        Label login = new Label("Our Office");
        login.setFont(Font.font("tahoma", FontWeight.BOLD, 28));
        //login.setTextFill(Color.WHITE);

        // login.setTooltip(new Tooltip("login hotel system"));
        gp.add(login, 0, 0);
        Label username = new Label("Email");
        username.setFont(Font.font("tahoma", FontWeight.MEDIUM, 16));

        // username.setTextFill(Color.WHITE);
        gp.add(username, 0, 1);
        Label password = new Label("Password");
        password.setFont(Font.font("tahoma", FontWeight.MEDIUM, 16));
        //  password.setTextFill(Color.WHITE);
        gp.add(password, 0, 2);
        TextField usertf = new TextField();
  //      usertf.setFont(Font.font("tahoma", FontWeight.MEDIUM, 12));
        gp.add(usertf, 2, 1);
        usertf.setPromptText("enter user email");
        usertf.setPrefSize(200, 30);

        PasswordField passwordf = new PasswordField();
        // passwordf.setText("");
        passwordf.setPrefSize(200, 20);
    //    passwordf.setFont(Font.font("tahoma", FontWeight.MEDIUM, 14));
        gp.add(passwordf, 2, 2);
        passwordf.setPromptText("enter user password");

        Button login1 = new Button("login");

        login1.setFont(Font.font("tahoma", FontWeight.MEDIUM, 16));

        gp.add(login1, 3, 4);
        login1.setPrefSize(70, 20);
        primaryStage.setTitle("              welcOme  tO  Our  law Office");
       

        Scene s = new Scene(gp, 600, 600);

        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
