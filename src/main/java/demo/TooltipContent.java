package demo;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import static demo.Apply.apply;

public class TooltipContent extends GridPane {

    private Label openValue = new Label();
    private Label closeValue = new Label();
    private Label highValue = new Label();
    private Label lowValue = new Label();

    public TooltipContent() {
        Label open = apply(new Label("OPEN:"), self -> {
            self.getStyleClass().add("candlestick-tooltip-label");
        });

        Label close = apply(new Label("CLOSE:"), self -> {
            self.getStyleClass().add("candlestick-tooltip-label");
        });

        Label high = apply(new Label("HIGH:"), self -> {
            self.getStyleClass().add("candlestick-tooltip-label");
        });

        Label low = apply(new Label("LOW:"), self -> {
            self.getStyleClass().add("candlestick-tooltip-label");
        });

        {
            setConstraints(open, 0, 0);
            setConstraints(openValue, 1, 0);
            setConstraints(close, 0, 1);
            setConstraints(closeValue, 1, 1);
            setConstraints(high, 0, 2);
            setConstraints(highValue, 1, 2);
            setConstraints(low, 0, 3);
            setConstraints(lowValue, 1, 3);
        }

        getChildren().addAll(open, openValue, close, closeValue, high, highValue, low, lowValue);
    }

    public void update(double open, double close, double high, double low) {
        openValue.setText(Double.toString(open));
        closeValue.setText(Double.toString(close));
        highValue.setText(Double.toString(high));
        lowValue.setText(Double.toString(low));
    }
}
