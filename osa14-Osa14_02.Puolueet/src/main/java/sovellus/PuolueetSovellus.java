package sovellus;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueetSovellus extends Application {

    public static void main(String[] args) {
        launch(PuolueetSovellus.class);

    }

    public void start(Stage ikkuna) {
        NumberAxis xAkseli = new NumberAxis(1968, 2008, 1);
        NumberAxis yAkseli = new NumberAxis();

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);

        ArrayList<String> data = new ArrayList<>();
        try (Scanner lukija = new Scanner(new File("puoluedata.tsv"))) {
            while (lukija.hasNextLine()) {
                data.add(lukija.nextLine());

            }
        } catch (Exception e) {

        }

        HashMap<String, HashMap<Integer, Double>> puolueet = new HashMap<>();

        String[] puolueVuosi = data.get(0).split("\t");

        for (int i = 1; i < data.size(); i++) {
            String[] rivipala = data.get(i).split("\t");
            HashMap<Integer, Double> puolueKannatus = new HashMap<>();
            for (int k = 1; k < puolueVuosi.length; k++) {
                if (!(rivipala[k].equals("-"))) {
                    puolueKannatus.put(Integer.valueOf(puolueVuosi[k]), Double.valueOf(rivipala[k]));

                }
            }
            puolueet.put(rivipala[0], puolueKannatus);

        }

        puolueet.keySet().stream().forEach(puolue -> {
            XYChart.Series xyTiedot = new XYChart.Series();
            xyTiedot.setName(puolue);
            puolueet.get(puolue).entrySet().stream().forEach(pari -> {
                xyTiedot.getData().add(new XYChart.Data(pari.getKey(), pari.getValue()));

            });

            viivakaavio.getData().add(xyTiedot);

        });

        Scene nakyma = new Scene(viivakaavio);
        ikkuna.setScene(nakyma);
        ikkuna.show();

    }

}
