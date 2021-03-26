package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.ZooShopPet.Cat;
import sample.ZooShopPet.ZooShopPet;

public class OneController extends MainController{

    @FXML
    ImageView imTwo;
    @FXML
    Label lblNameOne;
    @FXML
    TextField txtOne;


    public void loadLast(ActionEvent actionEvent) {
        Image image1 = new Image(cat.getWww());
        imTwo.setImage(image1);
        txtOne.setText(cat.getName());


    }
}
