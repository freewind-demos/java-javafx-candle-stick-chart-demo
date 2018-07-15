package demo;

/**
 * Data extra values for storing close, high and low.
 */
class CandleStickExtraValues {

    private final double close;
    private final double high;
    private final double low;
    private final double average;

    public CandleStickExtraValues(double close, double high, double low, double average) {
        this.close = close;
        this.high = high;
        this.low = low;
        this.average = average;
    }

    public double getClose() {
        return close;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public double getAverage() {
        return average;
    }
}
