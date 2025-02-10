import Enums.RentalObjectEnum;
import Service.RentalObjectService;
import Service.RentalService;

public class Main {
    public static void main(String[] args) {

        RentalObjectService rentalObjectService = new RentalObjectService();
        RentalService rentalService = new RentalService(rentalObjectService);

        rentalObjectService.createRentalObject(RentalObjectEnum.BIKE, "Mountain Bike", 10.0);
        rentalObjectService.getRentalObject(0);

        rentalService.createRental(0, 0, "Hritik", 2);
        rentalService.getRentalDetails(0);

        System.out.println("*****************");

        rentalService.getFees(0);
    }
}