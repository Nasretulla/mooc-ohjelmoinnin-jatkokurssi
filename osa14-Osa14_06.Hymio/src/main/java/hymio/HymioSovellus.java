package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;


public class HymioSovellus extends Application {


    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();
        Canvas piirtoalusta = new Canvas(400, 400);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();
        
        asettelu.setCenter(piirtoalusta);
        piirturi.setFill(Color.BLACK);
        
      
        
        
        piirturi.fillRect(100, 50, 50, 50);
        piirturi.fillRect(250, 50, 50, 50);
        piirturi.fillRect(100, 250, 200, 50);
        piirturi.fillRect(50, 200, 50, 50);
        piirturi.fillRect(300, 200, 50, 50);
        
        
        Scene nakyma = new Scene(asettelu);


        
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
        
        
        
    }

}