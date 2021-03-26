package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sample.ZooShopPet.Cat;
import sample.ZooShopPet.Dog;
import sample.ZooShopPet.ZooShop;

import java.time.LocalDate;


public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        root.styleProperty().setValue(" -fx-background-color: white;  -fx-border-color: white; -fx-border-width: 7px;");

        primaryStage.setTitle("ZooShopPet-Cat");
        primaryStage.getIcons().add(new Image("sample/ikon.jpg"));
        primaryStage.setScene(new Scene(root,800,700));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);

    }
}
