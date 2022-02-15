package sovellus;
 
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class SaastolaskuriSovellus extends Application {
 
    private XYChart.Series vuosiTallennus;
    private XYChart.Series korkoKayra;
 
    private int talletus;
    private double korkoA;
 
    public static void main(String[] args) {
        launch(SaastolaskuriSovellus.class);
    }
 
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        VBox box = new VBox();
        BorderPane boxPane1 = new BorderPane();
        BorderPane boxPane2 = new BorderPane();
 
        Label tallennus = new Label("Kuukausittainen tallennus");
        Slider slider1 = new Slider(25, 250, 25);
        slider1.setBlockIncrement(1);
        slider1.setMajorTickUnit(25);
        slider1.setMinorTickCount(3);
        slider1.setShowTickLabels(true);
        slider1.setSnapToTicks(true);
        slider1.setShowTickMarks(true);
        Label tallennusArvo = new Label("25.0");
        this.talletus = 25;
 
        boxPane1.setLeft(tallennus);
        boxPane1.setCenter(slider1);
        boxPane1.setRight(tallennusArvo);
 
        Label korko = new Label("Vuosittainen korko");
        Slider slider2 = new Slider(0, 10, 4);
        slider2.setValue(2);
        slider2.setMajorTickUnit(2);
        slider2.setSnapToTicks(true);
        slider2.setShowTickMarks(true);
        Label korkoArvo = new Label("2.0");
        this.korkoA = 2.0;
 
        boxPane2.setLeft(korko);
        boxPane2.setCenter(slider2);
        boxPane2.setRight(korkoArvo);
 
        box.getChildren().addAll(boxPane1, boxPane2);
        box.setSpacing(20);
 
        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        NumberAxis yAkseli = new NumberAxis();
 
        LineChart<Number, Number> chart = new LineChart<>(xAkseli, yAkseli);
        chart.setTitle("Säästölaskuri");
        chart.setLegendVisible(false);
 
        vuosiTallennus = new XYChart.Series();
        korkoKayra = new XYChart.Series();
        chart.getData().add(vuosiTallennus);
        chart.getData().add(korkoKayra);
 
        pane.setTop(box);
        pane.setCenter(chart);
        pane.setPadding(new Insets(20, 20, 20, 20));
 
        slider1.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number old, Number nev) {
                talletus = nev.intValue();
                tallennusArvo.setText("" + talletus);
 
                updateCharts();
            }
        });
 
        slider2.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number old, Number nev) {
                SaastolaskuriSovellus.this.korkoA = (double) Math.round(nev.doubleValue() * 10) / 10;
                korkoArvo.setText("" + SaastolaskuriSovellus.this.korkoA);
                updateCharts();
            }
        });
 
        updateCharts();
        stage.setScene(new Scene(pane, 740, 500));
        stage.show();
    }
 
    private void updateCharts() {
        vuosiTallennus.getData().clear();
        korkoKayra.getData().clear();
 
        int summa = 0;
        int kertyma = 0;
        vuosiTallennus.getData().add(new XYChart.Data(0, 0));        
        korkoKayra.getData().add(new XYChart.Data(0, 0));
 
        for (int i = 0; i <= 30; i++) {
            for (int j = 1; j < 13; j++) {
                summa += talletus;
                kertyma += talletus;
            }
            kertyma *= (1.0 + (korkoA / 100.0));
            korkoKayra.getData().add(new XYChart.Data(i, summa));
            vuosiTallennus.getData().add(new XYChart.Data(i, kertyma));
        }
    }
 
}
