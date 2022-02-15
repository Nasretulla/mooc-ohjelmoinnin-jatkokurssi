package otsikko;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application.Parameters;


public class KayttajanOtsikko extends Application {
    
    public void start(Stage ikkuna){
       
        Parameters params = getParameters();
        
        ikkuna.setTitle(params.getNamed().get("boo"));
        ikkuna.show();
    }


}
