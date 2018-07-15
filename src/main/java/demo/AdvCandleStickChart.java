package demo;

import javafx.collections.ObservableList;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

import static demo.Apply.apply;
import static javafx.collections.FXCollections.observableArrayList;

public class AdvCandleStickChart extends Pane {


    public AdvCandleStickChart(double[][] data) {
        final NumberAxis xAxis = apply(new NumberAxis(0, 32, 1), self -> {
            self.setMinorTickCount(0);
            self.setLabel("Day");
        });

        final NumberAxis yAxis = apply(new NumberAxis(), self -> {
            self.setLabel("Price");
            self.setForceZeroInRange(false);
        });

        final CandleStickChart chart = apply(new CandleStickChart(xAxis, yAxis, convertData(data)), self -> {
            self.setTitle("Custom Candle Stick Chart");
        });

        getChildren().add(chart);
    }

    @SuppressWarnings("unchecked")
    private static ObservableList<XYChart.Series<Number, Number>> convertData(double[][] data) {
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        for (double[] day : data) {
            series.getData().add(
                    new XYChart.Data<>(day[0], day[1], new CandleStickExtraValues(day[2], day[3], day[4], day[5]))
            );
        }
        return observableArrayList(series);
    }

}





