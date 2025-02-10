package Service;
import Enums.RentalObjectEnum;
import Models.Bike;
import Models.Rental;
import Models.RentalObject;
import Models.Scooter;
import dao.*;


public class RentalService {

    RentalDAOImpl rentalDAO = new RentalDAOImpl();
    RentalObjectService rentalObjectService;
    public RentalService(RentalObjectService rentalObjectService){
        this.rentalObjectService =  rentalObjectService;
    }

    public void createRental(final Integer renaltId, final Integer productId, final String customerName, final Integer rentalDuration){
        Rental rental = new Rental(0, productId, customerName, rentalDuration);
        rentalDAO.addRental(rental);
    }

    public void getRentalDetails(final Integer renalId){
        Rental rental = rentalDAO.getRental(renalId);

        System.out.println("Renal ID : " + rental.getRentalId());
        System.out.println("Renal Duration : " + rental.getRentalDuration());
        System.out.println("Renal customer name : " + rental.getCustomerName());
    }

    public void getFees(final Integer renalId){
        Rental rental = rentalDAO.getRental(renalId);
        RentalObject rentalObject = rentalObjectService.getRentalObject(rental.getProductId());

        System.out.println("RENT IS " + rental.getRentalDuration() * rentalObject.getBaseRate() );
    }


//        RentalObjectDAO objectDAO = new RentalObjectDAOImpl();
//        RentalDAO rentalDAO = new RentalDAOImpl();
//
//        // Dynamically create rental objects using the factory
//        RentalObject bike = RentalObjectFactory.createRentalObject("bike", "Mountain Bike", 10.0);
//        RentalObject scooter = RentalObjectFactory.createRentalObject("scooter", "Electric Scooter", 15.0);
//
//        // Adding rental objects to DAO
//        objectDAO.addRentalObject(bike);
//        objectDAO.addRentalObject(scooter);
//
//        // Adding rentals
//        Rental bikeRental = new Rental(0, bike.getId(), "Alice", 2); // Renting Bike with ID for 2 hours
//        Rental scooterRental = new Rental(0, scooter.getId(), "Bob", 3); // Renting Scooter with ID for 3 hours
//
//        rentalDAO.addRental(bikeRental);
//        rentalDAO.addRental(scooterRental);
//
//        // Display all rentals
//        System.out.println("All Rentals:");
//        for (Rental r : rentalDAO.getAllRentals()) {
//            System.out.println(r);
//        }
//
//        // Example of updating and deleting a rental
//        bikeRental = new Rental(bikeRental.getRentalId(), bikeRental.getProductId(), "Alice", 4); // Update duration to 4 hours
//        rentalDAO.updateRental(bikeRental);
//
//        System.out.println("\nUpdated Rentals:");
//        for (Rental r : rentalDAO.getAllRentals()) {
//            System.out.println(r);
//        }
//
//        // Delete a rental
//        rentalDAO.deleteRental(scooterRental.getRentalId());
//
//        System.out.println("\nRentals after deletion:");
//        for (Rental r : rentalDAO.getAllRentals()) {
//            System.out.println(r);
//        }
}