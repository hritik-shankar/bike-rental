package dao;

import Models.Rental;

import java.util.ArrayList;
import java.util.List;

public class RentalDAOImpl implements RentalDAO {
    private final List<Rental> rentals = new ArrayList<>();
    private int currentRentalId = 0;

    @Override
    public void addRental(Rental rental) {
        rentals.add(new Rental(currentRentalId++, rental.getProductId(), rental.getCustomerName(), rental.getRentalDuration()));
    }

    @Override
    public Rental getRental(int rentalId) {
        return rentals.stream()
                .filter(r -> r.getRentalId() == rentalId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Rental> getAllRentals() {
        return new ArrayList<>(rentals);
    }

    @Override
    public void updateRental(Rental rental) {
        for (int i = 0; i < rentals.size(); i++) {
            if (rentals.get(i).getRentalId() == rental.getRentalId()) {
                rentals.set(i, rental);
                break;
            }
        }
    }

    @Override
    public void deleteRental(int rentalId) {
        rentals.removeIf(r -> r.getRentalId() == rentalId);
    }
}

