package sovellukseni;

import javafx.application.Application;
import javafx.stage.Stage;

public class Sovellukseni extends Application {

    public void start(Stage ikkuna) {
        ikkuna.setTitle("Sovellukseni");
        ikkuna.show();

    }

    public static void main(String[] args) {
        launch(Sovellukseni.class);
        System.out.println("Hello world!");

    }

}
