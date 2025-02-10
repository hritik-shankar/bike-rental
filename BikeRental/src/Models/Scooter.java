package Models;

import Enums.Size;

public class Scooter implements RentalObject {
    private int id;
    private String model;
    private double baseRate;

    public Scooter(int id, String model, double baseRate) {
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
