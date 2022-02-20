package creational.builder;

import lombok.Getter;

public class Engine {

    @Getter
    private final double volume;
    @Getter
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

}
