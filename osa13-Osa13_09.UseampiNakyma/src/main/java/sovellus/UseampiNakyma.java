package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

    public void start(Stage ikkuna) {

        Button ekaButton = new Button("Ekaan näkymään!");
        Button tokaButton = new Button("Tokaan näkymään!");
        Button kolmasButton = new Button("Kolmanteen näkymään!");

        BorderPane ekaLayout = new BorderPane();
        ekaLayout.setTop(new Label("Eka näkymä!"));

        VBox tokaLayout = new VBox(new Label("Tokaan näkymään!"));
        tokaLayout.getChildren().addAll(kolmasButton, new Label("Toka näkymä!"));

        GridPane kolmasLayout = new GridPane();
        kolmasLayout.add(ekaButton, 1, 1);
        kolmasLayout.add(new Label("Kolmas näkymä!"), 0, 0);

        Scene ekaScene = new Scene(ekaLayout);
        Scene tokaScene = new Scene(tokaLayout);
        Scene kolmasScene = new Scene(kolmasLayout);

        ekaButton.setOnAction((event) -> {

            ikkuna.setScene(ekaScene);

        });

        tokaButton.setOnAction((event) -> {
            ikkuna.setScene(tokaScene);

        });

        kolmasButton.setOnAction((event) -> {
            ikkuna.setScene(kolmasScene);

        });

        ikkuna.setScene(ekaScene);
        ikkuna.show();

    }

    public static void main(String[] args) {

        launch(UseampiNakyma.class);

    }

}
