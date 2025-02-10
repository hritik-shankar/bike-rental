package Service;

import Enums.RentalObjectEnum;
import Models.Rental;
import Models.RentalObject;
import dao.RentalObjectDAOImpl;

import java.util.Objects;

public class RentalObjectService {
    RentalObjectDAOImpl rentalObjectDAO;

    public RentalObjectService(){
        rentalObjectDAO = new RentalObjectDAOImpl();
    }

    public void createRentalObject(RentalObjectEnum rentalObjectEnum, String model, Double baseRate) {
        RentalObject rentalObject1 = null;
        switch (rentalObjectEnum) {
            case BIKE:
                rentalObject1 = RentalObjectFactory.createRentalObject("bike", model, baseRate);
            case SCOOTER:
                rentalObject1 = RentalObjectFactory.createRentalObject("scooter", model, baseRate);

        }
        rentalObjectDAO.addRentalObject(rentalObject1);

        System.out.println("Rental object created with : " + rentalObject1.getId());
    }

    public RentalObject getRentalObject(Integer rentalObjectId){
        RentalObject r1 = rentalObjectDAO.getRentalObject(rentalObjectId);

        if(Objects.nonNull(r1)){
            System.out.println("Model : " + r1.getModel());
            System.out.println("Price : " + r1.getBaseRate());
            System.out.println("ID : " + r1.getId());
        }

        return r1;
    }
}
