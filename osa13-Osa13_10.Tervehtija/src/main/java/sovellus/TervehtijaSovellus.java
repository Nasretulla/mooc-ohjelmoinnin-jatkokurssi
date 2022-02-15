package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application {

    public void start(Stage ikkuna) {

        Label ohjeteksti = new Label("Kirjoita nimesi ja aloita.");
        TextField nimiKentta = new TextField();
        Button nappain = new Button("Aloita");

        GridPane asettelu = new GridPane();

        asettelu.add(ohjeteksti, 0, 0);
        asettelu.add(nimiKentta, 0, 1);
        asettelu.add(nappain, 0, 2);

        asettelu.setPrefSize(300, 180);
        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(20, 20, 20, 20));

        Scene nimiNakyma = new Scene(asettelu);

        StackPane tervetuloaAsettelu = new StackPane();
        tervetuloaAsettelu.setPrefSize(300, 180);
        tervetuloaAsettelu.setAlignment(Pos.CENTER);

        Scene tervetuloaNakyma = new Scene(tervetuloaAsettelu);

        nappain.setOnAction((event) -> {
            Label tervetuloa = new Label("Tervetuloa " + nimiKentta.getText() + "!");
            tervetuloaAsettelu.getChildren().add(tervetuloa);
            ikkuna.setScene(tervetuloaNakyma);

        });

        ikkuna.setScene(nimiNakyma);
        ikkuna.show();

    }

    public static void main(String[] args) {
        launch(TervehtijaSovellus.class);
    }
}
