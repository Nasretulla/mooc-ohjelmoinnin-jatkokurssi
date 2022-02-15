package ilmoitin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IlmoitinSovellus extends Application {

    public void start(Stage ikkuna) {

        TextField ylaTeksti = new TextField();

        Button nappi = new Button("Päivitä!");
        Label alaTeksti = new Label();

        nappi.setOnAction((evetn) -> {
            alaTeksti.setText(ylaTeksti.getText());

        });

        VBox asettelu = new VBox();
        asettelu.setSpacing(10);

        asettelu.getChildren().addAll(ylaTeksti, nappi, alaTeksti);

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {

        launch(IlmoitinSovellus.class);
        System.out.println("Hello world!");
    }

}
