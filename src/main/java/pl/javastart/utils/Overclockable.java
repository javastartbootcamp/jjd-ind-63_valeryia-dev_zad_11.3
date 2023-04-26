package pl.javastart.utils;

import pl.javastart.exception.TemperatureLimitException;

public interface Overclockable {
    double getTemperature();

    double getMaxTemperature();

    int getClockFrequency();

    void setClockFrequency(int clockFrequency);

    void setTemperature(double temperature);

    default void overclock(int clockFrequencyToAdd) {
        setTemperature(getTemperature() +  getTempNeededForGivenClockFrequency(clockFrequencyToAdd));
        double diff = getTemperature() - getMaxTemperature();
        try {
            checkTemperatureLimit();
        } catch (TemperatureLimitException e) {
            System.err.println("Limit temperatury przekroczony, więc zostało dodano tylko " + getClockFrequencyNeededForTempGiven(diff) + " taktowania");
        }
        if (getMaxTemperature() > getMaxTemperature()) {
            setClockFrequency((int) (getClockFrequency() + getClockFrequencyNeededForTempGiven(diff)));
        } else {
            setClockFrequency(getClockFrequency() + clockFrequencyToAdd);
        }
    }

    default void checkTemperatureLimit() {
        if (isLimitExceeded()) {
            throw new TemperatureLimitException("Limit temperatury przekroczony");
        }
    }

    private boolean isLimitExceeded() {
        return getTemperature() > getMaxTemperature();
    }

    double getTempNeededForGivenClockFrequency(int clockFrequencyToAdd);

    double getClockFrequencyNeededForTempGiven(double temperature);
}
