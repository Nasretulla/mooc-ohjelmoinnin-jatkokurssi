package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneSovellus extends Application {

    public void start(Stage ikkuna) {

        BorderPane asettelu = new BorderPane();

        asettelu.setTop(new Label("NORTH"));
        asettelu.setBottom(new Label("SOUTH"));
        asettelu.setRight(new Label("EAST"));

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();

    }

    public static void main(String[] args) {

        launch(BorderPaneSovellus.class);
        System.out.println("Hello world!");
    }

}
