package dao;

import Models.Rental;

import java.util.List;

public interface RentalDAO {
    void addRental(Rental rental);
    Rental getRental(int rentalId);
    List<Rental> getAllRentals();
    void updateRental(Rental rental);
    void deleteRental(int rentalId);
}
