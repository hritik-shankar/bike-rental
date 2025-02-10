package dao;

import Models.Bike;
import Models.Scooter;
import Models.RentalObject;

import java.util.ArrayList;
import java.util.List;

public class RentalObjectDAOImpl implements RentalObjectDAO {
    private final List<RentalObject> rentalObjects = new ArrayList<>();
    private int currentId = 0;


    @Override
    public void addRentalObject(RentalObject rentalObject) {
            rentalObjects.add(currentId++, rentalObject);
    }

    @Override
    public RentalObject getRentalObject(int id) {
        return rentalObjects.stream()
                .filter(obj -> obj.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<RentalObject> getAllRentalObjects() {
        return new ArrayList<>(rentalObjects);
    }

    @Override
    public void updateRentalObject(RentalObject rentalObject) {
        for (int i = 0; i < rentalObjects.size(); i++) {
            if (rentalObjects.get(i).getId() == rentalObject.getId()) {
                rentalObjects.set(i, rentalObject);
                break;
            }
        }
    }

    @Override
    public void deleteRentalObject(int id) {
        rentalObjects.removeIf(obj -> obj.getId() == id);
    }
}

