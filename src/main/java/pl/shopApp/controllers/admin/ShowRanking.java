package pl.shopApp.controllers.admin;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class ShowRanking extends AnchorPane {

    FXMLLoader fxmlLoader;
    {
        try {
            fxmlLoader = new FXMLLoader(new File("D:\\JavaFX\\ShopApp\\src\\main\\java\\pl\\" +
                    "shopApp\\resources\\ShowRanking.fxml").toURI().toURL());
            fxmlLoader.setRoot(this);
            //fxmlLoader.setController(this);
            fxmlLoader.load();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
