package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Ensemble Main Application
 */
public class Hello extends Application {

    // DAY, OPEN, CLOSE, HIGH, LOW, AVERAGE
    private static double[][] data = new double[][]{
            {1, 25, 20, 32, 16, 20},
            {2, 26, 30, 33, 22, 25},
            {3, 30, 38, 40, 20, 32},
            {4, 24, 30, 34, 22, 30},
            {5, 26, 36, 40, 24, 32},
            {6, 28, 38, 45, 25, 34},
            {7, 36, 30, 44, 28, 39},
            {8, 30, 18, 36, 16, 31},
            {9, 40, 50, 52, 36, 41},
            {10, 30, 34, 38, 28, 36},
            {11, 24, 12, 30, 8, 32.4},
            {12, 28, 40, 46, 25, 31.6},
            {13, 28, 18, 36, 14, 32.6},
            {14, 38, 30, 40, 26, 30.6},
            {15, 28, 33, 40, 28, 30.6},
            {16, 25, 10, 32, 6, 30.1},
            {17, 26, 30, 42, 18, 27.3},
            {18, 20, 18, 30, 10, 21.9},
            {19, 20, 10, 30, 5, 21.9},
            {20, 26, 16, 32, 10, 17.9},
            {21, 38, 40, 44, 32, 18.9},
            {22, 26, 40, 41, 12, 18.9},
            {23, 30, 18, 34, 10, 18.9},
            {24, 12, 23, 26, 12, 18.2},
            {25, 30, 40, 45, 16, 18.9},
            {26, 25, 35, 38, 20, 21.4},
            {27, 24, 12, 30, 8, 19.6},
            {28, 23, 44, 46, 15, 22.2},
            {29, 28, 18, 30, 12, 23},
            {30, 28, 18, 30, 12, 23.2},
            {31, 28, 18, 30, 12, 22}
    };

    @Override
    public void start(Stage stage) {
        stage.setTitle("AdvCandleStickChart from Ensemble");
        Scene scene = new Scene(new AdvCandleStickChart(data));
        scene.getStylesheets().add("Ensemble_AdvCandleStickChart.css");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}