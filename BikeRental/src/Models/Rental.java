package Models;

public class Rental {
    private int rentalId;
    private int productId; // This will refer to the id of the RentalObject
    private String customerName;
    private int rentalDuration; // Duration in hours or any other relevant unit

    public Rental(int rentalId, int productId, String customerName, int rentalDuration) {
        this.rentalId = rentalId;
        this.productId = productId;
        this.customerName = customerName;
        this.rentalDuration = rentalDuration;
    }

    public int getRentalId() {
        return rentalId;
    }

    public int getProductId() {
        return productId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    @Override
    public String toString() {
        return "Rental ID: " + rentalId + ", Product ID: " + productId +
                ", Customer Name: " + customerName + ", Rental Duration: " + rentalDuration + " hours";
    }
}
