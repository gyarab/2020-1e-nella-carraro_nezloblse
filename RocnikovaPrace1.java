/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocnikovaprace1;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RocnikovaPrace1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent titul = FXMLLoader.load(getClass().getResource("FXMLDocument_1.fxml"));
        Scene sceneTitul = new Scene(titul);
        stage.setScene(sceneTitul);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
