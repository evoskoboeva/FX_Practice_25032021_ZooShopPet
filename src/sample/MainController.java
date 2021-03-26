package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import sample.ZooShopPet.Cat;
import sample.ZooShopPet.Dog;
import sample.ZooShopPet.ZooShop;
import java.io.IOException;
import javafx.scene.control.Alert;
import java.io.File;
import java.time.LocalDate;


public class MainController {

    @FXML
    TextArea txtReport;
    @FXML
    TextField txtNameCat;
    @FXML
    TextField txtNameDog;
    @FXML
    DatePicker dpBithdayCat;
    @FXML
    DatePicker dpBithdayDog;
    @FXML
    DatePicker dpPurchaseDog;
    @FXML
    DatePicker dpPurchaseCat;
    @FXML
    TextField txtPriceCat;
    @FXML
    TextField txtPriceDog;
    @FXML
    TextField txtSize;
    @FXML
    TextField txtTypeFur;

    @FXML
    TextField txtWWWcat;
    @FXML
    TextField txtWWWdog;
    public static Stage InfoStage = new Stage();
    public String WWWOne="";
    @FXML
    ImageView imOne;
    @FXML
    TextField txtNameOne;







    Cat cat = new Cat("Kot", LocalDate.of(2011,02,15),100,
            LocalDate.of(2021, 03, 12), "long","www");
    Dog dog = new Dog(200,LocalDate.of(2015, 05, 05), "Pes",
            LocalDate.of(2021, 03, 13),"www2",70);
    ZooShop zooShop = new ZooShop();

     double price;
     LocalDate DateBirthday;
     public String name;
     LocalDate DatePurchase;

    public String getWww() {
        return www;
    }

    String www;
     String typeFur;
     private int size;
     LocalDate DateTemp = null;

    public void showReport(ActionEvent actionEvent) {

        /*zooShop.addAnimal(cat);
        zooShop.addAnimal(dog);
        */
        txtReport.setText("");
        txtReport.setText(zooShop.toString());
    }

    public void CreateDog(ActionEvent actionEvent) {
    name= txtNameDog.getText();
    DateBirthday = dpBithdayDog.getValue();
    size = Integer.parseInt(txtSize.getText());
    DatePurchase = dpPurchaseDog.getValue();
    price = Integer.parseInt(txtPriceDog.getText());

    Dog dogTemp = new Dog(price, DateBirthday, name, DatePurchase, www, size);
    zooShop.addAnimal(dogTemp);

    txtNameDog.setText("");
    txtPriceDog.setText("");
    txtSize.setText("");
    txtWWWdog.setText("");
    dpBithdayDog.setValue(DateTemp);
    dpPurchaseDog.setValue(DateTemp);
    WWWOne = www;



    }

    public void CreateCat(ActionEvent actionEvent) {
        name= txtNameCat.getText();
        DateBirthday = dpBithdayCat.getValue();
        typeFur = txtTypeFur.getText();
        DatePurchase = dpPurchaseCat.getValue();
        price = Integer.parseInt(txtPriceCat.getText());
        //www = txtWWWcat.getText();
        Cat catTemp = new Cat(name, DateBirthday, price, DatePurchase, typeFur, www);
        zooShop.addAnimal(catTemp);

        txtNameCat.setText("");
        txtPriceCat.setText("");
        txtTypeFur.setText("");
        txtWWWcat.setText("");
        dpBithdayCat.setValue(DateTemp);
        dpPurchaseCat.setValue(DateTemp);
        WWWOne = www;
    }

    public void ChooseFotoCat(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose photo...");
        File file = fileChooser.showOpenDialog(MainController.InfoStage);

        Alert alert = new Alert(Alert.AlertType.INFORMATION, file.getAbsolutePath(), ButtonType.OK, ButtonType.CANCEL);
        alert.setTitle("Мы выбирали фотографию...");
        alert.setHeaderText("И наконец-то выбрали");
        alert.setContentText(file.getAbsolutePath());
        //alert.showAndWait();
        alert.show();

        www = file.getAbsolutePath();
        txtWWWcat.setText(www);
        txtNameOne.setText(name);
        Image image = new Image(file.toURI().toString());
        imOne.setImage(image);





    }

    public void ChooseFotoDog(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose photo...");
        File file = fileChooser.showOpenDialog(MainController.InfoStage);

        Alert alert = new Alert(Alert.AlertType.INFORMATION, file.getAbsolutePath(), ButtonType.OK, ButtonType.CANCEL);
       // alert.setTitle("Мы выбирали фотографию...");
        alert.setHeaderText("Choose");
        alert.setContentText(file.getAbsolutePath());
        //alert.showAndWait();
        alert.show();
        www = file.getAbsolutePath();
               txtWWWdog.setText(www);
               txtNameOne.setText(name);
        Image image = new Image(file.toURI().toString());
        imOne.setImage(image);}

        public void ShowLast(ActionEvent actionEvent) {
            Parent mainForm = null;
            try
            {
                mainForm = FXMLLoader.load(getClass().getResource("One.fxml"));
                InfoStage.setTitle("Full info");
                InfoStage.setScene(new Scene(mainForm, 600, 400));

                InfoStage.show();
            } catch (IOException e)
            {
                e.printStackTrace();
            }

        }



    }



