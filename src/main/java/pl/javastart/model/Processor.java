package pl.javastart.model;

import pl.javastart.utils.Overclockable;

public class Processor extends Component implements Overclockable {
    private int clockFrequency;
    private double temperature;
    private double maxTemperature;

    public Processor(String model, String producent, String serialNumber, int clockFrequency, double maxTemperature, double temperature) {
        super(model, producent, serialNumber);
        this.clockFrequency = clockFrequency;
        this.maxTemperature = maxTemperature;
        setTemperature(temperature);
    }

    public int getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(int clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        checkTemperatureLimit();
        this.temperature = temperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    @Override
    public double getTempNeededForGivenClockFrequency(int clockFrequency) {
        return (double) clockFrequency / 10;
    }

    @Override
    public double getClockFrequencyNeededForTempGiven(double temperature) {
        return temperature * 10;
    }
}
