public class CarRentalSystem {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; // Fixed rental price per day

    // Default Constructor
    public CarRentalSystem() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized Constructor
    public CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Copy Constructor
    public CarRentalSystem(CarRentalSystem other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Default Rental
        CarRentalSystem rental1 = new CarRentalSystem();
        System.out.println("Default Rental:");
        rental1.displayRentalDetails();

        // Custom Rental
        CarRentalSystem rental2 = new CarRentalSystem("John Doe", "Toyota Camry", 5);
        System.out.println("Custom Rental:");
        rental2.displayRentalDetails();

        // Copying an existing rental
        CarRentalSystem rental3 = new CarRentalSystem(rental2);
        System.out.println("Copied Rental:");
        rental3.displayRentalDetails();
    }
}
