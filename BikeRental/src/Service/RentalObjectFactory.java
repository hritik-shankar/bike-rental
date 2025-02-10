package Service;

import Models.Bike;
import Models.RentalObject;
import Models.Scooter;

public class RentalObjectFactory {
    public static RentalObject createRentalObject(String type, String model, double baseRate) {
        switch (type.toLowerCase()) {
            case "bike":
                return new Bike(0, model, baseRate); // ID will be set by DAO
            case "scooter":
                return new Scooter(0, model, baseRate); // ID will be set by DAO
            default:
                throw new IllegalArgumentException("Unknown rental object type: " + type);
        }
    }
}
