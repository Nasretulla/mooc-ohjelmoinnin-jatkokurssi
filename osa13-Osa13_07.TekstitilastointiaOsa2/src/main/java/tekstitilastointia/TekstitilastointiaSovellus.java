package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {

    public void start(Stage ikkuna) {

        BorderPane asettelu = new BorderPane();

        TextArea tekstikentta = new TextArea();

        HBox tekstit = new HBox();
        tekstit.setSpacing(10);

        Label sanat = new Label("Sanoja: ");
        Label kirjaimia = new Label("Kirjaimia: ");
        Label pisinSana = new Label("Pisin sana on: ");

        tekstit.getChildren().add(kirjaimia);
        tekstit.getChildren().add(sanat);
        tekstit.getChildren().add(pisinSana);

        tekstikentta.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;

            String pisin = Arrays.stream(palat)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            kirjaimia.setText("Kirjaimia: " + merkkeja);
            sanat.setText("Sanoja: " + sanoja);
            pisinSana.setText(String.valueOf("Pisin sana on: " + pisin));
        });

        asettelu.setCenter(tekstikentta);
        asettelu.setBottom(tekstit);

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);

        ikkuna.show();

    }

    public static void main(String[] args) {

        launch(TekstitilastointiaSovellus.class
        );
        System.out.println("Hello world!");
    }

}
