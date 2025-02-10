package Models;

import Enums.Size;

public class Bike implements RentalObject {
    private final int id;
    private final String model;
    private final double baseRate;

    public Bike(int id, String model, double baseRate) {
        this.id = id;
        this.model = model;
        this.baseRate = baseRate;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getBaseRate() {
        return baseRate;
    }
}
