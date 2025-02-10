package dao;

import Models.RentalObject;

import java.util.List;

public interface RentalObjectDAO {
    void addRentalObject(RentalObject rentalObject);
    RentalObject getRentalObject(int id);
    List<RentalObject> getAllRentalObjects();
    void updateRentalObject(RentalObject rentalObject);
    void deleteRentalObject(int id);
}
