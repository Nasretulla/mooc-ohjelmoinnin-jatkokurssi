package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application {

    public static void main(String[] args) {

        launch(ShanghaiSovellus.class);
    }

    public void start(Stage ikkuna) {
        NumberAxis xAkseli = new NumberAxis(2006, 2018, 2);
        NumberAxis yAkseli = new NumberAxis(0, 100, 5);

        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Helsingin yliopisto, Shanghai-ranking ");

        XYChart.Series tiedot = new XYChart.Series<>();

        tiedot.getData().add(new XYChart.Data(2007, 73));
        tiedot.getData().add(new XYChart.Data(2008, 68));
        tiedot.getData().add(new XYChart.Data(2009, 72));
        tiedot.getData().add(new XYChart.Data(2010, 72));
        tiedot.getData().add(new XYChart.Data(2011, 74));
        tiedot.getData().add(new XYChart.Data(2012, 73));
        tiedot.getData().add(new XYChart.Data(2013, 76));
        tiedot.getData().add(new XYChart.Data(2014, 73));
        tiedot.getData().add(new XYChart.Data(2015, 67));
        tiedot.getData().add(new XYChart.Data(2016, 56));
        tiedot.getData().add(new XYChart.Data(2017, 56));

        viivakaavio.getData().add(tiedot);

        Scene nakyma = new Scene(viivakaavio, 450, 450);
        ikkuna.setScene(nakyma);
        ikkuna.show();

    }

}
